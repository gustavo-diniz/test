package br.com.fiveware.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppSpringConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * 
	 * Nesse método retornamos a classe que contém as configurações que estavam
	 * no arquivo dispatcher-servlet.xml do projeto anterior configurado com
	 * XMLs!
	 * 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { AppSpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
