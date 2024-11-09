package chuong3;

public class Circle implements GeometricObject {
	//thuộc tính
	protected double radius;
	
	//constructor
	public Circle() {
		
	}
	
	public Circle(double radius) {
		
		this.radius = 1.0;
	}
	
	//phương thức setter/getter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//phương thức tính chu vi
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
	
	//phương thức tính diện tích hình tròn
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
	//phương thức in thông tin
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}


