package com.lau.eshop.mapper;

import com.lau.eshop.entity.AdvInf;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvInfMapper {
    int deleteByPrimaryKey(String advInfId);

    int insert(AdvInf record);

    int insertSelective(AdvInf record);

    AdvInf selectByPrimaryKey(String advInfId);

    int updateByPrimaryKeySelective(AdvInf record);

    int updateByPrimaryKey(AdvInf record);
}