/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();
    
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa hh){
        dshh.add(hh);
    }
    
    public int tinhTienHang(){
        int S = 0;
        for (int i =0; i<dshh.size();i++){
            S = S + dshh.get(i).getGia();
        }
        return S;
    }
    
    public double tinhTienKhachTra(){
        return hinhThucTT.thanhtoan(tinhTienHang());
    }
    
    public void hienthi(){
        for(int i =0;i<dshh.size();i++)
        {
            System.out.println("\nHàng hóa thứ i"+i);
            dshh.get(i).hienThi();
        }
    }
}
