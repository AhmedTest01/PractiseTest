package practise.com.practise.sadek;

public class PrintName {
	
	String name;
	int age;
	char sex;
	static String address= "1253 Croes Ave";
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ema";
		
		for(int i = name.length()-1; i>=0;i--) {
			//char [] reverseName = null ;
		
		System.out.print(name.charAt(i));}
		System.out.println();		
		
		// Create 4 Object and interchange the reference. 
		
		PrintName  c1 = new PrintName();
		
		c1.name = "Sadek";
		c1.age = 33;
		c1.sex ='M';
		
		
		//System.out.println(c1.name + c1.age + c1.sex);
		
		PrintName c2 = new PrintName();
		c2.name = "Ema";
		c2.age = 34;
		c2.sex ='F';
		
		//System.out.println(c1.name + c1.age + c1.sex);
		//System.out.println(c2.name + c2.age + c2.sex);

        PrintName  c3 = new PrintName();
		
		c3.name = "Arib";
		c3.age = 7;
		c3.sex ='M';
		
		
		
		
		//System.out.println(c1.name + c1.age + c1.sex);
		
		PrintName c4 = new PrintName();
		c4.name = "Waiting";
		c4.age = 0;
		c4.sex ='N';
		
		c1 = c2;
		c2= c3;
		c3 = c4;
		c4 = c1;
			
		
		System.out.println(c1.name + c1.age + c1.sex);// Ema
		System.out.println(c2.name + c2.age + c2.sex); // Arib
		System.out.println(c3.name + c3.age + c3.sex); //Waiting
		System.out.println(c4.name + c4.age + c4.sex); // Ema
		
		c4.getDevice("Hussain");
		
		// maximum device 5 
	}
	
	public String[] getDevice(String empName) {
		String[] device = new String[5];
		
		switch(empName.toLowerCase()) {
		
		case "Sadek":
			device[0] = "Laptop - Windows HP";
			device[1] = "Mobile - iPhone";
			device[2] = "Laptop - Macbook";
			device[3] = "Mobile - Android";
			return device;
		
		
		case "Ema":
			device[0] = "Watch - Apple Watch";
			device[1] = "Mobile - iPhone";
			return device;
			
		case "Arib":
			device[0] = "Watch - Kids Watch";
			device[1] = "Apple iPad";
			device[2] = "Desktop - iMac";
			return device;
			
		default: 
			System.out.println(empName + " is not exists in company directory");
			return device;
			
		
	}

}
}
