package com.lau.eshop.mapper;

import com.lau.eshop.entity.SalInf;
import org.springframework.stereotype.Repository;

@Repository
public interface SalInfMapper {
    int deleteByPrimaryKey(String salInfId);

    int insert(SalInf record);

    int insertSelective(SalInf record);

    SalInf selectByPrimaryKey(String salInfId);

    int updateByPrimaryKeySelective(SalInf record);

    int updateByPrimaryKey(SalInf record);
}