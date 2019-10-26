package com.software.service;

public interface IModifyInfoService {
	public void ModifyCarNumber(String CarId,String CarNumber);
	public void ModifyColor(String CarId,String Color);
	public void ModifyBrandId(String CarId,int BrandId);
	public void ModifyModel(String CarId,String Model);
	public void ModifyCategoryId(String CarId,int CategoryId);
	public void ModifyTComments(String CarId,String TComments);
	public void ModifyPrice(String CarId,double Price);
	public void ModifyRent(String CarId,double Rent);
	public void ModifyStatus(String CarId,int Status);
	public void ModifyUseable(String CarId,int Useable);
}
