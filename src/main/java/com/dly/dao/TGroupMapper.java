package com.dly.dao;

import com.dly.entity.TGroup;
import com.dly.entity.TGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TGroupMapper
{
  public abstract long countByExample(TGroupExample paramTGroupExample);

  public abstract int deleteByExample(TGroupExample paramTGroupExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TGroup paramTGroup);

  public abstract int insertSelective(TGroup paramTGroup);

  public abstract List<TGroup> selectByExample(TGroupExample paramTGroupExample);

  public abstract TGroup selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TGroup paramTGroup, @Param("example") TGroupExample paramTGroupExample);

  public abstract int updateByExample(@Param("record") TGroup paramTGroup, @Param("example") TGroupExample paramTGroupExample);

  public abstract int updateByPrimaryKeySelective(TGroup paramTGroup);

  public abstract int updateByPrimaryKey(TGroup paramTGroup);
}