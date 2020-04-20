
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main3 {

    public static void main(String[] args) throws ParseException {
      QuanlySinhVien QLSV = new QuanlySinhVien();
      
        SinhVien sv1 = new SinhVien("Đặng Quang Nghĩa", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1999"), 6);
        SinhVien sv2 = new SinhVien("Nguyễn Tấn Kiết", new SimpleDateFormat("dd/MM/yyyy").parse("12/01/1999"), 10);
        SinhVien sv3 = new SinhVien("Trương Hoàng Khoa", new SimpleDateFormat("dd/MM/yyyy").parse("15/07/1999"), 5);
        
        QLSV.them(sv1);
        QLSV.them(sv2);
        QLSV.them(sv3);
        
        
        
        System.out.println("Danh sách sinh viên lúc đầu : ");
        QLSV.inDS();
        System.out.println();
        
        QLSV.setSoSanh((ISoSanh) new SoSanhTheoTenn());
        QLSV.sapXep();
        System.out.println("Danh sách sinh viên so sánh theo tên : ");
        QLSV.inDS();
        System.out.println();
        
        QLSV.setSoSanh((ISoSanh) new SoSanhTheoDiem());
        QLSV.sapXep();
        System.out.println("Danh sách sinh viên so sánh theo điểm :");
        QLSV.inDS();
         System.out.println();
    }
    
}
