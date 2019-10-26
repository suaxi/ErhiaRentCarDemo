package com.software.view;

import java.util.Scanner;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;
import com.software.util.Md5;

public class LoginView {
	public boolean login() {
		System.out.println("======登录=====>>>>");
		System.out.println("用户名：");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("密码：");
		String PassWord = scanner.next();
		Md5 md5 = new Md5();
		String passWord = md5.md5(PassWord);
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.login(userName, passWord);
		System.out.println("=======================");
		if(user==null) {
			System.out.println("登录失败！");
			System.out.println("1.重新登录 任意键退出");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				login();
				break;

			default:
				System.out.println("已退出！");
				System.exit(0);
				break;
			}
		}else {
			System.out.println("欢迎"+user.getUsername());
		}
		boolean power = userServiceImpl.Judge(userName, passWord);
		return power;
		}
}

