package com.travelcoder.owner.service;

import com.travelcoder.owner.domain.Topic;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface TopicService {

    /**
     * 新增/更新话题
     * @return
     */
    Topic save(Topic topic);

    /**
     * 话题详情
     * @return
     */
    Optional<Topic> findById(Integer topicId);

    /**
     * 按最新回帖时间查找话题列表
     * @return
     */
    Page<Topic> findAllByReply(int page);

    /**
     * 按最新发帖时间查找话题列表
     * @return
     */
    Page<Topic> findAllByCreate(int page);

    /**
     * 按条件查询话题列表
     * @return
     */
    Page<Topic> findByFilter(int page,Topic filter);

}
