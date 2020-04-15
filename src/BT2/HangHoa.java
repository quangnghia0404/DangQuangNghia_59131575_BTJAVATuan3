
package BT2;


public class HangHoa {
    private String tenHangHoa;
    private int gia;
    private String moTa;

    public HangHoa() {
    }

    public HangHoa(String tenHangHoa, int gia, String moTa) {
        this.tenHangHoa = tenHangHoa;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public void hienThi(){
        System.out.println("Tên hàng hóa : "+tenHangHoa);
        System.out.println("Giá hàng hóa : "+gia);
        System.out.println("Mô tả hàng hóa : "+moTa);
    }
}
