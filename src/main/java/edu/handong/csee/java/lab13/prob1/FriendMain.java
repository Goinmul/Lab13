package edu.handong.csee.java.lab13.prob1;

public class FriendMain {

	public static void main(String[] args) {

		//Friend - SchoolFriend - ClassFriend 
		InstanceOf ins = new InstanceOf();
		Friend fd = new Friend();
		ClassFriend cfd = new ClassFriend();
		SchoolFriend sfd = new SchoolFriend();

		ins.WhatFriend(fd);
		ins.WhatFriend(sfd);
		ins.WhatFriend(cfd);


	}

}
