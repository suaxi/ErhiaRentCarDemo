
package com.software.view;

import java.util.List;
import java.util.Scanner;

import com.software.entity.RentalCar;
import com.software.service.impl.CarServiceImpl;
import com.software.service.impl.OrderInfoServiceImpl;
import com.software.service.impl.RentalCarServiceImpl;

public class PageView {
	
public void userPage(){
	System.out.println("=============================");
	System.out.println("����0�˳�");
	System.out.println("����1�����⳵����");
	System.out.println("����2���۸�/��������");
	System.out.println("����3����������");
	System.out.println("����4��Ʒ������");
	System.out.println("����5�鿴ȫ������");
	System.out.println("����6�鿴�ҵ��⳵��¼");
	System.out.println("����7����");
	System.out.println("=============================");
	Scanner scanner = new Scanner(System.in);
	String choose = scanner.next();
	switch (choose) {
	// �˳�
	case "0":
		System.out.println("���˳���");
		System.exit(0);
		break;

	// �����⳵����
	case "1":
		new UserCaseView().RentCar();
		break;

	// ���۸�/�����ѯ
	case "2":
		new UserCaseView().PriceAD();
		break;

	// ����������
	case "3":
		new UserCaseView().CateSelect();
	break;

	// ��Ʒ������
	case "4":
		new UserCaseView().BrandSelect();
		break;

	// �鿴ȫ��������Ϣ
	case "5":
		new UserCaseView().GetCarInfo();
		break;

	// �鿴�ҵ��⳵��¼
	case "6":
		new UserCaseView().SelectRecord();
		new EndView().SelectRecordEnd();
		break;

	// ����
	case "7":
		new UserCaseView().SelectRecord();
		new UserCaseView().ReturnCar();
		break;

	default:
		System.out.println("��Ч������");
		System.out.println("�밴��ϵͳ��ʾ���в�����");
		System.out.println("========================");
		new PageView().userPage();
		break;
	}
}

	public void adminPage() {
		System.out.println("����0�˳�");
		System.out.println("����1�鿴ָ������");
		System.out.println("����2���۸�/��������");
		System.out.println("����3����������");
		System.out.println("����4��Ʒ������");
		System.out.println("����5�鿴ȫ������");
		System.out.println("����6�������");
		System.out.println("����7�޸�������Ϣ");
		System.out.println("����8�鿴������¼");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		// �˳�
		case "0":
			System.out.println("���˳���");
			System.exit(0);
			break;

		// �鿴ָ������
		case "1":
			new AdminCaseView().getCarInfoForId();
			break;
			
		// ���۸�/��������
		case "2":
			new AdminCaseView().PriceAD();
			break;
			
		// ����������
		case "3":
			new AdminCaseView().CateSelect();
			break;
			
		// ��Ʒ������
		case "4":
			new AdminCaseView().BrandSelect();
			break;
			
		// �鿴ȫ������
		case "5":
		new QueryView().getAdminCarInfo();
		new EndView().AgetAdminCarInfoEnd();
			break;
			
		// �������
		case "6":
			new AdminCaseView().AddCar();
			break;
			
		// �޸�������Ϣ
		case "7":
			new ModifyView().modifyPage();
			break;
			
		// �鿴������¼
		case "8":
			new QueryView().getAllRecord();
			new AdminCaseView().getRecord();
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�밴��ϵͳ��ʾ���в�����");
			new PageView().adminPage();
			break;
		}
	}
}