package chuong4;

public class StringTooLongException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StringTooLongException(String message) {
		super(message);  // Truyền thông báo lỗi cho lớp cha (Exception)
	}
}
