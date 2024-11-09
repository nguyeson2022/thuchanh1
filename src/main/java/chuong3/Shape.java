package chuong3;

public abstract class Shape {
	//thuộc tính
	protected String color;

	//constructor
	public Shape() {
	}
	public Shape(String color) {
		
		this.color = color;
	}
	//setter/getter
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//phương thức trừu tượng lấy diện tích
	public abstract double getArea();
	
	//phương thức in thông tin
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
}
