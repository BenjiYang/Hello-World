class Vechicle {
	public void start(){
		System.out.println("Starting......");
	}
}

class Automobil extends Vechicle{
	public void drive(){
		System.out.println("Driving......");
	}
}

class Car extends Automobil{
	public void c_drive(){
		System.out.println("Car......");
	}
}

class Bus extends Automobil{
	public void b_drive(){
		System.out.println("Bus......");
	}
}

class Trusk extends Automobil{
	public void t_drive(){
		System.out.println("Trusk......");
	}
}

class Aricraft extends Vechicle{
	public void fly(){
		System.out.println("Flying......");
	}
}

class Whirlybird extends Aricraft{
	public void whirl(){
		System.out.println("Whirling......");
	}
}

class Jet extends Aricraft{
	public void zoom(){
		System.out.println("Zooming......");
	}
}
