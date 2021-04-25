package com.heapsteep;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {
	public static void main(String[] args) {
		System.out.println("Hey Ram...");
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		System.out.println(encoder.encode("heapsteep"));
	}
}
