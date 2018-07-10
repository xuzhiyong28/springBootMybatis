package com.example.demo.mapper;/**
 * Created by Administrator on 2018-05-17.
 */

import com.example.demo.pojo.LearnResouceGroup;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xuzhiyong
 * @createDate 2018-05-17-9:12
 */
@Mapper
public interface LearnGroupMapper {
    public LearnResouceGroup queryLearnResouceGroupById(Long id);
}
