package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.ModifyInfoDaoImpl;
import com.software.service.IModifyInfoService;

public class ModifyInfoServiceImpl implements IModifyInfoService {

	// �޸ĳ��ƺ�
	@Override
	public void ModifyCarNumber(String CarId, String CarNumber) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyCarNumber(CarId, CarNumber);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸���ɫ
	@Override
	public void ModifyColor(String CarId, String Color) {
		ModifyInfoDaoImpl modifyInfoDaoImpl = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDaoImpl.ModifyColor(CarId, Color);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// �޸�����Ʒ��
	@Override
	public void ModifyBrandId(String CarId, int BrandId) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyBrandId(CarId, BrandId);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸���������
	@Override
	public void ModifyModel(String CarId, String Model) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyModel(CarId, Model);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸���������
	@Override
	public void ModifyCategoryId(String CarId, int CategoryId) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyCategoryId(CarId, CategoryId);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸ĸ�Ҫ����/�Զ�������
	@Override
	public void ModifyTComments(String CarId, String TComments) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyTComments(CarId, TComments);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸ļ۸�
	@Override
	public void ModifyPrice(String CarId, double Price) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyPrice(CarId, Price);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸����
	@Override
	public void ModifyRent(String CarId, double Rent) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyRent(CarId, Rent);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸��Ƿ��ϼ�
	@Override
	public void ModifyStatus(String CarId, int Status) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyStatus(CarId, Status);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �޸��Ƿ����
	@Override
	public void ModifyUseable(String CarId, int Useable) {
		ModifyInfoDaoImpl modifyInfoDao = new ModifyInfoDaoImpl();
		try {
			int rows = modifyInfoDao.ModifyUseable(CarId, Useable);
			if (rows > 0) {
				System.out.println("������" + rows + "���ݣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
