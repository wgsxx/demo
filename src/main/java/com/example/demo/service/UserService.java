package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.OrderCriteria;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;
    public List<User> Sel(int status, int pageNo, int size){
        OrderCriteria o=new OrderCriteria();
        o.setPageNo(pageNo);
        o.setSize(size);
        Map<String, Object> map= o.toMap();
        System.out.println("OrderCriteria参数为:"+(Integer) map.get("pageNo")+",,,,"+(Integer) map.get("size"));
        return userMapper.Sel(status,(Integer) map.get("pageNo"),(Integer) map.get("size"));
    }

}
