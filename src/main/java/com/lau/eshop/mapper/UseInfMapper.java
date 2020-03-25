package com.lau.eshop.mapper;

import com.lau.eshop.entity.UseInf;
import org.springframework.stereotype.Repository;

@Repository
public interface UseInfMapper {
    int deleteByPrimaryKey(String useInfId);

    int insert(UseInf record);

    int insertSelective(UseInf record);

    UseInf selectByPrimaryKey(String useInfId);

    int updateByPrimaryKeySelective(UseInf record);

    int updateByPrimaryKey(UseInf record);
}