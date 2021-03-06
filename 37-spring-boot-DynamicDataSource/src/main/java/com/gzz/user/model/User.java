package com.gzz.user.model;

import java.util.Date;

import lombok.Data;
/**
 * @author https://www.jianshu.com/u/3bd57d5f1074
 * @date 2019-12-24 10:50:00
 */
@Data
public class User {
	private Integer id;
	private String name;
	private Date birthday;
}
