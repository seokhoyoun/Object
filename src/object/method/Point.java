package object.method;

public class Point {
	
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	@Override
	public boolean equals(Object o) {
		Point p = (Point) o;
		if(this.xPos == p.xPos && this.yPos == p.yPos)
			return true;
		else
			return false;
	}
	
}
