
package BT2;


public class Main2 {

  
    public static void main(String[] args) {
       GioHang GH1 = new GioHang();
       GioHang GH2 = new GioHang();
       GH1.setHinhThucTT(new ThanhToanOnline());
       GH2.setHinhThucTT(new ThanhToanCOD());
       
       HangHoa HH1 = new HangHoa("Thịt Bò", 260000, "Chất lượng cao, siêu nạc");
       HangHoa HH2 = new HangHoa("Thịt Heo", 280000, "Siêu mỡ");
       HangHoa HH3 = new HangHoa("Cá", 140000, "sạch, ngon");
       
       GH1.themHH(HH1);
       GH1.themHH(HH2);
       GH1.themHH(HH3);
       
       GH2.themHH(HH3);
       GH2.themHH(HH2);
       
       System.out.println("Danh sách hàng hóa giỏ hàng 1(online)");
       GH1.hienthi();
       System.out.println("Giỏ hàng 1 : Tổng tiền hàng :"+GH1.tinhTienHang()+", Tiền khách trả : "+GH1.tinhTienKhachTra());
       System.out.println("\n");
       
       System.out.println("Danh sách hàng hóa giỏ hàng 2(COD)");
       GH1.hienthi();
       System.out.println("Giỏ hàng 2 : Tổng tiền hàng :"+GH2.tinhTienHang()+", Tiền khách trả : "+GH2.tinhTienKhachTra());
       
    }
}
