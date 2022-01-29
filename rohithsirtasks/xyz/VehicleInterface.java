package mytasks;

public interface VehicleInterface {
	void color();
	void milage();
}
abstract class Car implements VehicleInterface{
	
	
}
abstract class Bike implements VehicleInterface{
	
}
class Maruthi extends Car{	


@Override
public void color() {
	System.out.println("red");
	
}

@Override
public void milage() {
	System.out.println("35");
	
}
}
class Mahindra extends Car{

	@Override
	public void color() {
		System.out.println("white");	
	}

	@Override
	public void milage() {
		System.out.println("30");		
	}
}
class Ns160 extends Bike{

	@Override
	public void color() {
		System.out.println("black");	
	}

	@Override
	public void milage() {
		System.out.println("50");	
	}
}
class KTM extends Bike{

	@Override
	public void color() {
		System.out.println("orange");	
	}

	@Override
	public void milage() {
		System.out.println("45");		
	}	

}
