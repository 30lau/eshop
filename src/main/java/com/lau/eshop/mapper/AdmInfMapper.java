package com.lau.eshop.mapper;

import com.lau.eshop.entity.AdmInf;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmInfMapper {
    int deleteByPrimaryKey(String admInfId);

    int insert(AdmInf record);

    int insertSelective(AdmInf record);

    AdmInf selectByPrimaryKey(String admInfId);

    int updateByPrimaryKeySelective(AdmInf record);

    int updateByPrimaryKey(AdmInf record);
}