package com.example.demo;
public class onePlus implements Mobiles{
	Color color;
	public onePlus(Color color) {
		this.color=color;
	}
	@Override
	public void getModelAndVersion() {
		System.out.println("Mobile vesion 1");
		color.getOnePlusColor();
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("My Name is Singamsetty Eswar Arjun");
	}
}
