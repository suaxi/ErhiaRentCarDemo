
package com.software.view;

import java.util.Scanner;

import com.software.entity.User;
import com.software.service.impl.CheckServiceImpl;
import com.software.service.impl.RegisterServiceImpl;
import com.software.util.Md5;

public class RegisterView {

	// 用户注册界面
	public void register() {
		System.out.println("=======================");
		System.out.println("二嗨租车用户注册");
		System.out.println("=======================");
		System.out.println("用户名：");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		if (new CheckServiceImpl().Check(userName) == true) {
			System.out.println("用户名可用！");
		}

		if (new CheckServiceImpl().Check(userName) == false) {
			System.out.println("注册失败，用户名已存在！");
			System.out.println("1.重新注册 2.退出");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				register();
				break;

			case "2":
				System.exit(0);
				break;

			default:
				System.out.println("请根据系统提示完成操作！");
				System.exit(0);
				break;
			}

		} else {
			System.out.println("密码：");
			String PassWord = scanner.next();
			Md5 md5 = new Md5();
			String passWord = md5.md5(PassWord);
			System.out.println("性别：(0：男 /1：女)");
			int sex = scanner.nextInt();
			System.out.println("身份证：");
			String idNumber = scanner.next();
			if (new CheckServiceImpl().Checkid(idNumber) == false) {
				System.out.println("注册失败，身份证已存在！");
				System.out.println("1.重新注册 2.退出");
				String choose = scanner.next();
				switch (choose) {
				case "1":
					register();
					break;

				case "2":
					System.exit(0);
					break;

				default:
					System.out.println("请根据系统提示完成操作！");
					System.exit(0);
					break;
				}
			}else {
				System.out.println("电话号码：");
				String tel = scanner.next();
				System.out.println("地址：");
				String addr = scanner.next();
				User user = new User(0, userName, passWord, sex, idNumber, tel, addr, 0);
				RegisterServiceImpl rs = new RegisterServiceImpl();
				rs.register(user);

				System.out.println("注册成功!");
				System.out.println();
			}
		}
		new StartView().start();
	}
}