package com.lau.eshop.mapper;

import com.lau.eshop.entity.AdmChk;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmChkMapper {
    int deleteByPrimaryKey(String salInfId);

    int insert(AdmChk record);

    int insertSelective(AdmChk record);

    AdmChk selectByPrimaryKey(String salInfId);

    int updateByPrimaryKeySelective(AdmChk record);

    int updateByPrimaryKey(AdmChk record);
}