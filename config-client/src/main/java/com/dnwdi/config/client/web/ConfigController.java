package com.dnwdi.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzyanyaqiang on 17-3-10.
 */
@RefreshScope
@RestController
public class ConfigController {
    @Value("${from}")
    private String from;
    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
}
