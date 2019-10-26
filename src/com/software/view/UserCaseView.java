package com.software.view;

import java.util.List;
import java.util.Scanner;

import com.software.entity.Car;
import com.software.entity.AllRecord;
import com.software.entity.RentalCar;
import com.software.entity.User;
import com.software.service.impl.CheckServiceImpl;
import com.software.service.impl.OrderInfoServiceImpl;
import com.software.service.impl.SaveRecordServiceImpl;
import com.software.service.impl.UserServiceImpl;
import com.software.util.Md5;


public class UserCaseView {
	
	public void RentCar() {
		String UserName = null;
		User user;
		int UserId; 
		new QueryView().getCarInfo();
		System.out.println("========================");
		System.out.println("��������Ҫ��Ƹ��������ţ�");
		Scanner scanner = new Scanner(System.in);
		String CarId = scanner.next();
		new  SingleQueryView().UserSingleQueryCar(CarId);
		System.out.println("========================");
		System.out.println("�������û�����ȷ����Ƹ��������");
		UserName= scanner.next();
		user = new RentalCarDemo().getUserIdForUserName(UserName);
		UserId = user.getId();
		new RentalCarDemo().SaveRecord(UserId, CarId);
		new OrderInfoView().getOrderInfo(CarId);
		new RentalCarDemo().RentCar(CarId);
		new EndView().RentCarEnd();
	}
	

	public void PriceAD() {
		System.out.println("1.���� ");
		System.out.println("2.���� ");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new QueryView().getCarInfoA();
			break;

		case "2":
			new QueryView().getCarInfoD();
			break;

			default:
				System.out.println("��Ч������");
				System.out.println("�����ϵͳ��ʾ��ɲ�����");
				new UserCaseView().PriceAD();
			break;
		}	
		new EndView().PriceADEnd();
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
			new SingleQueryView().getCarInfoCaId(choose);
			break;

		case "2":
			new SingleQueryView().getCarInfoCaId(choose);
			break;

		case "3":
			new SingleQueryView().getCarInfoCaId(choose);
			break;

		case "4":
			new SingleQueryView().getCarInfoCaId(choose);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new UserCaseView().CateSelect();
			break;
		}
		new EndView().CateSelectEnd();
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
			new SingleQueryView().getCarInfoBrId(choose);
			break;

		case "2":
			new SingleQueryView().getCarInfoBrId(choose);
			break;

		case "3":
			new SingleQueryView().getCarInfoBrId(choose);
			break;

		case "4":
			new SingleQueryView().getCarInfoBrId(choose);
			break;
			
		case "5":
			new SingleQueryView().getCarInfoBrId(choose);
			break;

		default:
			System.out.println("��Ч������");
			System.out.println("�����ϵͳ��ʾ��ɲ�����");
			new UserCaseView().BrandSelect();
			break;
		}
		
	}
	
	
	
	public void getOrderInfo(String CarId) {
		System.out.println("=========================");
		System.out.println("���\t��������\tÿ�����\t��ע\tƷ��\t����\t�賵ʱ��\t");
		OrderInfoServiceImpl orderInfoServiceImpl = new OrderInfoServiceImpl();
		List<RentalCar> list = orderInfoServiceImpl.OrderInfo(CarId);
		for (RentalCar car : list) {
			System.out.println(
					car.getId()+"\t"
					+car.getModel()+"\t"
					+car.getRent()+"\t"
					+car.getT_comments()+"\t"
					+car.getBrand_name()+"\t"
					+car.getCategory_name()+"\t"
					+car.getStart_date()+"\t");
		}
	}
	
	public void GetCarInfo() {
		new QueryView().getCarInfo();
		new EndView().GetCarInfoEnd();
	}
	
	
	public void SelectRecord() {
		System.out.println("=============================");
		System.out.println("Ϊ��֤�Ǳ��˲��������ٴ������û��������룡");
		System.out.println("=============================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("�û�����");
		String userName = scanner.next();
		System.out.println("���룺");
		String PassWord = scanner.next();
		Md5 md5 = new Md5();
		String passWord =md5.md5(PassWord) ;
		User user = new RentalCarDemo().getUserIdForUP(userName, passWord);
		int UserId = user.getId();
		new OrderInfoView().UserOrderInfo(UserId);
	}
	
	public void ReturnCar() {
		System.out.println("========================");
		System.out.println("��������Ҫ���л���������������ţ�");
		Scanner scanner = new Scanner(System.in);
		String CarId = scanner.next();
		RentalCarDemo rentalCarDemo = new RentalCarDemo();
		rentalCarDemo.ReturnCar(CarId);
		rentalCarDemo.SaveReturnRecord(CarId);
		double payment = rentalCarDemo.getPayment(CarId);
		rentalCarDemo.SaveCarPayment(CarId, payment);
		new EndView().ReturnCarEnd();
	}
	
	public void Reset() {
		System.out.println("========================");
		System.out.println("��������");
		System.out.println("========================");
		System.out.println("�������û�����");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		CheckServiceImpl checkServiceImpl = new CheckServiceImpl();
		checkServiceImpl.Check(userName);
		if(checkServiceImpl.Check(userName)==true) {
			System.out.println("���û��������ڣ����������룡");
			new UserCaseView().Reset();
		}
		System.out.println("���������֤��");
		String idNumber=scanner.next();
		if(checkServiceImpl.Checkid(idNumber)==false) {
			System.out.println("�������µ�����");
			String PassWord = scanner.next();
			Md5 md5 = new Md5();
			String passWord = md5.md5(PassWord);
			new UserServiceImpl().resetPassword(userName, idNumber, passWord);
		}else {
			System.out.println("���֤����������������룡");
			new UserCaseView().Reset();
		}
	}
}
