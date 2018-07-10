package com.example.demo.service;

import com.example.demo.pojo.LearnResouce;

import java.util.List;

/**
 * Created by Administrator on 2018-05-27.
 */
public interface MybatisBatch {
    public boolean addUserBatch(List<LearnResouce> lrs);
}
