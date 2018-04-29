package edu.handong.csee.java.lab13.prob1;

public class FriendMain {

	public static void main(String[] args) {

		//Friend - SchoolFriend - ClassFriend  (hierarchy)
		// Instantiating classes.
		InstanceOf ins = new InstanceOf();
		Friend fd = new Friend();
		ClassFriend cfd = new ClassFriend();
		SchoolFriend sfd = new SchoolFriend();

		//invoking whatFriend method.
		ins.whatFriend(fd);
		ins.whatFriend(sfd);
		ins.whatFriend(cfd);


	}

}
