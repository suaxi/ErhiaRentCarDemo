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
		System.out.println("��ӭ���ʶ����⳵");
		System.out.println("=======================");
		System.out.println("��ѡ��1.��¼  2.ע��  3.��������  4.�˳�");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			//��¼
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
			//ע��
			new RegisterView().register();
			System.out.println();
			new	LoginView().login();
			break;		
		case "3":
			//ͨ���û��������֤��֤��������޸�
			new UserCaseView().Reset();
			new EndView().ResetEnd();
			break;
			
		case "4":
			//�˳�
			System.out.println("��ӭ�´ι��٣�");
			System.exit(0);
			break;

		default:
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new StartView().start();
			break;
		}
	}

}

