package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 话题，主题帖
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class Topic {
    @Id
    @GeneratedValue
    private Integer topicId;

    private String title;

    /** 文本内容 */
    private String context;

    private Integer authorId;

    private Date createTime;

    /** 最后回复时间 */
    private Date lastReplyTime;

    /** 最新回复人 */
    private Integer lastReplyUserId;

    private Integer ifDel;

    private Integer topicTypeId;

    private Integer ifTop;
}
