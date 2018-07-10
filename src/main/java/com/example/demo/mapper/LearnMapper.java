package com.example.demo.mapper;

import com.example.demo.pojo.LearnResouce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018-04-30.
 */
@Mapper
public interface LearnMapper {
    int add(LearnResouce learnResouce);
    int addByBatch(List<LearnResouce> learnResouceList);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long id);
    public List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
    public List<LearnResouce> queryLearnResouceListByAll();
    public List<LearnResouce> queryLearnResouceListByExtendAll();
    public List<LearnResouce> queryLearnResouceListByAssociationAll();
    public LearnResouce queryLearnResouceListByAssociationSelect(Long id);
}
