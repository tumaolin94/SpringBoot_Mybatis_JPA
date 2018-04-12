package com.maolintu.matisplusjpa.mapper;

import com.maolintu.matisplusjpa.model.HibernateSequence;

public interface HibernateSequenceMapper {
    int insert(HibernateSequence record);

    int insertSelective(HibernateSequence record);
}