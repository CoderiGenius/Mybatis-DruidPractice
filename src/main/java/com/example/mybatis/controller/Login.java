package com.example.mybatis.controller;

import com.example.mybatis.domain.Student;
import com.example.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 周思成 on  2018/11/23 23:54
 */

@RestController
public class Login {

    @Autowired
    private StudentService studentService;

    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentBySno(String stuNum) {
        return this.studentService.queryStudentBySno(stuNum);
    }
}
