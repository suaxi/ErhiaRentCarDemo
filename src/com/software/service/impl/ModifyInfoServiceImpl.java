package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.ModifyInfoDaoImpl;
import com.software.service.IModifyInfoService;

public class ModifyInfoServiceImpl implements IModifyInfoService {

	// 修改车牌号
	@Override
	public void ModifyCarNumber(String CarId, String CarNumber) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyCarNumber(CarId, CarNumber);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改颜色
	@Override
	public void ModifyColor(String CarId, String Color) {
		ModifyInfoDaoImpl modifyInfoDaoImpl = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDaoImpl.ModifyColor(CarId, Color);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 修改汽车品牌
	@Override
	public void ModifyBrandId(String CarId, int BrandId) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyBrandId(CarId, BrandId);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改汽车车型
	@Override
	public void ModifyModel(String CarId, String Model) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyModel(CarId, Model);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改汽车类型
	@Override
	public void ModifyCategoryId(String CarId, int CategoryId) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyCategoryId(CarId, CategoryId);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改概要：手/自动，排量
	@Override
	public void ModifyTComments(String CarId, String TComments) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyTComments(CarId, TComments);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改价格
	@Override
	public void ModifyPrice(String CarId, double Price) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyPrice(CarId, Price);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改租金
	@Override
	public void ModifyRent(String CarId, double Rent) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyRent(CarId, Rent);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改是否上架
	@Override
	public void ModifyStatus(String CarId, int Status) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyStatus(CarId, Status);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改是否可租
	@Override
	public void ModifyUseable(String CarId, int Useable) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyUseable(CarId, Useable);
			if (rows > 0) {
				System.out.println("更新了" + rows + "数据！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
