package com.software.view;

import java.util.Scanner;

import com.software.entity.Car;
import com.software.service.impl.AddCarServiceImpl;

public class AdminCaseView {
	public void PriceAD() {
		System.out.println("1.升序 ");
		System.out.println("2.降序 ");
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
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new AdminCaseView().PriceAD();
			break;
		}
		new EndView().APriceADEnd();
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
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new AdminCaseView().CateSelect();
			break;
		}
		new EndView().ACateSelectEnd();
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
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new AdminCaseView().BrandSelect();
			break;
		}
		new EndView().ABrandSelectEnd();
	}

	public void AddCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入以下信息：");
		System.out.println("-----------------------");
		System.out.println("品牌如下:");
		System.out.println("品牌编号\t品牌名\t");
		System.out.println("1\t标致\t");
		System.out.println("2\t大众\t");
		System.out.println("3\t奥迪\t");
		System.out.println("4\t奔驰\t");
		System.out.println("5\t宝马\t");
		System.out.println("请选择品牌编号：");
		long brand_id = scanner.nextLong();
		System.out.println("-----------------------");
		System.out.println("类型如下：");
		System.out.println("1\t紧凑型\t");
		System.out.println("2\t舒适型\t");
		System.out.println("3\tSUV\t");
		System.out.println("4\t精英型\t");
		System.out.println("请选择类型编号：");
		long category_id = scanner.nextLong();
		System.out.println("-----------------------");
		System.out.println("型号：");
		String model = scanner.next();
		System.out.println("-----------------------");
		System.out.print("车牌号：");
		String carNumber = scanner.next();
		System.out.println("-----------------------");
		System.out.print("概要：");
		String t_comments = scanner.next();
		System.out.println("-----------------------");
		System.out.print("颜色：");
		String color = scanner.next();
		System.out.println("-----------------------");
		System.out.println("汽车价格：");
		double price = scanner.nextDouble();
		System.out.println("-----------------------");
		System.out.println("每日租金：");
		int rent = scanner.nextInt();
		System.out.println("-----------------------");
		System.out.println("是否可借（0:可借 1:不可借）");
		String useable = scanner.next();
		System.out.println("-----------------------");
		System.out.println("是否上架（0:上架 1:下架）");
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
		System.out.println("请输入需要查看汽车的编号：");
		String num = scanner.next();
		new SingleQueryView().AdgetCarInfoId(num);
		new EndView().AgetCarInfoFoIdEnd();
	}

	public void getRecord() {

		System.out.println("输入0 退出");
		System.out.println("输入5 查看全部汽车");
		System.out.println("输入6 查看全部租聘记录");
		System.out.println("输入7 查看指定用户租聘记录");
		System.out.println("输入8 查看指定汽车租聘记录");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		// 退出
		case "0":
			System.out.println("已退出！");
			System.exit(0);
			break;
		// 查看全部汽车
		case "5":
			new QueryView().getAdminCarInfo();
			break;
		// 查看全部租聘记录
		case "6":
			new QueryView().getAllRecord();
			break;
		// 查看指定用户租聘记录
		case "7":
			System.out.println("请输入需要查看租聘记录的用户名");
			String UserName = scanner.next();
			new QueryView().getRecordForUid(UserName);
			break;
		// 查看指定汽车租聘记录
		case "8":
			new QueryView().getAdminCarInfo();
			System.out.println("请输入需要查看租聘记录的汽车编号");
			String CarId = scanner.next();
			new QueryView().getRecordForCid(CarId);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new AdminCaseView().getRecord();
			break;
		}
	}

	

	
	public void modify(String CarId) {
		System.out.println("请输入需要修改的内容的编号：");
		System.out.println("编号\t内容\t");
		System.out.println("1\t车牌号\t");
		System.out.println("2\t品牌\t");
		System.out.println("3\t车型\t");
		System.out.println("4\t颜色\t");
		System.out.println("5\t类型\t");
		System.out.println("6\t备注\t");
		System.out.println("7\t价格\t");
		System.out.println("8\t租金\t");
		System.out.println("9\t是否可借\t");
		System.out.println("10\t是否上架\t");
		System.out.println("0\t退出\t");
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		case "1":
			System.out.println("---------------------------------");
			System.out.println("请输入新的车牌号：");
			String CarNumber = scanner.next();
			new ModifyDemo().ModifyCarNumber(CarId, CarNumber);
			break;

		case "2":
			System.out.println("---------------------------------");
			System.out.println("请选择新的品牌：");
			System.out.println("编号\t品牌\t");
			System.out.println("1\t标志\t");
			System.out.println("2\t大众\t");
			System.out.println("3\t奥迪\t");
			System.out.println("4\t奔驰\t");
			System.out.println("5\t宝马\t");
			System.out.println("---------------------------------");
			int  BrandId = scanner.nextInt();
			new ModifyDemo().ModifyBrandId(CarId, BrandId);
			break;

		case "3":
			System.out.println("---------------------------------");
			System.out.println("请输入新的车型：");
			String Model = scanner.next();
			new ModifyDemo().ModifyModel(CarId, Model);
			break;

		case "4":
			System.out.println("---------------------------------");
			System.out.println("请输入新的颜色：");
			String Color = scanner.next();
			new ModifyDemo().ModifyColor(CarId, Color);
			break;

		case "5":
			System.out.println("---------------------------------");
			System.out.println("请选择新的类型：");
			System.out.println("编号\t类型\t");
			System.out.println("1\t紧凑型\t");
			System.out.println("2\t舒适型\t");
			System.out.println("3\tSUV\t");
			System.out.println("4\t精英型\t");
			System.out.println("---------------------------------");
			int CategoryId = scanner.nextInt();
			new ModifyDemo().ModifyCategoryId(CarId, CategoryId);
			break;

		case "6":
			System.out.println("---------------------------------");
			System.out.println("请输入新的备注：");
			String TComments = scanner.next();
			new ModifyDemo().ModifyTComments(CarId, TComments);
			break;

		case "7":
			System.out.println("---------------------------------");
			System.out.println("请输入新的价格：");
			double Price = scanner.nextDouble();
			new ModifyDemo().ModifyPrice(CarId, Price);;
			break;

		case "8":
			System.out.println("---------------------------------");
			System.out.println("请输入新的租金：");
			double Rent = scanner.nextDouble();
			new ModifyDemo().ModifyRent(CarId, Rent);
			break;
		case "9":
			System.out.println("---------------------------------");
			System.out.println("请选择是否可借：");
			System.out.println("编号\t类型\t");
			System.out.println("0\t可借\t");
			System.out.println("1\t不可借\t");
			System.out.println("---------------------------------");
			int  Useable = scanner.nextInt();
			new ModifyDemo().ModifyUseable(CarId, Useable);
			break;
		case "10":
			System.out.println("---------------------------------");
			System.out.println("请选择是否上架：");
			System.out.println("编号\t类型\t");
			System.out.println("0\t上架\t");
			System.out.println("1\t下架\t");
			System.out.println("---------------------------------");
			int  Status = scanner.nextInt();
			new ModifyDemo().ModifyStatus(CarId, Status);
			break;
			
		case "0":
			System.exit(0);
			System.out.println("已退出！");
			break;
			
		default:
			System.out.println("请按照系统提示完成操作！");
			break;
		}
		
		
		
	}
}
