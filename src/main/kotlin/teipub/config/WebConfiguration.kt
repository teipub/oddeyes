package teipub.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver

/**
 * Created by tei on 2016-09-23.
 * teipub.io
 */
//@Configuration
class WebConfiguration {
    @Bean
    fun configurer(): ScriptTemplateConfigurer {
        val configurer = ScriptTemplateConfigurer()
        configurer.engineName = "nashorn"
        configurer.setScripts("/static/js/mustache.min.js", "/static/js/render.js")
        configurer.setRenderFunction("render")
        return configurer
    }

    @Bean
    fun handlebarsViewResolver(): ViewResolver {
//        HandlerB

        return null!!
    }

    @Bean
    fun viewResolver(): ViewResolver {
        val viewResolver = ScriptTemplateViewResolver()
        viewResolver.setPrefix("/templates/")
        viewResolver.setSuffix(".hbs")
        return viewResolver
    }
}