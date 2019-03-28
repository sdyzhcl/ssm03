package com.hwua.serviceImpl;

import com.hwua.dao.TypeDao;
import com.hwua.entity.Type;
import com.hwua.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypeServiceImpl  implements TypeService {

    @Autowired
    TypeDao typeDao;

    @Override
    public List<Type> selectAllType() {
        List<Type> list=typeDao.selectAllType();
        return list;
    }

    @Override
    public List<Type> selectAllBigType() {
        List<Type> list=typeDao.selectAllBigType();
        return list;
    }

    @Override
    public List<Type> selectAllSmallTypeByBigType(int type_id) {
        List<Type> list=typeDao.selectAllSmallTypeByBigType(type_id);
        return list;
    }
}
