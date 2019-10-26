package com.software.view;

import java.util.List;

import com.software.entity.AllRecord;
import com.software.entity.Car;
import com.software.entity.RentalCar;

import com.software.service.impl.CarServiceImpl;
import com.software.service.impl.GetRecordServiceImpl;;



public class QueryView {
/*	public static void main(String[] args) {
	QueryView queryView = new QueryView();
	queryView.getAdminCarInfo();
}*/

		public void getCarInfo(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.carInfo();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t");
			}
		}
		//按照价格升序
		public void getCarInfoA(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.carInfoA();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t");
			}
		}
		//按照价格降序
		public void getCarInfoD(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.carInfoD();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t");
			}
			}
		
		
		
		public void getAdminCarInfo(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.AdminCarInfo();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t"
						+car.getStatus());
			}
			
			
	}
		
		public void getAdminCarInfoA(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.AdminCarInfoA();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t"
						+car.getStatus());
			}
	}
		public void getAdminCarInfoD(){
			System.out.println("=========================");
			System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<RentalCar> list = carServiceImpl.AdminCarInfoD();
			for (RentalCar car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getModel()+"\t"
						+car.getT_comments()+"\t"
						+car.getBrand_name()+"\t"
						+car.getCategory_name()+"\t"
						+car.getRent()+"\t"
						+car.getUseable()+"\t"
						+car.getStatus());
			}
	}
		
		public void getAllRecord(){
			System.out.println("=========================");
			System.out.println("编号\t汽车编号\t汽车名称\t用户编号\t用户名\t每日租金\t租金总额\t备注\t品牌\t类型\t借车时间\t");
			GetRecordServiceImpl getRecordServiceImpl = new GetRecordServiceImpl();
			List<AllRecord> list = getRecordServiceImpl.getAllRecord();
		 for (AllRecord allRecord : list) {
			System.out.println(
					allRecord.getId()+"\t"
							+allRecord.getCar_id()+"\t"
							+allRecord.getModel()+"\t"
							+allRecord.getUser_id()+"\t"
							+allRecord.getUserName()+"\t"
							+allRecord.getRent()+"\t"
							+allRecord.getPayment()+"\t"
							+allRecord.getT_comments()+"\t"
							+allRecord.getBrand_name()+"\t"
							+allRecord.getCategory_name()+"\t"
							+allRecord.getStart_date());
		 }
		}
		
		public void getRecordForUid(String UserName){
			System.out.println("=========================");
			System.out.println("编号\t汽车编号\t汽车名称\t用户编号\t用户名\t每日租金\t租金总额\t备注\t品牌\t类型\t借车时间\t");
			GetRecordServiceImpl getRecordServiceImpl = new GetRecordServiceImpl();
			List<AllRecord> list = getRecordServiceImpl.getRecordForUid(UserName);
		 for (AllRecord allRecord : list) {
			System.out.println(
					allRecord.getId()+"\t"
							+allRecord.getCar_id()+"\t"
							+allRecord.getModel()+"\t"
							+allRecord.getUser_id()+"\t"
							+allRecord.getUserName()+"\t"
							+allRecord.getRent()+"\t"
							+allRecord.getPayment()+"\t"
							+allRecord.getT_comments()+"\t"
							+allRecord.getBrand_name()+"\t"
							+allRecord.getCategory_name()+"\t"
							+allRecord.getStart_date());
		 }
		}
		
		public void getRecordForCid(String CarId){
			System.out.println("=========================");
			System.out.println("编号\t汽车编号\t汽车名称\t用户编号\t用户名\t每日租金\t租金总额\t备注\t品牌\t类型\t借车时间\t");
			GetRecordServiceImpl getRecordServiceImpl = new GetRecordServiceImpl();
			List<AllRecord> list = getRecordServiceImpl.getRecordForCid(CarId);
		 for (AllRecord allRecord : list) {
			System.out.println(
					allRecord.getId()+"\t"
							+allRecord.getCar_id()+"\t"
							+allRecord.getModel()+"\t"
							+allRecord.getUser_id()+"\t"
							+allRecord.getUserName()+"\t"
							+allRecord.getRent()+"\t"
							+allRecord.getPayment()+"\t"
							+allRecord.getT_comments()+"\t"
							+allRecord.getBrand_name()+"\t"
							+allRecord.getCategory_name()+"\t"
							+allRecord.getStart_date());
		 }
		}
		
		
		public void AllCarInfo() {
			System.out.println("=========================");
			System.out.println("编号\t车牌号\t品牌\t车型\t颜色\t类型\t备注\t价格\t\t租金\t是否上架\t是否可租\t");
			CarServiceImpl carServiceImpl = new CarServiceImpl();
			List<Car> list = carServiceImpl.AllCarInfo();
			for (Car car : list) {
				System.out.println(
						car.getId()+"\t"
						+car.getCarNumber()+"\t"
						+car.getBrand_id()+"\t"
						+car.getModel()+"\t"
						+car.getColor()+"\t"
						+car.getCategory_id()+"\t"
						+car.getT_comments()+"\t"
						+car.getPrice()+"\t"
						+car.getRent()+"\t"
						+car.getStatus()+"\t"
						+car.getUseable()+"\t"
						);
			}
		}
	}

