package com.example.demo.controller;/**
 * Created by Administrator on 2018-05-22.
 */

import com.example.demo.pojo.LearnResouce;
import com.example.demo.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-22-14:22
 */
@RestController
@RequestMapping("/thymeleaf")
public class ThymeleafTestController {

    @Autowired
    private LearnService learnService;


    @RequestMapping("/index")
    public ModelAndView index(){
        List<LearnResouce> learnList = learnService.queryLearnResouceListByAll();
        ModelAndView modelAndView = new ModelAndView("thymeleaf");
        modelAndView.addObject("learnList",learnList);
        return modelAndView;
    }

}
