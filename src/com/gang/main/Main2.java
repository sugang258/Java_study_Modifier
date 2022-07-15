package com.gang.main;

import com.gang.himart.Cellphone;
import com.gang.himart.Client;
import com.gang.himart.Computer;
import com.gang.himart.Television;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		Cellphone phone = new Cellphone();
		Television tv = new Television();
		
		com.info();
		phone.info();
		tv.info();
		
		Client client = new Client();
		
		client.buy(phone);
		

	}

}
