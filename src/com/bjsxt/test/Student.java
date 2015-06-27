package com.bjsxt.test;

import java.util.Date;

/**
 * 学生类
 * @author liukaili
 * 
 * 视图 view  console Package Explorer Navigator Problems
 * 透视图 Perspective 多个视图按照一定位置组成的一个整体 
 * java debug 
 *
 */
public class Student {
	/**
	 * 姓名
	 */
	String name;
	/**
	 * 年龄
	 */
	int age;
	/**
	 * 分数
	 */
	double score;
	/**
	 * 吃饭
	 */
	public void eat(){
		System.out.println("eating.....");
	}
	/**
	 * 学习
	 * @param position 地点
	 * @param date 日期
	 */
	public void study(String position,Date date	){
		System.out.println("studying.....");
		
	}
}
