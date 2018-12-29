package object.method;

public class TestEquals {

	public static void main(String[] args) {
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(3,4);
		
		if(p1.equals(p2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		
		Rectangle r1 = new Rectangle(p1, p2);
		Rectangle r2 = new Rectangle(p1, p2);
		
		if(r1 == (r2))
			System.out.println("same");
		else 
			System.out.println("diff");
	
	}

}
