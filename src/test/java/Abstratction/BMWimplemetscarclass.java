package Abstratction;

public class BMWimplemetscarclass implements Car{

	

	@Override
	public void start() {
		
		System.out.println("BMW---START");
	}

	@Override
	public void stop() {
		System.out.println("BMW--STOP");
		
	}

	@Override
	public void refuel() {
		
		System.out.println("BMW--REFUEL");
	}
	
	public void speed()
	{
		System.out.println("BMW--Speed");
	}
}
