package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("testBootMybatis")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    @Value("${server.port}")
    private String port;


    @RequestMapping("getUser")
    public String GetUser(  HttpServletRequest request ){
        System.out.println("spring+mybatisdemo测试，1.git测试日志打印，2.git测试提交远程服务器，3.测试pull");
        String status=request.getParameter("status");
        String pageNo=request.getParameter("pageNo");
        String size=request.getParameter("size");
        System.out.println();
        try {
            return "当前访问端口号为:"+port;
        } catch (Exception e) {
            System.out.println(e);
           return "查询出错！"+e;
        }
    }

}
