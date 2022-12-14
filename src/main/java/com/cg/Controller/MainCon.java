package com.cg.Controller;

import com.cg.Dao.TestMapper;
import com.cg.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class MainCon {
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
    public String AddEmp(employee employee){
        mapper.AddEmp(employee);
        return "redirect:/SelectEmp";
    }

    //修改员工表第一步，通过Select中的链接跳转到此方法，由此方法返回到Update页面中
    @RequestMapping(value = "/toUpdate/{empID}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("empID") Integer empID,Model model){
        employee idEmp = mapper.getIdEmp(empID);
        model.addAttribute("idEmp",idEmp);
        return "empToUpdate";
    }

    //修改员工第二步
    @RequestMapping(value = "/UpdateEmp",method =RequestMethod.PUT)
    public String UpdateEmp(employee employee){
        mapper.UpdateEmp(employee.getEmpID());
        return "redirect:/SelectEmp";
    }

    //删除员工，绑定vue事件
    @RequestMapping(value = "/toDelete/{empID}")
    public String DeleteEmp(@PathVariable("empID") Integer empID){
        mapper.DeleteEmp(empID);
        return "redirect:/SelectEmp";
    }

    @RequestMapping(value = "/about")
    public String about(){
        return "aboutService";
    }

}
