package com.cg.Dao;

import com.cg.pojo.employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {
    List<employee> getAll();

    employee getIdEmp(@Param("empID") Integer empID);

    List<employee> getNameEmp(@Param("logname") String logname,@Param("logword") String logword);

    void AddEmp(employee employee);

    int UpdateEmp(@Param("empID") Integer empID);

    int DeleteEmp(@Param("empId") int empId);
}
