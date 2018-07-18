/*package com.jnshu.service.impl;

import com.jnshu.entity.UserQv;


import com.jnshu.service.ProfessionService;
import com.jnshu.service.StudentService;
import com.jnshu.service.UserQvservice;
import com.jnshu.service.userService;
import com.jnshu.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
@Component
public class UserQvserviceImpl implements UserQvservice {
    @Autowired
    StudentService studentService;
    @Autowired
    userService userService;
    @Autowired
    ProfessionService
    @Autowired
    RedisUtil redisUtil;

    private static Logger logger = LoggerFactory.getLogger(UserQvserviceImpl.class);

    @Override
    public UserQv findByIdUserQv(Long id){
        return userQvservice
    }*/


  /*  @Override
    public UserQv findUserById(int id){
        //查找缓存
        Object object = MemcacheUtils.get("user"+id);
        //当存在缓存时直接返回缓存数据
        if (object!=null){
            return (UserQv) object;
        }
        UserQv userQv = userQvDao.findUserById(id);
        //当缓存为空的时候添加memcached缓存
        MemcacheUtils.set("user" + id,userQv,new Date(30000*60));
        return userQv;
    }

    @Override
    public int insertUserQv(UserQv userQv)throws Exception{
        //插入成功后返回的值存入user的id中
        userQvDao.insertUserQv(userQv);
        //写入缓存 这里使用add 当key（id）存在时，不写入缓存
        MemcacheUtils.add("user" + userQv.getId(),userQv);
        //所以返回user的id值
        return userQv.getId();
    }

    @Override
    public boolean updateById(UserQv userQv,Integer id)throws Exception{
        userQv.setId(id);
        //写入缓存 这里replace，当key（id）不存在时，不写入缓存
        MemcacheUtils.replace("user"+ id,userQv);
        return userQvDao.updateById(userQv);
    }

    @Override
    public boolean deleteUser(Integer id)throws Exception{
        //删除缓存
        MemcacheUtils.delete(String .valueOf(id));
        return userQvDao.deleteUser(id);
    }*/

