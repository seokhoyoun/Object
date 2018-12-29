package object.method;

public class Rectangle {
	
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(Point upperLeft, Point lowerRight) {
		super();
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;;
	}
	
	@Override
	public boolean equals(Object o) {
		Rectangle r = (Rectangle) o;
		if(this.lowerRight.equals(r.lowerRight) && this.upperLeft.equals(r.upperLeft)) 
			return true;
		else
			return false;
	}
	
}
