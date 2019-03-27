package com.hwua.service;

import com.hwua.entity.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> selectAllGoods();
//   分页查询
    public List<Goods> selectAllGoodsForPage(int pageNumber,int pageSize);

}
