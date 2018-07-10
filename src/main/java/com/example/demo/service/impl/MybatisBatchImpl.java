package com.example.demo.service.impl;/**
 * Created by Administrator on 2018-05-27.
 */

import com.example.demo.mapper.LearnGroupMapper;
import com.example.demo.mapper.LearnMapper;
import com.example.demo.pojo.LearnResouce;
import com.example.demo.service.MybatisBatch;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuzhiyong
 * @createDate 2018-05-27-9:18
 */
@Service
public class MybatisBatchImpl implements MybatisBatch {
    /***
     * 批量新增LearnResource
     * @param lrs
     * @return
     */

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /***
     * 采用batch方式批量插入数据
     * @param lrs
     * @return
     */
    @Override
    public boolean addUserBatch(List<LearnResouce> lrs) {
        int result = 1;
        SqlSession sqlSession = null;
        try{
            sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            LearnMapper learnMapper = sqlSession.getMapper(LearnMapper.class);
            int batchCount = 10;// 每批commit的个数
            int batchLastIndex = batchCount;// 每批最后一个的下标
            for(int i = 0 ; i < lrs.size() ; i++){

                if(batchLastIndex >= lrs.size()){
                    batchLastIndex = lrs.size();
                    result = result + learnMapper.addByBatch(lrs.subList(i, batchLastIndex));
                    sqlSession.commit();
                    //清理缓存，防止溢出
                    sqlSession.clearCache();
                    System.out.println("index:" + i + " batchLastIndex:" + batchLastIndex);
                    break;// 数据插入完毕，退出循环
                }
                else{
                    result = result + learnMapper.addByBatch(lrs.subList(i,batchLastIndex));
                    sqlSession.commit(); //提交
                    sqlSession.clearCache(); //清理缓存防止溢出
                    System.out.println("index:" + i + " batchLastIndex:" + batchLastIndex);
                    i = batchLastIndex;
                    batchLastIndex = i + (batchCount -1);
                }
            }
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return true;
    }
}
