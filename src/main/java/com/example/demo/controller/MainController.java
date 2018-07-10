package com.example.demo.controller;/**
 * Created by Administrator on 2018-04-30.
 */

import com.example.demo.pojo.LearnResouce;
import com.example.demo.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-04-30-20:30
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private LearnService learnService;

    @RequestMapping("/")
    public List<LearnResouce> test(HttpServletRequest request){
        return learnService.queryLearnResouceListByAll();
    }

    @RequestMapping("/queryLR/{id}")
    public LearnResouce getLearnResouceById(@PathVariable(name = "id") String id){
        return learnService.queryLearnResouceById(Long.valueOf(id));
    }

    @RequestMapping("/handle41")
    @ResponseBody
    public List<LearnResouce> handle41(@RequestBody LearnResouce learnResouce){
        return learnService.queryLearnResouceListByAll();
    }

}
