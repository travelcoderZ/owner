package com.travelcoder.owner.service.impl;

import com.travelcoder.owner.contant.PageConstant;
import com.travelcoder.owner.domain.Topic;
import com.travelcoder.owner.repository.TopicRepository;
import com.travelcoder.owner.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author zhulin
 * @create 2019/1/3
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public Optional<Topic> findById(Integer topicId) {
        return topicRepository.findById(topicId);
    }

    @Override
    public Page<Topic> findAllByReply(int page) {
            Pageable pageable=PageRequest.of(page, PageConstant.PAGE_SIZE,Sort.Direction.DESC,"lastReplyTime");
        return topicRepository.findAll(pageable);
    }

    @Override
    public Page<Topic> findAllByCreate(int page) {
        Pageable pageable=PageRequest.of(page, PageConstant.PAGE_SIZE,Sort.Direction.DESC,"createTime");
        return topicRepository.findAll(pageable);
    }

    @Override
    public Page<Topic> findByFilter(int page,Topic filter) {
        Example<Topic> example = Example.of(filter);
        Pageable pageable=PageRequest.of(page, PageConstant.PAGE_SIZE,Sort.Direction.DESC,"createTime");
        return topicRepository.findAll(example,pageable);
    }
}
