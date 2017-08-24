package com.generator.dao;

import com.generator.domain.Material;

public interface MaterialMapper {
    int insert(Material record);

    int insertSelective(Material record);
}