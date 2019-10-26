package com.software.view;

import java.util.List;

import com.software.entity.RentalCar;
import com.software.service.impl.OrderInfoServiceImpl;

//用户租车后产生的租车订单  （用户可见）
public class OrderInfoView {

	public void getOrderInfo(String CarId) {
		System.out.println("=========================");
		System.out.println("编号\t汽车名称\t每日租金\t备注\t品牌\t类型\t借车时间\t");
		OrderInfoServiceImpl orderInfoServiceImpl = new OrderInfoServiceImpl();
		List<RentalCar> list = orderInfoServiceImpl.OrderInfo(CarId);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getModel() + "\t" + car.getRent() + "\t" + car.getT_comments()
					+ "\t" + car.getBrand_name() + "\t" + car.getCategory_name() + "\t" + car.getStart_date() + "\t");
		}
	}

	public void UserOrderInfo(int UserId) {
		System.out.println("=========================");
		System.out.println("编号\t汽车编号\t汽车名称\t租金总额\t备注\t品牌\t类型\t借车时间\t还车时间\t");
		OrderInfoServiceImpl orderInfoServiceImpl = new OrderInfoServiceImpl();
		List<RentalCar> list = orderInfoServiceImpl.UserOrderInfo(UserId);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getCar_id() + "\t" + car.getModel() + "\t" + car.getPayment()
					+ "\t" + car.getT_comments() + "\t" + car.getBrand_name() + "\t" + car.getCategory_name() + "\t"
					+ car.getStart_date() + "\t" + car.getReturn_date() + "\t");
		}
	}
	
	public void UserAllOrderInfo(int UserId) {
		System.out.println("=========================");
		System.out.println("编号\t汽车编号\t汽车名称\t租金总额\t备注\t品牌\t类型\t借车时间\t还车时间\t");
		OrderInfoServiceImpl orderInfoServiceImpl = new OrderInfoServiceImpl();
		List<RentalCar> list = orderInfoServiceImpl.UserAllOrderInfo(UserId);
		for (RentalCar car : list) {
			System.out.println(car.getId() + "\t" + car.getCar_id() + "\t" + car.getModel() + "\t" + car.getPayment()
					+ "\t" + car.getT_comments() + "\t" + car.getBrand_name() + "\t" + car.getCategory_name() + "\t"
					+ car.getStart_date() + "\t" + car.getReturn_date() + "\t");
		}
	}
}