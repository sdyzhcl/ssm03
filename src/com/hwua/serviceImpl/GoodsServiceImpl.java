package com.hwua.serviceImpl;

import com.hwua.dao.GoodsDao;
import com.hwua.entity.Goods;
import com.hwua.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;


    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> list= goodsDao.selectAllGoods();
        return list;
    }

    @Override
    public List<Goods> selectAllGoodsForPage(int pageNumber, int pageSize) {
        Page pate=PageHelper.startPage(pageNumber,pageSize);
        List<Goods> list=goodsDao.selectAllGoods();
        return list;
    }
}
