package com.hwua.dao;

import com.hwua.entity.Type;

import java.util.List;

public interface TypeDao {
    //    查询=所有的商品类型
    public List<Type> selectAllType();
    //    查询所有的商品大种类
    public List<Type> selectAllBigType();
    //    根据大种类的id查询所有对应的小种类
    public List<Type> selectAllSmallTypeByBigType(int type_big);
}
