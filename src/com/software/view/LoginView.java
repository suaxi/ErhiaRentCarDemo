package com.software.view;

import java.util.Scanner;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;
import com.software.util.Md5;

public class LoginView {
	public boolean login() {
		System.out.println("======��¼=====>>>>");
		System.out.println("�û�����");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.println("���룺");
		String PassWord = scanner.next();
		Md5 md5 = new Md5();
		String passWord = md5.md5(PassWord);
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.login(userName, passWord);
		System.out.println("=======================");
		if(user==null) {
			System.out.println("��¼ʧ�ܣ�");
			System.out.println("1.���µ�¼ ������˳�");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				login();
				break;

			default:
				System.out.println("���˳���");
				System.exit(0);
				break;
			}
		}else {
			System.out.println("��ӭ"+user.getUsername());
		}
		boolean power = userServiceImpl.Judge(userName, passWord);
		return power;
		}
}

