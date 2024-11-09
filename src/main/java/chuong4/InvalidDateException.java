package chuong4;

public class InvalidDateException extends Exception {
	private String message;

	public InvalidDateException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = "Ngay thang nam khonghop le!";
	}

	public void setMessage(String message) {
		this.message = message ;
	}

	public String getMessage() {
		return message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "InvalidDateException [message=" + message + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}