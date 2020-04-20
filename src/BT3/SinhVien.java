
package BT3;


import java.util.Date;


public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void hienthiTT() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}
