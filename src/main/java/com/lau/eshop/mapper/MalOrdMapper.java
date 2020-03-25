package com.lau.eshop.mapper;

import com.lau.eshop.entity.MalOrd;
import org.springframework.stereotype.Repository;

@Repository
public interface MalOrdMapper {
    int deleteByPrimaryKey(String malOrdId);

    int insert(MalOrd record);

    int insertSelective(MalOrd record);

    MalOrd selectByPrimaryKey(String malOrdId);

    int updateByPrimaryKeySelective(MalOrd record);

    int updateByPrimaryKey(MalOrd record);
}