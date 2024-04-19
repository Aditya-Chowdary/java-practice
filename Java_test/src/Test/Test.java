package Test;

public class Test {
	public class Obj1 {
		String item1 = "1";
	}

	public class Obj2 {
		String item1 = "1";
	}

	public static void main(String[] args) {

		Question1 question1 = new Question1();
		question1.concat();
		Cat cat = new Cat();
		cat.makeSound();
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		deer.eat();
		deer.sleep();
		tiger.eat();
		tiger.sleep();
		lion.eat();
		lion.sleep();
		ListPrint listprint = new ListPrint();
		listprint.colors();
		SavingsAccount saving = new SavingsAccount();
		saving.balance();
		CurrentAccount current = new CurrentAccount();
		current.balance();
		ExceptionHandling exception = new ExceptionHandling();
		exception.errors();
        Test test1 = new Test();
        Obj1 obj_1 = test1.new Obj1();
        Obj2 obj_2 = test1.new Obj2();
        System.out.println((obj_1).equals(obj_2));
      
	
	
	

	}
}
