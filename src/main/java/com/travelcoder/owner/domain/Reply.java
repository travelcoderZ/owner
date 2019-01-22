package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 回帖
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class Reply {
    @Id
    @GeneratedValue
    private Integer replyId;

    private String context;

    private Integer authorId;

    private Date createTime;

    private Integer topicId;

    /** 2级贴的父贴id */
    private Integer parentId;

    /** 回帖层级，0：主题帖回帖（1级贴）；1：楼层跟帖（2级贴） */
    private Integer replyLevel;

    private Integer ifDel;
}