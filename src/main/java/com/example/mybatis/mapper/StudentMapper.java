package com.example.mybatis.mapper;

import com.example.mybatis.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by 周思成 on  2018/11/24 14:08
 */
@Component
@Mapper
public interface StudentMapper {

    @Select("select * from Student where stuNum=#{stuNum}")
    @Results(id = "student",value= {
            @Result(property = "stuNum", column = "stuNum", javaType = String.class),
            @Result(property = "stuPass", column = "stuPass", javaType = String.class),
            @Result(property = "stuStatus", column = "stuStatus", javaType = String.class)
    })
    Student queryStudentByStuNum(String stuNum);

    @Insert("insert into Student(stuNum,stuPass,stuStatus) values(#{stuNum},#{stuPass},#{stuStatus})")
    int add(Student student);

    @Update("update Student set stuNum=#{stuNum},stuPass=#{stuPass} where stuStatus=#{stuStatus}")
    int update(Student student);

}
