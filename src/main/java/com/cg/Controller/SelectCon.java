package com.cg.Controller;

import com.cg.Dao.TestMapper;
import com.cg.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.ValidationEvent;
import java.util.List;
@Controller
public class SelectCon {
    @Autowired
    TestMapper mapper;

    @RequestMapping(value = "/SelectEmp",method = RequestMethod.GET)
    public String SelectEmp(Model model){
        //调取查询方法，设置共享域
        List<employee> list = mapper.getAll();
        model.addAttribute("allEmp", list);
        return "empSelect";
    }

    //添加功能仅跳转，在控制器内
    @RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    public String AddEmp(HttpServletRequest request){
        //获取填入的信息
        String empID = request.getParameter("empID");
        int id = Integer.parseInt(empID);
        String empName = request.getParameter("empName");
        String age = request.getParameter("age");
        Integer integer = Integer.getInteger(age);
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");


        mapper.AddEmp(id,empName,integer,sex,email);
        return "redirect:empSelect";
    }

}
