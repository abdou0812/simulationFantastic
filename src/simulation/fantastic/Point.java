package simulation.fantastic;

public class Point {
	double x;
	double y;
	
	public Point(){
		
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double dist(double x1, double x2, double y1, double y2){
		return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
	}
	
	public double dist2(double x1, double x2, double y1, double y2){
		return (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
	}
	
	public double dist(Point p, double x2, double y2){
		return dist(p.x,p.y, x2, y2);
	}
	
	public double dist2(Point p, double x2, double y2){
		return dist2(p.x,p.y, x2, y2);
	}

	public double dist(Point p1, Point p2){
		return dist(p1.x,p1.y, p2.x, p2.y);
	}
	
	
	public double dist2(Point p1, Point p2){
		return dist2(p1.x,p1.y, p2.x, p2.y);
	}
	
}
