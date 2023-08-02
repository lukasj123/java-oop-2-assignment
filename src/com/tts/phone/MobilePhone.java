package com.tts.phone;

public class MobilePhone {

	private String brand;
	private String model;
	private String phoneNumber;
	private int storageCapacity;
	
	public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.phoneNumber = phoneNumber;
		this.storageCapacity = storageCapacity;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getStorage() {
		return storageCapacity;
	}
	
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setPhoneNumber(String newNumber) {
		phoneNumber = newNumber;
	}

	public void setStorage(int newStorage) {
		storageCapacity = newStorage;
	}
	
	public void makeCall(String callNumber) {
		System.out.printf("\nWe are calling %s from our %s %s phone!", callNumber, brand, model);
	}
	
	public void installApp(String appName) {
		System.out.printf("\nInstalling %s on our %s %s phone!", appName, brand, model);
	}
	
	public void displayInfo() {
		System.out.printf("\nBrand: %s", brand);
		System.out.printf("\nModel: %s", model);
		System.out.printf("\nPhone Number: %s", phoneNumber);
		System.out.printf("\nStorage Capacity: %d GB", storageCapacity);
		
	}
}
