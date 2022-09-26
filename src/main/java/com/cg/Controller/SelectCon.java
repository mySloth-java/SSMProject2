package com.cg.Controller;

import com.cg.Dao.TestMapper;
import com.cg.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String AddEmp(employee emp){
        //获取填入的信息
//        System.out.println(emp.getEmpID()+" "+empName+" "+age+" "+sex+" "+email);

        //排错故障，mapper方法没有执行，报空指针

        mapper.AddEmp(emp.getEmpID(),emp.getEmpName(),emp.getAge(),emp.getSex(),emp.getEmail());
        return "TestHTML/empSelect";
    }

    @RequestMapping(value = "/UpdateEmp/{empID}",method = RequestMethod.GET)
    public String UpdateEmp(@PathVariable("empID") Integer empID,Model model){
        int i = mapper.UpdateEmp(empID);

        return "";
    }

    @RequestMapping(value = "/DeleteEmp",method = RequestMethod.POST)
    public String DeleteEmp(){
        return "";
    }

}
