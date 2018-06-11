package com.lzh.checkUpService.persistence;

import com.lzh.checkUpService.model.entity.TCheckList;
import com.lzh.common.annotation.MyBatisRepository;
import com.lzh.common.persistence.CrudMapper;

@MyBatisRepository
public interface TCheckListMapper extends CrudMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TCheckList record);

    int insertSelective(TCheckList record);

    TCheckList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TCheckList record);

    int updateByPrimaryKey(TCheckList record);
}