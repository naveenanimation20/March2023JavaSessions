package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop();// inherited
		b.refuel();// inherited
		b.start();// overridden
		b.autoParking();// individual
		b.engine();
		BMW.billing();
		Car.billing();
		b.power();// inherited

		System.out.println("------");

		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		Audi.billing();
		au.power();
		Audi.ABS();
		

		System.out.println("------");

		//
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		System.out.println("------");

		// child class object can be referred by parent class ref variable
		// top/up casting
		Car c1 = new BMW();
		c1.start();// BMW
		c1.stop();
		c1.refuel();
		c1.engine();

		// child class object can be referred by grand parent class ref variable
		Vehicle v = new BMW();
		v.engine();

		// down casting?? is possble at the compile time??? yes
		// but at the runtime --- no
		// parent class object can be referred by child class ref variable using down
		// casting?
//		BMW b1 = (BMW) new Car();//ClassCastException
//		b1.start();

		// BMW b2 = (BMW) new Vehicle();//ClassCastException

	}

}
