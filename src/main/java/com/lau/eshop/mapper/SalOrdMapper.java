package com.lau.eshop.mapper;

import com.lau.eshop.entity.SalOrd;
import org.springframework.stereotype.Repository;

@Repository
public interface SalOrdMapper {
    int deleteByPrimaryKey(String salOrdId);

    int insert(SalOrd record);

    int insertSelective(SalOrd record);

    SalOrd selectByPrimaryKey(String salOrdId);

    int updateByPrimaryKeySelective(SalOrd record);

    int updateByPrimaryKey(SalOrd record);
}