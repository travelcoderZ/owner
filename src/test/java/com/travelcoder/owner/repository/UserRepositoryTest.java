package com.travelcoder.owner.repository;

import com.travelcoder.owner.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void saveUser(){
        User user = new User("fdsjkfsak","lalala");
        User u1 = userRepository.save(user);
        Assert.assertNotNull(u1);

    }
}