package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 话题分类
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class TopicType {
    @Id
    @GeneratedValue
    private Integer topicTypeId;

    private String topicTypeName;

}
