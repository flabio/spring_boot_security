package com.app.SpringSecurityApp;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configurable

@PropertySources({
        @PropertySource("classpath:messages.properties"),
   })
public class AppConfig {

}
