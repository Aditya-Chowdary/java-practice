package Test;

public class ExceptionHandling {
Integer a = 1;
Integer b = 2;
	public void errors() {
		try {
        if(a+b == 2) {
        System.out.println("it is equal no error");
        }
        else
            throw new Exception("A + b values are != 2 ");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
	
	}
}

