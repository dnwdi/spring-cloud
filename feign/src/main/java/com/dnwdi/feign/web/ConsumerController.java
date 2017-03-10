package com.dnwdi.feign.web;

import com.dnwdi.feign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzyanyaqiang on 17-3-9.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;
    @RequestMapping("/add")
    public Integer add() {
        return computeClient.add(10, 20);
    }
}
