
package BT3;


public class SoSanhTheoTenn implements ISoSanh<SinhVien> {

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
       return o1.getHoTen().compareTo(o2.getHoTen());
    }
    
}
