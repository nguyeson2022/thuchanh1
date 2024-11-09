package chuong3;

public class ResizableCircle extends Circle implements Resizable{

	//constructor
	public ResizableCircle() {
		
		// TODO Auto-generated constructor stub
	}
	
	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		if(percent >= 0) {
			radius *= (1+percent/100.0);
			
		}else {
			System.out.println("Phần trăm tăng kích thước không âm!");
		}
	}

	

	
}
