
public class InstanceFactoryDemo {
    Car getCarObject(String str) {
    	if(str.equals("Audi")) {
    		return new Audi();
    	}
    	else {
    		return new BMW();
    	}
    }
    Bike getBikeObject(String str) {
    	if(str.equals("Honda")) {
    		return new Honda();
    	}
    	else {
    		return new Hero();
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceFactoryDemo car = new InstanceFactoryDemo();
		InstanceFactoryDemo bike = new InstanceFactoryDemo();
		System.out.print(car.getCarObject("Audi"));
		System.out.print(bike.getBikeObject("Honda"));
		System.out.print("hello");
	}

}
