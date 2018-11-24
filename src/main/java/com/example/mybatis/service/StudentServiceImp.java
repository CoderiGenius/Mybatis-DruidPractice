package com.example.mybatis.service;

import com.example.mybatis.domain.Student;
import com.example.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 周思成 on  2018/11/24 14:19
 */

@Service("StudentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }



    @Override
    public Student queryStudentBySno(String stuNum) {
        return this.studentMapper.queryStudentByStuNum(stuNum);
    }

}
