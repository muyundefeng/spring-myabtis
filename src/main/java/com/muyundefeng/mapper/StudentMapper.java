package com.muyundefeng.mapper;

import com.muyundefeng.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lisheng on 17-7-7.
 */
@Repository
public interface StudentMapper {
    public Student selectByName(@Param("name")String name);
}
