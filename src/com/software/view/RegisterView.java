
package com.software.view;

import java.util.Scanner;

import com.software.entity.User;
import com.software.service.impl.CheckServiceImpl;
import com.software.service.impl.RegisterServiceImpl;
import com.software.util.Md5;

public class RegisterView {

	// �û�ע�����
	public void register() {
		System.out.println("=======================");
		System.out.println("�����⳵�û�ע��");
		System.out.println("=======================");
		System.out.println("�û�����");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		if (new CheckServiceImpl().Check(userName) == true) {
			System.out.println("�û������ã�");
		}

		if (new CheckServiceImpl().Check(userName) == false) {
			System.out.println("ע��ʧ�ܣ��û����Ѵ��ڣ�");
			System.out.println("1.����ע�� 2.�˳�");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				register();
				break;

			case "2":
				System.exit(0);
				break;

			default:
				System.out.println("�����ϵͳ��ʾ��ɲ�����");
				System.exit(0);
				break;
			}

		} else {
			System.out.println("���룺");
			String PassWord = scanner.next();
			Md5 md5 = new Md5();
			String passWord = md5.md5(PassWord);
			System.out.println("�Ա�(0���� /1��Ů)");
			int sex = scanner.nextInt();
			System.out.println("���֤��");
			String idNumber = scanner.next();
			if (new CheckServiceImpl().Checkid(idNumber) == false) {
				System.out.println("ע��ʧ�ܣ����֤�Ѵ��ڣ�");
				System.out.println("1.����ע�� 2.�˳�");
				String choose = scanner.next();
				switch (choose) {
				case "1":
					register();
					break;

				case "2":
					System.exit(0);
					break;

				default:
					System.out.println("�����ϵͳ��ʾ��ɲ�����");
					System.exit(0);
					break;
				}
			}else {
				System.out.println("�绰���룺");
				String tel = scanner.next();
				System.out.println("��ַ��");
				String addr = scanner.next();
				User user = new User(0, userName, passWord, sex, idNumber, tel, addr, 0);
				RegisterServiceImpl rs = new RegisterServiceImpl();
				rs.register(user);

				System.out.println("ע��ɹ�!");
				System.out.println();
			}
		}
		new StartView().start();
	}
}