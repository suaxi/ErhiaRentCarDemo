package com.software.view;

import java.util.Scanner;

import com.software.entity.Car;
import com.software.service.impl.AddCarServiceImpl;

public class AdminCaseView {
	public void PriceAD() {
		System.out.println("1.���� ");
		System.out.println("2.���� ");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new QueryView().getAdminCarInfoA();
			break;

		case "2":
			new QueryView().getAdminCarInfoD();
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new AdminCaseView().PriceAD();
			break;
		}
		new EndView().APriceADEnd();
	}

	public void CateSelect() {
		System.out.println("1.������ ");
		System.out.println("2.������");
		System.out.println("3.SUV");
		System.out.println("4.��Ӣ��");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new SingleQueryView().AdgetCarInfoCaId(choose);
			break;

		case "2":
			new SingleQueryView().AdgetCarInfoCaId(choose);
			break;

		case "3":
			new SingleQueryView().AdgetCarInfoCaId(choose);
			break;

		case "4":
			new SingleQueryView().AdgetCarInfoCaId(choose);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new AdminCaseView().CateSelect();
			break;
		}
		new EndView().ACateSelectEnd();
	}

	public void BrandSelect() {
		System.out.println("1.���� ");
		System.out.println("2.����");
		System.out.println("3.�µ�");
		System.out.println("4.����");
		System.out.println("5.����");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new SingleQueryView().AdgetCarInfoBrId(choose);
			break;

		case "2":
			new SingleQueryView().AdgetCarInfoBrId(choose);
			break;

		case "3":
			new SingleQueryView().AdgetCarInfoBrId(choose);
			break;

		case "4":
			new SingleQueryView().AdgetCarInfoBrId(choose);
			break;

		case "5":
			new SingleQueryView().AdgetCarInfoBrId(choose);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new AdminCaseView().BrandSelect();
			break;
		}
		new EndView().ABrandSelectEnd();
	}

	public void AddCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������Ϣ��");
		System.out.println("-----------------------");
		System.out.println("Ʒ������:");
		System.out.println("Ʒ�Ʊ��\tƷ����\t");
		System.out.println("1\t����\t");
		System.out.println("2\t����\t");
		System.out.println("3\t�µ�\t");
		System.out.println("4\t����\t");
		System.out.println("5\t����\t");
		System.out.println("��ѡ��Ʒ�Ʊ�ţ�");
		long brand_id = scanner.nextLong();
		System.out.println("-----------------------");
		System.out.println("�������£�");
		System.out.println("1\t������\t");
		System.out.println("2\t������\t");
		System.out.println("3\tSUV\t");
		System.out.println("4\t��Ӣ��\t");
		System.out.println("��ѡ�����ͱ�ţ�");
		long category_id = scanner.nextLong();
		System.out.println("-----------------------");
		System.out.println("�ͺţ�");
		String model = scanner.next();
		System.out.println("-----------------------");
		System.out.print("���ƺţ�");
		String carNumber = scanner.next();
		System.out.println("-----------------------");
		System.out.print("��Ҫ��");
		String t_comments = scanner.next();
		System.out.println("-----------------------");
		System.out.print("��ɫ��");
		String color = scanner.next();
		System.out.println("-----------------------");
		System.out.println("�����۸�");
		double price = scanner.nextDouble();
		System.out.println("-----------------------");
		System.out.println("ÿ�����");
		int rent = scanner.nextInt();
		System.out.println("-----------------------");
		System.out.println("�Ƿ�ɽ裨0:�ɽ� 1:���ɽ裩");
		String useable = scanner.next();
		System.out.println("-----------------------");
		System.out.println("�Ƿ��ϼܣ�0:�ϼ� 1:�¼ܣ�");
		String status = scanner.next();
		Car car = new Car(0, carNumber, brand_id, model, color, category_id, t_comments, price, rent, status, useable);
		AddCarServiceImpl as = new AddCarServiceImpl();
		as.addCar(car);
		System.out.println();
		new EndView().AddCarEnd();
	}

	public void getCarInfoForId() {
		Scanner scanner = new Scanner(System.in);
		new QueryView().getAdminCarInfo();
		System.out.println("��������Ҫ�鿴�����ı�ţ�");
		String num = scanner.next();
		new SingleQueryView().AdgetCarInfoId(num);
		new EndView().AgetCarInfoFoIdEnd();
	}

	public void getRecord() {

		System.out.println("����0 �˳�");
		System.out.println("����5 �鿴ȫ������");
		System.out.println("����6 �鿴ȫ����Ƹ��¼");
		System.out.println("����7 �鿴ָ���û���Ƹ��¼");
		System.out.println("����8 �鿴ָ��������Ƹ��¼");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		// �˳�
		case "0":
			System.out.println("���˳���");
			System.exit(0);
			break;
		// �鿴ȫ������
		case "5":
			new QueryView().getAdminCarInfo();
			break;
		// �鿴ȫ����Ƹ��¼
		case "6":
			new QueryView().getAllRecord();
			break;
		// �鿴ָ���û���Ƹ��¼
		case "7":
			System.out.println("��������Ҫ�鿴��Ƹ��¼���û���");
			String UserName = scanner.next();
			new QueryView().getRecordForUid(UserName);
			break;
		// �鿴ָ��������Ƹ��¼
		case "8":
			new QueryView().getAdminCarInfo();
			System.out.println("��������Ҫ�鿴��Ƹ��¼���������");
			String CarId = scanner.next();
			new QueryView().getRecordForCid(CarId);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new AdminCaseView().getRecord();
			break;
		}
	}

	

	
	public void modify(String CarId) {
		System.out.println("��������Ҫ�޸ĵ����ݵı�ţ�");
		System.out.println("���\t����\t");
		System.out.println("1\t���ƺ�\t");
		System.out.println("2\tƷ��\t");
		System.out.println("3\t����\t");
		System.out.println("4\t��ɫ\t");
		System.out.println("5\t����\t");
		System.out.println("6\t��ע\t");
		System.out.println("7\t�۸�\t");
		System.out.println("8\t���\t");
		System.out.println("9\t�Ƿ�ɽ�\t");
		System.out.println("10\t�Ƿ��ϼ�\t");
		System.out.println("0\t�˳�\t");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			System.out.println("---------------------------------");
			System.out.println("�������µĳ��ƺţ�");
			String CarNumber = scanner.next();
			new ModifyDemo().ModifyCarNumber(CarId, CarNumber);
			break;

		case "2":
			System.out.println("---------------------------------");
			System.out.println("��ѡ���µ�Ʒ�ƣ�");
			System.out.println("���\tƷ��\t");
			System.out.println("1\t��־\t");
			System.out.println("2\t����\t");
			System.out.println("3\t�µ�\t");
			System.out.println("4\t����\t");
			System.out.println("5\t����\t");
			System.out.println("---------------------------------");
			int  BrandId = scanner.nextInt();
			new ModifyDemo().ModifyBrandId(CarId, BrandId);
			break;

		case "3":
			System.out.println("---------------------------------");
			System.out.println("�������µĳ��ͣ�");
			String Model = scanner.next();
			new ModifyDemo().ModifyModel(CarId, Model);
			break;

		case "4":
			System.out.println("---------------------------------");
			System.out.println("�������µ���ɫ��");
			String Color = scanner.next();
			new ModifyDemo().ModifyColor(CarId, Color);
			break;

		case "5":
			System.out.println("---------------------------------");
			System.out.println("��ѡ���µ����ͣ�");
			System.out.println("���\t����\t");
			System.out.println("1\t������\t");
			System.out.println("2\t������\t");
			System.out.println("3\tSUV\t");
			System.out.println("4\t��Ӣ��\t");
			System.out.println("---------------------------------");
			int CategoryId = scanner.nextInt();
			new ModifyDemo().ModifyCategoryId(CarId, CategoryId);
			break;

		case "6":
			System.out.println("---------------------------------");
			System.out.println("�������µı�ע��");
			String TComments = scanner.next();
			new ModifyDemo().ModifyTComments(CarId, TComments);
			break;

		case "7":
			System.out.println("---------------------------------");
			System.out.println("�������µļ۸�");
			double Price = scanner.nextDouble();
			new ModifyDemo().ModifyPrice(CarId, Price);;
			break;

		case "8":
			System.out.println("---------------------------------");
			System.out.println("�������µ����");
			double Rent = scanner.nextDouble();
			new ModifyDemo().ModifyRent(CarId, Rent);
			break;
		case "9":
			System.out.println("---------------------------------");
			System.out.println("��ѡ���Ƿ�ɽ裺");
			System.out.println("���\t����\t");
			System.out.println("0\t�ɽ�\t");
			System.out.println("1\t���ɽ�\t");
			System.out.println("---------------------------------");
			int  Useable = scanner.nextInt();
			new ModifyDemo().ModifyUseable(CarId, Useable);
			break;
		case "10":
			System.out.println("---------------------------------");
			System.out.println("��ѡ���Ƿ��ϼܣ�");
			System.out.println("���\t����\t");
			System.out.println("0\t�ϼ�\t");
			System.out.println("1\t�¼�\t");
			System.out.println("---------------------------------");
			int  Status = scanner.nextInt();
			new ModifyDemo().ModifyStatus(CarId, Status);
			break;
			
		case "0":
			System.exit(0);
			System.out.println("���˳���");
			break;
			
		default:
			System.out.println("�밴��ϵͳ��ʾ��ɲ�����");
			break;
		}
		
		
		
	}
}
