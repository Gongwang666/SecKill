package com.gw.seckill.core.admin.dao;

import com.gw.seckill.facade.admin.entity.GoodsCats;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("goodsCatsDAO")
@Mapper
public interface GoodsCatsMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(GoodsCats record);

    int insertSelective(GoodsCats record);

    GoodsCats selectByPrimaryKey(Integer catId);

    List<GoodsCats> selectAllCats();

    int updateByPrimaryKeySelective(GoodsCats record);

    int updateByPrimaryKey(GoodsCats record);
}