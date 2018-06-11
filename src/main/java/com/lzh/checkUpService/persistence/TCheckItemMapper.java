package com.lzh.checkUpService.persistence;

import com.lzh.checkUpService.model.entity.TCheckItem;
import com.lzh.common.annotation.MyBatisRepository;
import com.lzh.common.persistence.CrudMapper;

@MyBatisRepository
public interface TCheckItemMapper extends CrudMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TCheckItem record);

    int insertSelective(TCheckItem record);

    TCheckItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TCheckItem record);

    int updateByPrimaryKey(TCheckItem record);
}