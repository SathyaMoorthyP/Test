package C1_java_oops_and_collection;

public class B3CRActivityBasedOnInheritance_SmartPhone extends B2CRActivityBasedOnInheritance_AndroidPhone {
	
	public void connecWhatApp() {
		System.out.println("Connect WhatApp");		
	}

	
	public static void main(String[] args) {
		
		B3CRActivityBasedOnInheritance_SmartPhone sm = new B3CRActivityBasedOnInheritance_SmartPhone();
		sm.makeCall();
		sm.saveContact();
		sm.takeVideo();
		sm.connecWhatApp();
		
	}
}
