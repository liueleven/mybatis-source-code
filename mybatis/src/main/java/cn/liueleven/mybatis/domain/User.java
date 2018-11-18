package cn.liueleven.mybatis.domain;

import lombok.Data;

import java.util.Date;

/**
 * @description: user 实体
 * @date: 2018-11-18 09:13
 * @author: 十一
 */
@Data
public class User {

    private Integer id;

    private String name;

    private String phone;

    private Date createTime;

    private Boolean enable;

    private String email;
}
