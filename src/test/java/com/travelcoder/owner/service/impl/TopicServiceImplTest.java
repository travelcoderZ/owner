package com.travelcoder.owner.service.impl;

import com.travelcoder.owner.domain.Topic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicServiceImplTest {
    @Autowired
    private TopicServiceImpl topicService;

    @Test
    public void save() {
        Topic topic = new Topic();
        topic.setAuthorId(11);
        topic.setContext("Context");
        topic.setCreateTime(new Date());
        topic.setTitle("title");
        Topic t = topicService.save(topic);
        Assert.assertNotNull(t);
    }

    @Test
    public void findById() {
        Optional<Topic> optionalTopic = topicService.findById(3);
        Assert.assertTrue(optionalTopic.isPresent());
    }

    @Test
    public void findAllByReply() {
    }

    @Test
    public void findAllByCreate() {
    }

    @Test
    public void findByFilter() {
    }
}