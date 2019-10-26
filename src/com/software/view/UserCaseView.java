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
		System.out.println("请输入需要租聘的汽车编号：");
		Scanner scanner = new Scanner(System.in);
		String CarId = scanner.next();
		new  SingleQueryView().UserSingleQueryCar(CarId);
		System.out.println("========================");
		System.out.println("请输入用户名，确认租聘该汽车！");
		UserName= scanner.next();
		user = new RentalCarDemo().getUserIdForUserName(UserName);
		UserId = user.getId();
		new RentalCarDemo().SaveRecord(UserId, CarId);
		new OrderInfoView().getOrderInfo(CarId);
		new RentalCarDemo().RentCar(CarId);
		new EndView().RentCarEnd();
	}
	

	public void PriceAD() {
		System.out.println("1.升序 ");
		System.out.println("2.降序 ");
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
				System.out.println("无效操作！");
				System.out.println("请根据系统提示完成操作！");
				new UserCaseView().PriceAD();
			break;
		}	
		new EndView().PriceADEnd();
	}

	public void CateSelect() {
		System.out.println("1.紧凑型 ");
		System.out.println("2.舒适性");
		System.out.println("3.SUV");
		System.out.println("4.精英型");
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
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new UserCaseView().CateSelect();
			break;
		}
		new EndView().CateSelectEnd();
	}
	
	
	public void BrandSelect() {
		System.out.println("1.标致 ");
		System.out.println("2.大众");
		System.out.println("3.奥迪");
		System.out.println("4.奔驰");
		System.out.println("5.宝马");
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
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new UserCaseView().BrandSelect();
			break;
		}
		
	}
	
	
	
	public void getOrderInfo(String CarId) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t每日租金\t备注\t品牌\t类型\t借车时间\t");
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
		System.out.println("为保证是本人操作，请再次输入用户名和密码！");
		System.out.println("=============================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("用户名：");
		String userName = scanner.next();
		System.out.println("密码：");
		String PassWord = scanner.next();
		Md5 md5 = new Md5();
		String passWord =md5.md5(PassWord) ;
		User user = new RentalCarDemo().getUserIdForUP(userName, passWord);
		int UserId = user.getId();
		new OrderInfoView().UserOrderInfo(UserId);
	}
	
	public void ReturnCar() {
		System.out.println("========================");
		System.out.println("请输入需要进行还车操作的汽车编号：");
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
		System.out.println("重置密码");
		System.out.println("========================");
		System.out.println("请输入用户名：");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		CheckServiceImpl checkServiceImpl = new CheckServiceImpl();
		checkServiceImpl.Check(userName);
		if(checkServiceImpl.Check(userName)==true) {
			System.out.println("该用户名不存在，请重新输入！");
			new UserCaseView().Reset();
		}
		System.out.println("请输入身份证：");
		String idNumber=scanner.next();
		if(checkServiceImpl.Checkid(idNumber)==false) {
			System.out.println("请输入新的密码");
			String PassWord = scanner.next();
			Md5 md5 = new Md5();
			String passWord = md5.md5(PassWord);
			new UserServiceImpl().resetPassword(userName, idNumber, passWord);
		}else {
			System.out.println("身份证输入错误，请重新输入！");
			new UserCaseView().Reset();
		}
	}
}
