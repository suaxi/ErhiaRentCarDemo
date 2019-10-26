package com.software.view;

import com.software.service.impl.ModifyInfoServiceImpl;

public class ModifyDemo {

	// 修改车牌号
	public void ModifyCarNumber(String CarId, String CarNumber) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyCarNumber(CarId, CarNumber);
	}

	// 修改汽车品牌
	public void ModifyBrandId(String CarId, int BrandId) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyBrandId(CarId, BrandId);
	}

	// 修改汽车颜色
	public void ModifyColor(String CarId, String Color) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyColor(CarId, Color);
	}

	// 修改汽车车型
	public void ModifyModel(String CarId, String Model) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyModel(CarId, Model);
	}

	// 修改类型
	public void ModifyCategoryId(String CarId, int CategoryId) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyCategoryId(CarId, CategoryId);
	}

	// 修改概要：手/自动，排量
	public void ModifyTComments(String CarId, String TComments) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyTComments(CarId, TComments);
	}

	// 修改价格
	public void ModifyPrice(String CarId, double Price) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyPrice(CarId, Price);
	}

	// 修改租金
	public void ModifyRent(String CarId, double Rent) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyRent(CarId, Rent);
	}

	// 修改是否可借
	public void ModifyStatus(String CarId, int Status) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyStatus(CarId, Status);
	}

	// 修改是否可租
	public void ModifyUseable(String CarId, int Useable) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyUseable(CarId, Useable);
	}
}