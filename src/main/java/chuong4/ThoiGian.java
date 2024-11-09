package chuong4;

public class ThoiGian {
	protected int ngay, thang, nam;

	public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException{
		if (ngay < 1 || thang < 1 || thang > 12 || nam < 0 || ngay > 31) {
			throw new InvalidDateException("Ngay, thang, nam khong hop le!");
		}
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "ThoiGian [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}

}
