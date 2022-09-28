package com.cg.Dao;

import com.cg.pojo.employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {
    //查找所有
    List<employee> getAll();

    //根据id查找
    List<employee> getIdEmp(@Param("empID") Integer empID);

    //查找匹配的用户登录
    List<employee> getNameEmp(@Param("logname") String logname,@Param("logword") String logword);

    //添加
    void AddEmp(employee employee);

    //修改
    void UpdateEmp(employee employee);

    int DeleteEmp(@Param("empId") int empId);
}
