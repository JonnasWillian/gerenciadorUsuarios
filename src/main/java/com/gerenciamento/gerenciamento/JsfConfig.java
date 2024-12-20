package com.gerenciamento.gerenciamento;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jakarta.faces.webapp.FacesServlet;

@Configuration
public class JsfConfig {

    @Bean
    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
        ServletRegistrationBean<FacesServlet> srb = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
        srb.setLoadOnStartup(1);
        return srb;
    }
}