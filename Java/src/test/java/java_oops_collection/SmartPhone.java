package java_oops_collection;

public class SmartPhone extends AndroidPhone {

	public void connectWhatApp() {
	
		System.out.println("Connecting WhatApp");

	}
	
	public static void main(String[] args) {
	
		SmartPhone sp = new SmartPhone();
	
		sp.takeVideo();
		sp.saveContact();
	}
	
	
	
}
