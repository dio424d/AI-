package com.myai.project.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学科�?
 * </p>
 *
 * @author huge
 * @since 2025-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学科名称
     */
    private String name;

    /**
     * 学历背景要求�?-无，1-初中�?-高中�?-大专�?-本科以上
     */
    private Integer edu;

    /**
     * 课程类型：编程、设计、自媒体、其�?
     */
    private String type;

    /**
     * 课程价格
     */
    private Long price;

    /**
     * 学习时长，单�? �?
     */
    private Integer duration;


}

