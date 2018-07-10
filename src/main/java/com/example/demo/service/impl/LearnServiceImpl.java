package com.example.demo.service.impl;/**
 * Created by Administrator on 2018-04-30.
 */

import com.example.demo.mapper.LearnMapper;
import com.example.demo.pojo.LearnResouce;
import com.example.demo.service.LearnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import org.slf4j.Logger;
import java.util.List;
import java.util.Map;

/**
 * @author xuzhiyong
 * @createDate 2018-04-30-20:14
 */
@Service("learnServiceImpl")
public class LearnServiceImpl implements LearnService {

    private static Logger log = LoggerFactory.getLogger(LearnServiceImpl.class);

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    LearnMapper learnMapper;


    public int add(LearnResouce learnResouce) {
        return this.learnMapper.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnMapper.update(learnResouce);
    }

    @Override
    public int deleteByIds(String[] ids) {
        return this.learnMapper.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnMapper.queryLearnResouceById(id);
    }

    @Override
    public List<LearnResouce> queryLearnResouceList(Map<String, Object> params) {
        PageHelper.startPage(Integer.parseInt(params.get("page").toString()), Integer.parseInt(params.get("rows").toString()));
        return this.learnMapper.queryLearnResouceList(params);
    }

    @Override
    public PageInfo<LearnResouce> queryLearnResourceListPage(int pageNum, int pageSize) {
        log.debug("=====================================================");
        PageHelper.startPage(pageNum, pageSize);
        List<LearnResouce> list = learnMapper.queryLearnResouceListByAll();
        PageInfo<LearnResouce> pageInfo = new PageInfo<LearnResouce>(list);
        return pageInfo;
    }

    @Override
    public List<LearnResouce> queryLearnResouceListByAll() {
        /*boolean flag = transactionTemplate.execute(new TransactionCallback<Boolean>() {
            @Override
            public Boolean doInTransaction(TransactionStatus transactionStatus) {
                LearnResouce learnResouce = new LearnResouce();
                learnResouce.setAuthor("许志勇");
                learnResouce.setTitle("测试标题");
                learnResouce.setUrl("http://localhost:8080");
                int flagInt = learnMapper.add(learnResouce);
                return flagInt == 1 ? true : false;
            }
        });*/
        return this.learnMapper.queryLearnResouceListByAll();
    }

}
