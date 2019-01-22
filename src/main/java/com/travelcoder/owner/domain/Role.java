package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 角色
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class Role {
    @Id
    /** 角色：0未认证用户，1业主，2物业，3管理员 */
    private Integer role;
    /** 角色认证文件id */
    private Integer roleFileId;
}
