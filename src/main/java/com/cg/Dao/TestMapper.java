package com.cg.Dao;

import com.cg.pojo.employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {
    List<employee> getAll();

    List<employee> getNameEmp(@Param("logname") String logname,@Param("logword") String logword);

    void AddEmp(employee employee);

    void UpdateEmp(employee employee);

    int DeleteEmp(@Param("empId") int empId);
}
