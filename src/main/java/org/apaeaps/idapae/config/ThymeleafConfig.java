//package org.apaeaps.idapae.config;
//
//import java.util.Locale;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.i18n.FixedLocaleResolver;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring4.view.ThymeleafView;
//import org.thymeleaf.spring4.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ITemplateResolver;
//
///**
// * Created by deyve on 04/06/17.
// */
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages="br.com.tuxlinux.alura")
//public class ThymeleafConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
//
//    private static final String UTF8 = "UTF-8";
//
//    private ApplicationContext applicationContext;
//
//    public void setApplicationContext(ApplicationContext applicationContext) {
//        this.applicationContext = applicationContext;
//    }
//
//    @Bean
//    public ViewResolver viewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        // resolver.setCharacterEncoding(UTF8);
//        return resolver;
//    }
//
//    @Bean
//    public TemplateEngine templateEngine() {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        // engine.setEnableSpringELCompiler(true);
//        engine.setTemplateResolver(templateResolver());
//        return engine;
//    }
//
//    private ITemplateResolver templateResolver() {
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(applicationContext);
//        resolver.setSuffix(".html");
//        resolver.setPrefix("/templates/");
//        resolver.setTemplateMode(TemplateMode.HTML);
//        resolver.setCharacterEncoding(UTF8);
//        return resolver;
//    }
//    
//    @Bean(name="layout-padrao")
//	@Scope("prototype")
//	public ThymeleafView someViewBean() {
//	    ThymeleafView view = new ThymeleafView("index"); // templateName = 'index'
//	    view.setMarkupSelector("conteudo");
//	    return view;
//	}
//    
//    @Bean
//	public LocaleResolver localeResolver() {
//		return new FixedLocaleResolver(new Locale("pt", "BR"));
//	}
//}