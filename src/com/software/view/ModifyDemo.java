package com.software.view;

import com.software.service.impl.ModifyInfoServiceImpl;

public class ModifyDemo {

	// �޸ĳ��ƺ�
	public void ModifyCarNumber(String CarId, String CarNumber) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyCarNumber(CarId, CarNumber);
	}

	// �޸�����Ʒ��
	public void ModifyBrandId(String CarId, int BrandId) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyBrandId(CarId, BrandId);
	}

	// �޸�������ɫ
	public void ModifyColor(String CarId, String Color) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyColor(CarId, Color);
	}

	// �޸���������
	public void ModifyModel(String CarId, String Model) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyModel(CarId, Model);
	}

	// �޸�����
	public void ModifyCategoryId(String CarId, int CategoryId) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyCategoryId(CarId, CategoryId);
	}

	// �޸ĸ�Ҫ����/�Զ�������
	public void ModifyTComments(String CarId, String TComments) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyTComments(CarId, TComments);
	}

	// �޸ļ۸�
	public void ModifyPrice(String CarId, double Price) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyPrice(CarId, Price);
	}

	// �޸����
	public void ModifyRent(String CarId, double Rent) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyRent(CarId, Rent);
	}

	// �޸��Ƿ�ɽ�
	public void ModifyStatus(String CarId, int Status) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyStatus(CarId, Status);
	}

	// �޸��Ƿ����
	public void ModifyUseable(String CarId, int Useable) {
		ModifyInfoServiceImpl modifyInfoServiceImpl = new ModifyInfoServiceImpl();
		modifyInfoServiceImpl.ModifyUseable(CarId, Useable);
	}
}