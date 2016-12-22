/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.angularjunitspringmvc.dao.impl;

import com.leapfrog.angularjunitspringmvc.dao.CourseDAO;
import com.leapfrog.angularjunitspringmvc.entity.Course;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zak
 */
@Repository(value = "courseDAO")
public class CourseDAOImpl implements CourseDAO {

    @Override
    public List<Course> getAll() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "Advanced Java", 20000, true));
        courseList.add(new Course(2, "Python", 20000, false));
        return courseList;
    }

}
