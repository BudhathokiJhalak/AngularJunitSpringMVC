/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.angularjunitspringmvc.dao;

import com.leapfrog.angularjunitspringmvc.entity.Course;
import java.util.List;

/**
 *
 * @author zak
 */
public interface CourseDAO {

    List<Course> getAll();
}
