package com.driving_school.dsms.controller;

import com.driving_school.dsms.data_transfer_object.User;
import com.driving_school.dsms.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
@RequestMapping("/")
public class ViewController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public ModelAndView Index() {

        return new ModelAndView("login");
    }

    @RequestMapping(value = {"/check/login"}, method = RequestMethod.POST,consumes = "application/json", produces = "application/text")
    @ResponseBody
    public String Login(@RequestBody User user) {
        System.out.println(user.getName());
        String res = "login";
        if (service.checkLogin(user) != null) {
            res = "index";
        }
        return res;

    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ModelAndView Dashbord() {

        return new ModelAndView("index");
    }

    @RequestMapping(value = {"/student"}, method = RequestMethod.GET)
    public ModelAndView Student_Registration() {

        return new ModelAndView("Student");
    }
}
