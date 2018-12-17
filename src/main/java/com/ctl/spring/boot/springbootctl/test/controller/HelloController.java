package com.ctl.spring.boot.springbootctl.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: HellorController</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 *
 * @author guolin
 * @version 1.0
 * @date 2018-12-17 11:21
 */
@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String index() {
        logger.info("rquest /hello");
        return "Hello World";
    }
    @RequestMapping("/hello2")
    @ResponseBody
    public Map<String,Object>  hello2() {
        logger.info("rquest /hello2");
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("name","ctl");
        return returnMap;
    }
}