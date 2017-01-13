package br.com.fiveware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "br.com.fiveware" })
public class AppSpringWebConfig extends WebMvcConfigurerAdapter {

	/**
	 * Substitui o seguinte trecho:
	 * 
	 * <bean id="jspViewResolver"
	 * class="org.springframework.web.servlet.view.InternalResourceViewResolver"
	 * p:prefix="/WEB-INF/view/"
	 * p:suffix=".jsp" />
	 * 
	 * @return o view resolver
	 */
	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 registry.addResourceHandler("/resources/**")
		 		 .addResourceLocations("/resources/");
     ;
	}
	
}
