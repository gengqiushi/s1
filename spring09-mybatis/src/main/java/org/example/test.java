package org.example;

import org.example.model.User;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application.xml"})
public class test {

    @Autowired
    private UserService userService;

    @Test
    public void t1(){
        List<User> users = userService.queryAll();
        System.out.println(users);
    }

}
