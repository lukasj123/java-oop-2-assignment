package com.tts.main;
import com.tts.phone.*;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone myCell = new MobilePhone("Apple", "iPhone 13", "(347) 712-2833", 256);

		myCell.makeCall("(929) 526-3838");
		
		myCell.installApp("Facebook");
		
		myCell.displayInfo();
		
		
	}

}
