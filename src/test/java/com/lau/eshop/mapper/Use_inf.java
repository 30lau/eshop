package com.lau.eshop.mapper;

import com.lau.eshop.entity.UseInf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.lau.eshop.mapper")
@SpringBootTest
public class Use_inf {
    @Autowired
    UseInfMapper useInfMapper;
    @Test
    public void test(){
        UseInf useInf = useInfMapper.selectByPrimaryKey("15521211427");
        useInf.
    }
}
