package com.lau.eshop.mapper;

import com.lau.eshop.entity.MalPro;
import org.springframework.stereotype.Repository;

@Repository
public interface MalProMapper {
    int deleteByPrimaryKey(String malProId);

    int insert(MalPro record);

    int insertSelective(MalPro record);

    MalPro selectByPrimaryKey(String malProId);

    int updateByPrimaryKeySelective(MalPro record);

    int updateByPrimaryKey(MalPro record);
}