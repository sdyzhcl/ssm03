package com.hwua.service;

import com.hwua.entity.Type;

import java.util.List;

public interface TypeService {
//    查询所有的商品类型
    public List<Type> selectAllType();
//    查询所有商品大种类
    public List<Type>selectAllBigType();
//    根据商品大种类查询对应的小种类
    public List<Type>selectAllSmallTypeByBigType(int type_id);

}
