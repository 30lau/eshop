package com.lau.eshop.mapper;

import com.lau.eshop.entity.UseCarKey;
import org.springframework.stereotype.Repository;

@Repository
public interface UseCarMapper {
    int deleteByPrimaryKey(UseCarKey key);

    int insert(UseCarKey record);

    int insertSelective(UseCarKey record);
}