package com.tech.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xxx_xx
 * @date 2018/5/8
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "/table")
    public void process(@RequestParam(value = "name") String name) {
        System.out.println("接受到请求");
        System.out.println(name);
    }
}
