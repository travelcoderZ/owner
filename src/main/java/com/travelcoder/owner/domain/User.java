package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class User {
    /** 用户唯一标识 */
    @Id
    @GeneratedValue
    private Integer userId;
    /** 微信openId */
    private String openid;
    /** 微信昵称 */
    private String nickname;
    /** 微信头像 */
    private String headimgurl;
    /** 角色id */
    private Integer roleId;


    public User(String openid, String nickname) {
        this.openid = openid;
        this.nickname = nickname;
    }

    public User() {
    }

}
