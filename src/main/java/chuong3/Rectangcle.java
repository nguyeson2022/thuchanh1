package chuong3;

public class Rectangcle extends Shape{
	//thuộc tính
	private int length;
	private int width;
	
	//constructor
	public Rectangcle() {
		
	}
	
	public Rectangcle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	//getter / setter
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	// phương thức tính diện tích
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
	//phương thức in thông tin
	@Override
	public String toString() {
		return "Rectangcle [length=" + length + ", width=" + width +","+ getArea() +"]";
	}

	
	
	

}
