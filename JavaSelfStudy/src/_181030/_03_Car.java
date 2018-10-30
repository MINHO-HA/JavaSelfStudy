package _181030;

public class _03_Car {

	//필드
	String company = "BMW";
	String model = "500d";
	String color = "black";
	int maxSpeed = 350;
	
	_03_Car(){
	}
	
	_03_Car(String model){
		this.model = model;
	}
	
	_03_Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
}
