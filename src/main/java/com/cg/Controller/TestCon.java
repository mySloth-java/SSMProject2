package com.cg.Controller;

import com.cg.Dao.TestMapper;
import com.cg.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//控制层由MVC管理
@Controller
public class TestCon {
    @Autowired
    TestMapper testMapper;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getNameEmp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取登录的信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<employee> nameEmp = testMapper.getNameEmp(username,password);
        System.out.println(nameEmp);
        //给予登录反馈
        if (nameEmp.isEmpty()){
            response.getWriter().write("登录失败");
            return "ServiceIndex";
        }else {
            return "LoginSuccess";
        }



    }

}
