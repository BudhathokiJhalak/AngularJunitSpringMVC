/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.angularjunitspringmvc.controller;

import com.leapfrog.angularjunitspringmvc.dao.CourseDAO;
import com.leapfrog.angularjunitspringmvc.entity.Course;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author zak
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private CourseDAO courseDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("courses", courseDAO.getAll());
        return "index";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    @ResponseBody
    public String contact(Course c) {
        return c.toString();
    }
}
