package com.nanjiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 南江
 * @Description: ${todo}
 * @date 2019/12/2 21:33
 */
@Controller
public class SpringBootTestOneController {

    @RequestMapping("/StringBootTestOne")
    @ResponseBody
    public String StringBootTestOne(){
        return "hello Nanjiang";
    }
}
