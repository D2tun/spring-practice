package app2.test.springMVC.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@Configuration
@ComponentScan("app2.test.springMVC.controller")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {
	
	private final ApplicationContext appContext;
	
	@Autowired
	public SpringConfig(ApplicationContext appContext) {
		this.appContext = appContext;
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine());
		registry.viewResolver(resolver);
	}
	
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver srtr = new SpringResourceTemplateResolver();
		srtr.setApplicationContext(this.appContext);
		srtr.setPrefix("/WEB-INF/views/");
		srtr.setSuffix(".html");
		return srtr;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine ste = new SpringTemplateEngine();
		ste.setTemplateResolver(templateResolver());
		ste.setEnableSpringELCompiler(true);
		return ste;
	}

}
