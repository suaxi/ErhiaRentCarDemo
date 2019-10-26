
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
	System.out.println("输入0退出");
	System.out.println("输入1进入租车订单");
	System.out.println("输入2按价格降/升序排序");
	System.out.println("输入3按类型搜索");
	System.out.println("输入4按品牌搜索");
	System.out.println("输入5查看全部汽车");
	System.out.println("输入6查看我的租车记录");
	System.out.println("输入7还车");
	System.out.println("=============================");
	Scanner scanner = new Scanner(System.in);
	String choose = scanner.next();
	switch (choose) {
	// 退出
	case "0":
		System.out.println("已退出！");
		System.exit(0);
		break;

	// 进入租车订单
	case "1":
		new UserCaseView().RentCar();
		break;

	// 按价格降/升序查询
	case "2":
		new UserCaseView().PriceAD();
		break;

	// 按类型搜索
	case "3":
		new UserCaseView().CateSelect();
	break;

	// 按品牌搜索
	case "4":
		new UserCaseView().BrandSelect();
		break;

	// 查看全部汽车信息
	case "5":
		new UserCaseView().GetCarInfo();
		break;

	// 查看我的租车记录
	case "6":
		new UserCaseView().SelectRecord();
		new EndView().SelectRecordEnd();
		break;

	// 还车
	case "7":
		new UserCaseView().SelectRecord();
		new UserCaseView().ReturnCar();
		break;

	default:
		System.out.println("无效操作！");
		System.out.println("请按照系统提示进行操作！");
		System.out.println("========================");
		new PageView().userPage();
		break;
	}
}

	public void adminPage() {
		System.out.println("输入0退出");
		System.out.println("输入1查看指定汽车");
		System.out.println("输入2按价格降/升序排序");
		System.out.println("输入3按类型搜索");
		System.out.println("输入4按品牌搜索");
		System.out.println("输入5查看全部汽车");
		System.out.println("输入6添加汽车");
		System.out.println("输入7修改汽车信息");
		System.out.println("输入8查看汽车记录");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String choose = scanner.next();
		switch (choose) {
		// 退出
		case "0":
			System.out.println("已退出！");
			System.exit(0);
			break;

		// 查看指定汽车
		case "1":
			new AdminCaseView().getCarInfoForId();
			break;
			
		// 按价格降/升序排序
		case "2":
			new AdminCaseView().PriceAD();
			break;
			
		// 按类型搜索
		case "3":
			new AdminCaseView().CateSelect();
			break;
			
		// 按品牌搜索
		case "4":
			new AdminCaseView().BrandSelect();
			break;
			
		// 查看全部汽车
		case "5":
		new QueryView().getAdminCarInfo();
		new EndView().AgetAdminCarInfoEnd();
			break;
			
		// 添加汽车
		case "6":
			new AdminCaseView().AddCar();
			break;
			
		// 修改汽车信息
		case "7":
			new ModifyView().modifyPage();
			break;
			
		// 查看汽车记录
		case "8":
			new QueryView().getAllRecord();
			new AdminCaseView().getRecord();
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请按照系统提示进行操作！");
			new PageView().adminPage();
			break;
		}
	}
}