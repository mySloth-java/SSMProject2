package com.cg.Service;

import com.cg.Dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//服务层由spring管理
@Service
public class TestSer {
    @Autowired
    TestMapper testMapper;


}
