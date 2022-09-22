package com.cg.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制层由MVC管理
@Controller
public class TestCon {

    @RequestMapping(value = "/index")
    public String ServiceIndex(){
        System.out.println("测试成功");
        return "empSelect";
    }

}
