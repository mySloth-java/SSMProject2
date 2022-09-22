package com.cg.Dao;

import com.cg.pojo.employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<employee> getAll();
}
