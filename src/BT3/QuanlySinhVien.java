
package BT3;


import java.util.ArrayList;
import java.util.Collections;


public class QuanlySinhVien {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dssv = new ArrayList<>();

    public QuanlySinhVien() {
    }

    public QuanlySinhVien(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
     
    public void them(SinhVien sv){
        dssv.add(sv);
    }
    
     public void sapXep(){
        for(int i = 0 ; i< dssv.size() -1 ; i++)
            for(int j = i+1 ; j< dssv.size() ; j++)
        {
            if(soSanh.soSanh(dssv.get(i), dssv.get(j)) >0)
                Collections.swap(dssv, i, j);
        }
    }
     
    public void inDS()
    {
        for(int i = 0; i< dssv.size();i++)
            dssv.get(i).hienthiTT();
    }

   
}
