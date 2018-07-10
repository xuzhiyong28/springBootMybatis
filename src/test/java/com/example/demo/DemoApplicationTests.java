package com.example.demo;

import com.example.demo.configProperties.AppProperties;
import com.example.demo.mapper.*;
import com.example.demo.pojo.*;
import com.example.demo.service.LearnService;
import com.example.demo.service.MybatisBatch;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.github.pagehelper.PageInfo;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private LearnMapper learnMapper;

	@Autowired
	private LearnGroupMapper learnGroupMapper;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AppProperties appProperties;

	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;

	@Autowired
	private LearnService learnService;

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Autowired
	private MybatisBatch mybatisBatch;

	@Test
	public void contextLoads() {
		List<SysRole> list = roleMapper.selectRoleByUserId((long)1);
		System.out.println(list.size());
	}

	@Test
	public void test2(){
		SysUser sysUser = userMapper.selectByid((long)1);
		if(sysUser != null){
			sysUser.setUserInfo("福建顶点软件");
			int result = userMapper.updateSysUser(sysUser);
			System.out.println(result);
		}
	}

	@Test
	public void test3(){
		/*int result = userMapper.updateSysUserInfoAndName((long)1,"福建顶点软件有限公司","许大帅");
		System.out.println(result);*/

		/*List<Long> ids = new ArrayList<Long>();
		ids.add((long)1);
		ids.add((long)2);
		List<SysUser> list = userMapper.selectByIds(ids);
		System.out.println(list.size());*/

		/*List<LearnResouce> list = learnMapper.queryLearnResouceListByExtendAll();
		System.out.println(list.size());*/

		/*List<LearnResouce> list = learnMapper.queryLearnResouceListByAssociationAll();
		System.out.println(list.size());*/

	    /*LearnResouceGroup learnResouceGroup = learnGroupMapper.queryLearnResouceGroupById(1l);
		System.out.println(learnResouceGroup.toString());*/

	   /* LearnResouce learnResouce = learnMapper.queryLearnResouceListByAssociationSelect(999l);
		System.out.println(learnResouce);*/


	   /*SysUser sysUser = userMapper.selectUserAndRoleById(1L);
	   System.out.println(sysUser);*/

	  	/*SysUser sysUser = new SysUser();
	  	sysUser.setCreateTime(new Date());
	  	sysUser.setUserEmail("mm18054809167@qq.com");
	  	sysUser.setUserPassword("123456");
	  	sysUser.setUserInfo("info");
	  	sysUser.setUserName("快乐学习");
		userService.addSysUserAndSetRole(sysUser,1l);*/


	  	/*List<LearnResouce> list = new ArrayList<LearnResouce>();
	  	LearnResouceGroup learnResouceGroup = new LearnResouceGroup();
	  	String[] name = {"spring企业级++","Maven实战" , "springCloud微服务"};
	  	learnResouceGroup.setId(2l);
	  	for(int i = 0 ; i < 1000 ; i++){
	  		LearnResouce learnResouce = new LearnResouce();
	  		learnResouce.setAuthor("嘟嘟_" + i);
	  		learnResouce.setTitle(name[i % 3]);
	  		learnResouce.setUrl("https://www.cnblogs.com/changer01/p/7911805_" + i + ".html");
	  		learnResouce.setGroup(learnResouceGroup);
	  		list.add(learnResouce);
		}
		mybatisBatch.addUserBatch(list);*/

		PageInfo<LearnResouce> pageInfo = learnService.queryLearnResourceListPage(2,2);
		System.out.println(pageInfo);
	}


	@Test
	public void RESTTest(){
		/*ResponseEntity<List> resouceResponseEntity = restTemplate.getForEntity("http://localhost:8001/main/",List.class);
		System.out.println(resouceResponseEntity.getBody());*/

		/*ResponseEntity<LearnResouce> resouceResponseEntity = restTemplate.getForEntity("http://localhost:8001/main/queryLR/1033",LearnResouce.class);
		System.out.println(resouceResponseEntity);*/


		/*Map map = new HashMap();
		map.put("p", "{\"func\":\"QUERY_CXSJZD\",\"req_data\":{\"fldm\":\"GT_KHZT\"}}");
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://10.189.145.58:9999/serviceTest?p={p}", String.class, map);
		System.out.println(responseEntity);*/

		/*Map<String ,Long> paramMap = new HashMap<String,Long>();
		paramMap.put("userId",1l);
		paramMap.put("roleId",1l);
		List<SysUserRole> list = sysUserRoleMapper.queryByUserIdAndRoleId(paramMap);
		System.out.println(list.size());*/

	}

	@Test
	public void mybatisTest(){
		System.out.println(sqlSessionTemplate);
	}

}
