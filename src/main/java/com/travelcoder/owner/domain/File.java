package com.travelcoder.owner.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 文件 主要为图片
 * @author zhulin
 * @create 2019/1/3
 */
@Entity
@Data
public class File {
    @Id
    @GeneratedValue
    private Integer fileId;

    private String filePath;

    private String fileUrl;

    private String fileName;

    /** 文件扩展名 */
    private String fileExtension;
}
