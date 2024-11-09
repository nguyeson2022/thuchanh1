package chuong3;

public class Triangle extends Shape {

	// thuộc tính
	private int base;
	private int height;

	// constructor

	public Triangle() {

	}

	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	//getter/setter
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "," + getArea()+"]";
	}
	

}
