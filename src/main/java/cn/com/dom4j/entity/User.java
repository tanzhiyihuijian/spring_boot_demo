package cn.com.dom4j.entity;


import lombok.*;

import java.util.Date;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String email;
    private String password;
    private String nickname;
    private String realname;
    private int age;
    private int gender;
    private String phone;
    private Date birthday;
    private Date createTime;
    private Date updateTime;

}
