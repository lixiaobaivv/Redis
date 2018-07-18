/*
package com.jnshu.Test;

import com.jnshu.entity.UserQv;
import com.jnshu.service.UserQvservice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
public class UserServuceTest extends SpringTestCase{

    @Autowired
    UserQvservice userQvservice;

    @Test
    public void testGetUserQvInfo(){
        String name = "mengdee";
        //第一次执行了方法体
        userQvservice.getUserInfo(name);

        //第二次没有执行方法体，直接从缓存中获取的
        UserQv userQvInfo = userQvservice.getUserInfo(name);
        System.out.println(userQvInfo); //UserQv [id =565857,name=mengdee,age=20]
    }

    @Test
    public void testDeleteUserQv(){
        String name = "mengdee";
        UserQv userQvInfo = userQvservice.getUserInfo(name);
        System.out.println(userQvInfo);

        userQvservice.getUserInfo(name);

        userQvservice.deleteUserQv(name);
    }

    @Test
    public void testUpdateUser(){
        String name = "mengdee";
        UserQv userQvInfo = userQvservice.getUserInfo(name);
        System.out.println(userQvInfo);

        userQvInfo.setAge(200);
        userQvInfo.setId(10L);
        userQvservice.updateUserQv(userQvInfo);

        UserQv userQvInfo2 = userQvservice.getUserInfo(name);
        System.out.println(userQvInfo2);
    }

}
*/
