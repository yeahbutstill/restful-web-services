package com.yeahbutstill.restfulwebservices.controller;

import com.yeahbutstill.restfulwebservices.beans.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    // GET
    // URI - /hello-world
    // method - "Hello World"
    @GetMapping(path = "/hello-world")

    public String helloWorld() {
        return "Hello World";
    }

    // hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    // hello-world/path-vriable/yeahbutstill
    @GetMapping(path = "/hello-world/path-vriable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

//    @GetMapping("/hello-world-i18n")
//    public String helloWorldInternationalized(@RequestHeader(value = "Accept-Language", required = false)
//                                                      Locale locale) {
//        return messageSource.getMessage("good.morning.message", null, "Default", locale);
////        return "Hello World";
//
//        // en = Hello World
//        // nl = Goede Morgen
//        // fr = Bonjour
//    }

    @GetMapping("/hello-world-i18n")
    public String helloWorldInternationalized() {
        return messageSource.getMessage("good.morning.message", null, "Default Message", LocaleContextHolder.getLocale());
    }

}
