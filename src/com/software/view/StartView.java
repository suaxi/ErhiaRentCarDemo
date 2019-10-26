package com.software.view;

import java.util.Scanner;

import com.software.view.RegisterView;

public class StartView {

	public static void main(String[] args) {
		StartView startView = new StartView();
		startView.start();

	}
	
	public void start() {
		System.out.println("=======================");
		System.out.println("欢迎访问二嗨租车");
		System.out.println("=======================");
		System.out.println("请选择：1.登录  2.注册  3.重置密码  4.退出");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			//登录
			boolean power = new LoginView().login();
			System.out.println();
			if(power==true) {
			new QueryView().getAdminCarInfo();
			System.out.println();
			new PageView().adminPage();
			}else {
			new QueryView().getCarInfo();
			System.out.println();
			new PageView().userPage();
			}
			break;
		case "2":
			//注册
			new RegisterView().register();
			System.out.println();
			new	LoginView().login();
			break;		
		case "3":
			//通过用户名和身份证验证完成密码修改
			new UserCaseView().Reset();
			new EndView().ResetEnd();
			break;
			
		case "4":
			//退出
			System.out.println("欢迎下次光临！");
			System.exit(0);
			break;

		default:
			System.out.println("请根据系统提示完成操作！");
			new StartView().start();
			break;
		}
	}

}

