
package Test;

import java.util.Scanner;

import com.software.service.impl.CheckServiceImpl;
import com.software.service.impl.UserServiceImpl;

/** 

* @author ����: 007

* @version ����ʱ�䣺2019��5��15�� ����12:33:03 

* ��˵�� 

*/

public class UserReSetPassword {
	public static void main(String[] args) {
		UserReSetPassword userReSetPassword = new UserReSetPassword();
		userReSetPassword.reset();
	}
	public void reset() {
		System.out.println("�������û�����");
		Scanner scanner = new Scanner(System.in);
		String userName=scanner.next();
		new CheckServiceImpl().Check(userName);
			if(new CheckServiceImpl().Check(userName)==true)
				{System.out.println("���û��������ڣ����������룡");
					new UserReSetPassword().reset();}
			System.out.println("���������֤��");
			String idNumber=scanner.next();
			if(new CheckServiceImpl().Checkid(idNumber)==false) {
				System.out.println("���֤��֤�ɹ���");
			}else {
				System.out.println("���֤����������������룡");
				new UserReSetPassword().reset(); 
			}
			System.out.println("�����µ����룺");
			String passWord=scanner.next();
			UserServiceImpl userServiceImpl = new UserServiceImpl();
			userServiceImpl.resetPassword(userName, idNumber,passWord);
	}
}
