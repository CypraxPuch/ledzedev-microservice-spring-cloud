package com.ledzedev.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 16/Nov/2016.
 */
@RefreshScope
@RestController
public class MessageRestController {

    @Value("${message}")
    private String msg;

    @RequestMapping("/message")
    String message(){return this.msg;}
}
