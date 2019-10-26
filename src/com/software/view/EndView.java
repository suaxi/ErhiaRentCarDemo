package com.software.view;

import java.util.Scanner;

public class EndView {
	
	public void RentCarEnd() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("========================");
	System.out.println("1.返回主菜单  2.退出");
	String choose = scanner.next();
	switch (choose) {
	case "1":
		new PageView().userPage();
		break;
		
	case "2":
		System.out.println("已退出！");
		System.exit(0);
		break;

	default:
		System.out.println("无效操作！");
		System.out.println("请根据系统提示完成操作！");
		new EndView().RentCarEnd();
		break;
	}
}
	public void PriceADEnd() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("========================");
	System.out.println("1.返回主菜单  2.租车  3.退出");
	String choose = scanner.next();
	switch (choose) {
	case "1":
		new PageView().userPage();
		break;
		
	case "2":
		new UserCaseView().RentCar();
		break;
		
	case "3":
		System.out.println("已退出！");
		System.exit(0);
		break;

	default:
		System.out.println("无效操作！");
		System.out.println("请根据系统提示完成操作！");
		new EndView().PriceADEnd();
		break;
	}
}
	
	public void CateSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.租车  3.按品牌搜索  4.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().CateSelectEnd();
			break;
		}
	}
	
	public void BrandSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.租车  3.按类型  4.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void GetCarInfoEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.租车  3.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().RentCar();
			break;
					
		case "3":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void SelectRecordEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.还车  4.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().userPage();
			break;
			
		case "2":
			new UserCaseView().ReturnCar();
			break;
					
		case "3":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().BrandSelectEnd();
			break;
		}
	}
	
	public void ReturnCarEnd() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("========================");
			System.out.println("1.返回主菜单  2.退出");
			String choose = scanner.next();
			switch (choose) {
			case "1":
				new PageView().userPage();
				break;
				
			case "2":
				System.out.println("已退出！");
				System.exit(0);
				break;

			default:
				System.out.println("无效操作！");
				System.out.println("请根据系统提示完成操作！");
				new EndView().RentCarEnd();
				break;
			}
	}
	
	public void AgetCarInfoFoIdEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().AgetCarInfoFoIdEnd();
			break;
		}
	}
	public void APriceADEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().APriceADEnd();
			break;
		}
	}
	
	public void ACateSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.按品牌搜索  3.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new AdminCaseView().BrandSelect();
			break;
			
		case "3":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().ACateSelectEnd();
			break;
		}
	}
	
	public void ABrandSelectEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.按类型搜索  3.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new PageView().adminPage();
			break;
			
		case "2":
			new AdminCaseView().CateSelect();
			break;
			
		case "3":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().ABrandSelectEnd();
			break;
		}
	}
	
	public void AgetAdminCarInfoEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.添加汽车信息  3.修改汽车信息  4.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().AgetAdminCarInfoEnd();
			break;
		}
	}
	
	public void AddCarEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.查看全部汽车  3.修改汽车信息  4.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().AddCarEnd();
			break;
		}
	}
	
	public void modifyPageEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主菜单  2.查看全部汽车  3.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().modifyPageEnd();
			break;
		}
	}
	
	public void ResetEnd() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.返回主页面  2.退出");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			new StartView().start();
			break;
			
		case "2":
			System.out.println("已退出！");
			System.exit(0);
			break;

		default:
			System.out.println("无效操作！");
			System.out.println("请根据系统提示完成操作！");
			new EndView().ResetEnd();
			break;
		}
	}
}
