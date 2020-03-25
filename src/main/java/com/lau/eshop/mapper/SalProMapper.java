package com.lau.eshop.mapper;

import com.lau.eshop.entity.SalPro;
import org.springframework.stereotype.Repository;

@Repository
public interface SalProMapper {
    int deleteByPrimaryKey(String salProId);

    int insert(SalPro record);

    int insertSelective(SalPro record);

    SalPro selectByPrimaryKey(String salProId);

    int updateByPrimaryKeySelective(SalPro record);

    int updateByPrimaryKey(SalPro record);
}