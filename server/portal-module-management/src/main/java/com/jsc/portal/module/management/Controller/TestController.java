package com.jsc.portal.module.management.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class TestController {

    /**
     * 获取当前时间
     * @return
     */
    @GetMapping("/getDate")
    public static String getCurDate()
    {
        Date d = new Date();
        return "This is Management: " + d ;
    }
}