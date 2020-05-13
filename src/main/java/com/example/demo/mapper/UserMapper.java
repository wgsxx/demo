package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> Sel(@Param("status")int status,@Param("pageNo")int pageNo,@Param("size")int size);
}
