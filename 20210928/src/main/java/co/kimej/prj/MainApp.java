package co.kimej.prj;

import co.kimej.prj.friend.CompanyFriend;
import co.kimej.prj.friend.Friend;
import co.kimej.prj.friend.SchoolFriend;


public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();
		
//		Animal man = new Man();
//		man.run();
//		man.sleep();
		
//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();
	
		Friend schoolFriend = new SchoolFriend();
		schoolFriend.name ="홍길동";
		schoolFriend.tel = "010-1111-1111";
		schoolFriend.address = "대구광역시 중구";
		schoolFriend.friendPrint();
		
		Friend companyFriend = new CompanyFriend();
		companyFriend.name = "홍길순";
		companyFriend.tel="010-2222-2222";
		companyFriend.address="서울특별시 종로구";
		companyFriend.friendPrint();
	}
}
