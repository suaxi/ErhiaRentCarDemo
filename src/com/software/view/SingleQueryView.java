
package com.software.view;

import java.util.List;
import java.util.Scanner;

import com.software.entity.Car;
import com.software.entity.RentalCar;
import com.software.service.impl.SingleQueryServiceImpl;


public class SingleQueryView {

	public void getCarInfoId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.SingQueryId(num);
		for (RentalCar car : list) {
			System.out.println(
					car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t" + car.getBrand_name() + "\t"
							+ car.getCategory_name() + "\t" + car.getRent() + "\t" + car.getUseable() + "\t");
		}
	}

	public void getCarInfoBrId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.SingQueryBrId(num);
		for (RentalCar car : list) {
			System.out.println(
					car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t" + car.getBrand_name() + "\t"
							+ car.getCategory_name() + "\t" + car.getRent() + "\t" + car.getUseable() + "\t");
		}
	}

	public void getCarInfoCaId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.SingQueryCaId(num);
		for (RentalCar car : list) {
			System.out.println(
					car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t" + car.getBrand_name() + "\t"
							+ car.getCategory_name() + "\t" + car.getRent() + "\t" + car.getUseable() + "\t");
		}
	}

	public void AdgetCarInfoCaId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.AdSingQueryCaId(num);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t"
					+ car.getBrand_name() + "\t" + car.getCategory_name() + "\t" + car.getRent() + "\t"
					+ car.getUseable() + "\t" + car.getStatus() + "\t");
		}
	}

	public void AdgetCarInfoBrId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.AdSingQueryBrId(num);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t"
					+ car.getBrand_name() + "\t" + car.getCategory_name() + "\t" + car.getRent() + "\t"
					+ car.getUseable() + "\t" + car.getStatus() + "\t");
		}
	}

	public void AdgetCarInfoId(String num) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<RentalCar> list = singleQueryServiceImpl.AdSingQueryId(num);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getModel() + "\t" + car.getT_comments() + "\t"
					+ car.getBrand_name() + "\t" + car.getCategory_name() + "\t" + car.getRent() + "\t"
					+ car.getUseable() + "\t" + car.getStatus() + "\t");
		}
	}

	public void UserSingleQueryCar(String CarId) {
		System.out.println("=========================");
		System.out.println("编号\t车牌号\t品牌\t车型\t颜色\t类型\t备注\t价格\t\t租金\t是否可租\t");
		SingleQueryServiceImpl singleQueryServiceImpl = new SingleQueryServiceImpl();
		List<Car> list = singleQueryServiceImpl.UserSingleQueryCar(CarId);
		for (Car car : list) {
			System.out.println(car.getId() + "\t" + car.getCarNumber() + "\t" + car.getBrand_id() + "\t"
					+ car.getModel() + "\t" + car.getColor() + "\t" + car.getCategory_id() + "\t" + car.getT_comments()
					+ "\t" + car.getPrice() + "\t"+ car.getRent() + "\t" + car.getUseable() + "\t");
		}
	}

}
