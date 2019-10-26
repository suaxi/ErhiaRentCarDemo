package com.software.view;

import java.util.Scanner;

public class EndView {
	
	public void RentCarEnd() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("========================");
	System.out.println("1.�������˵�  2.�˳�");
	String choose = scanner.next();
	switch (choose) {
	case "1":
		new PageView().userPage();
		break;
		
	case "2":
		System.out.println("���˳���");
		System.exit(0);
		break;

	default:
		System.out.println("��Ч������");
		System.out.println("�����ϵͳ��ʾ��ɲ�����");
		new EndView().RentCarEnd();
		break;
	}
}
	public void PriceADEnd() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("========================");
	System.out.println("1.�������˵�  2.�⳵  3.�˳�");
	String choose = scanner.next();
	switch (choose) {
	case "1":
		new PageView().userPage();
		break;
		
	case "2":
		new UserCaseView().RentCar();
		break;
		
	case "3":
		System.out.println("���˳���");
		System.exit(0);
		break;

	default:
		System.out.println("��Ч������");
		System.out.println("�����ϵͳ��ʾ��ɲ�����");
		new EndView().PriceADEnd();
		break;
	}
}
	
	public void CateSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�⳵  3.��Ʒ������  4.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().RentCar();
			break;
			
		case "3":
			new UserCaseView().BrandSelect();
			break;
			
		case "4":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().CateSelectEnd();
			break;
		}
	}
	
	public void BrandSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�⳵  3.������  4.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().RentCar();
			break;
			
		case "3":
			new UserCaseView().CateSelect();
			break;
			
		case "4":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void GetCarInfoEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�⳵  3.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().RentCar();
			break;
					
		case "3":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void SelectRecordEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.����  4.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().ReturnCar();
			break;
					
		case "3":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void ReturnCarEnd() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("========================");
			System.out.println("1.�������˵�  2.�˳�");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				new PageView().userPage();
				break;
				
			case "2":
				System.out.println("���˳���");
				System.exit(0);
				break;

			default:
				System.out.println("��Ч������");
				System.out.println("�����ϵͳ��ʾ��ɲ�����");
				new EndView().RentCarEnd();
				break;
			}
	}
	
	public void AgetCarInfoFoIdEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().AgetCarInfoFoIdEnd();
			break;
		}
	}
	public void APriceADEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().APriceADEnd();
			break;
		}
	}
	
	public void ACateSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.��Ʒ������  3.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new AdminCaseView().BrandSelect();
			break;
			
		case "3":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().ACateSelectEnd();
			break;
		}
	}
	
	public void ABrandSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.����������  3.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new AdminCaseView().CateSelect();
			break;
			
		case "3":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().ABrandSelectEnd();
			break;
		}
	}
	
	public void AgetAdminCarInfoEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.���������Ϣ  3.�޸�������Ϣ  4.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new AdminCaseView().AddCar();
			break;
			
		case "3":
			new ModifyView().modifyPage();
			break;
			
		case "4":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().AgetAdminCarInfoEnd();
			break;
		}
	}
	
	public void AddCarEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�鿴ȫ������  3.�޸�������Ϣ  4.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new QueryView().getAdminCarInfo();
			new EndView().AgetAdminCarInfoEnd();
			break;
			
		case "3":
			new ModifyView().modifyPage();
			break;
			
		case "4":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().AddCarEnd();
			break;
		}
	}
	
	public void modifyPageEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.�������˵�  2.�鿴ȫ������  3.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new QueryView().getAdminCarInfo();
			new EndView().AgetAdminCarInfoEnd();
			break;			
			
		case "3":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().modifyPageEnd();
			break;
		}
	}
	
	public void ResetEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.������ҳ��  2.�˳�");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new StartView().start();
			break;
			
		case "2":
			System.out.println("���˳���");
			System.exit(0);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new EndView().ResetEnd();
			break;
		}
	}
}
