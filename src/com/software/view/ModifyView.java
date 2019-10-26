package com.software.view;

import java.util.Scanner;

public class ModifyView {
	public void modifyPage() {
		new QueryView().AllCarInfo();
		System.out.println("========================================");
		System.out.println("请输入要修改的汽车的编号");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
			
		case "1":
			new AdminCaseView().modify(choose);
			break;

		case "2":
			new AdminCaseView().modify(choose);
			break;
		case "3":
			new AdminCaseView().modify(choose);
			break;
		case "4":
			new AdminCaseView().modify(choose);
			break;
		case "5":
			new AdminCaseView().modify(choose);
			break;
		case "6":
			new AdminCaseView().modify(choose);
			break;
		case "7":
			new AdminCaseView().modify(choose);
			break;
		case "8":
			new AdminCaseView().modify(choose);
			break;
		case "9":
			new AdminCaseView().modify(choose);
			break;
		case "10":
			new AdminCaseView().modify(choose);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请按照系统提示完成操作！");
			new ModifyView().modifyPage();
			break;
		}
		new EndView().modifyPageEnd();
	}
}
