package com.samples;

public class MsWordLaunch {
public static void main(String[] args) {
	MsWord ms1 = new MsWord();
	MsWord ms2 = new MsWord();
	MsWord ms3 = new MsWord();
	try {
		Thread.sleep(5000);
		ms1.setName("SPELLCHECK");
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		
		ms2.setName("AUTOSAVING");
	}
		catch (Exception e) {
			// TODO: handle exception
	}
	try {
		ms3.setName("TYPING");
	} catch (Exception e) {
		// TODO: handle exception
	}
	ms1.start();
	ms2.start();
	ms3.start();
}
}
class MsWord  extends Thread {
	public void run(){
		if(getName().equals("SPELLCHECK")){
			spellCheck();
		}
		else if(getName().equals("TYPING")) {
			typing();
		}
		else {
			autoSaving();
		}
	}
	void spellCheck() {
		try {
		System.out.println("spell checking is starting");	
		for(int i=0; i<2 ; i++){
			Thread.sleep(5000);
			System.out.println("checking..............");
		}
		}
		catch (Exception e) {
			
		}
	}
	void typing() {
		try {
			System.out.println("typing is starting");
			for(int i=0;i<3;i++){
				Thread.sleep(5000);
				System.out.println("typing..............");
			}
		}
		catch (Exception e) {

		}
	}
	void autoSaving() {
		try {
			System.out.println("autosaving is starting");
			for(int i=0;i<5;i++){
				Thread.sleep(5000);
				System.out.println("autosaving..............");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
