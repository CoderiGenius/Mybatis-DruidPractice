package com.example.mybatis.service;

import com.example.mybatis.domain.Student;

/**
 * Created by 周思成 on  2018/11/24 14:18
 */

public interface StudentService {

    int add(Student student);
    int update(Student student);

    Student queryStudentBySno(String sno);
}
