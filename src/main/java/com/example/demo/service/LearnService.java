package com.example.demo.service;

import com.example.demo.pojo.LearnResouce;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018-04-30.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    List<LearnResouce> queryLearnResouceList(Map<String,Object> params);
    PageInfo<LearnResouce> queryLearnResourceListPage(int pageNum, int pageSize);
    public List<LearnResouce> queryLearnResouceListByAll();

}
