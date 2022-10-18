package practise.com.practise.sadek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInit {
	static char c;
	public static void main(String[] args) {
		//System.out.println(0/0
		//	);
		
		System.out.println(c);
		for(byte i = 0;i<1; i++) {
			System.out.println(i);
		}
		
	 String mark = "100";
		switch (mark) {
		case "80":
			System.out.println("Hello");
			
			break;

		default:
			break;
		}
		
		byte price = 90;
		switch (price) {
		case 10:
			
			break;

		default:
			break;
		}
		
		System.out.println(" ");
		
		int i = 1;
		while(i <=10) {
			System.out.print(i);
			i+=2;
		}
		System.out.println();
		
		int [] arr = new int[100];
	for(int m =0; m< 100 ;m++) {
		if(m <10) {
			System.out.print("0"+m + " ");
		}
		else {
			System.out.print(m + " ");
		}
		if(m%10==0) {
			System.out.println();
		}
		
	
	}
		
		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();*/
		

	}

}
