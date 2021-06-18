package com.gduf.volunteer.mapper;

import com.gduf.volunteer.pojo.Act;

public interface ActMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Act record);

    int insertSelective(Act record);

    Act selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Act record);

    int updateByPrimaryKey(Act record);
}