package com.travelcoder.owner;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhulin
 * @create 2019/1/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    @Test
    public void test1(){
        String name = "owner";
        String author = "zhulin";
        log.info("info...");
        log.error("error: name={},author={}",name,author);
    }
}
