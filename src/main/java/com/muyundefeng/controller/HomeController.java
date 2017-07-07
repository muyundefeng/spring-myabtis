package com.muyundefeng.controller;

import com.muyundefeng.entity.Student;
import com.muyundefeng.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lisheng on 17-7-7.
 */
@Controller
public class HomeController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/home")
    @ResponseBody
    public String getAge(@RequestParam("name") String name) {
        System.out.println(name);
        Student student = studentMapper.selectByName(name);
        return student.getName();
    }
}
