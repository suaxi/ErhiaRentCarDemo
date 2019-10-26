
package Test;

import java.util.Scanner;

import com.software.service.impl.CheckServiceImpl;
import com.software.service.impl.UserServiceImpl;

/** 

* @author 作者: 007

* @version 创建时间：2019年5月15日 下午12:33:03 

* 类说明 

*/

public class UserReSetPassword {
	public static void main(String[] args) {
		UserReSetPassword userReSetPassword = new UserReSetPassword();
		userReSetPassword.reset();
	}
	public void reset() {
		System.out.println("请输入用户名：");
		Scanner scanner = new Scanner(System.in);
		String userName=scanner.next();
		new CheckServiceImpl().Check(userName);
			if(new CheckServiceImpl().Check(userName)==true)
				{System.out.println("改用户名不存在，请重新输入！");
					new UserReSetPassword().reset();}
			System.out.println("请输入身份证：");
			String idNumber=scanner.next();
			if(new CheckServiceImpl().Checkid(idNumber)==false) {
				System.out.println("身份证验证成功！");
			}else {
				System.out.println("身份证输入错误，请重新输入！");
				new UserReSetPassword().reset(); 
			}
			System.out.println("输入新的密码：");
			String passWord=scanner.next();
			UserServiceImpl userServiceImpl = new UserServiceImpl();
			userServiceImpl.resetPassword(userName, idNumber,passWord);
	}
}
