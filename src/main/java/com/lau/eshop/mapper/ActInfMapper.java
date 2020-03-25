package com.lau.eshop.mapper;

import com.lau.eshop.entity.ActInf;
import org.springframework.stereotype.Repository;

@Repository
public interface ActInfMapper {
    int deleteByPrimaryKey(String actInfId);

    int insert(ActInf record);

    int insertSelective(ActInf record);

    ActInf selectByPrimaryKey(String actInfId);

    int updateByPrimaryKeySelective(ActInf record);

    int updateByPrimaryKey(ActInf record);
}