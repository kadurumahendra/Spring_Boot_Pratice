package com.SpringBootApp.Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PaymentRunner implements CommandLineRunner{
	
	@Autowired
	private Payment pay;
	
	public void run(String... args)

	{
		System.out.println("Payement Details.... ");
		System.out.println(pay);
		
		Payment p1 = pay;
		Payment p2 = pay;
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
