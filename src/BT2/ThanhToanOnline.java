

package BT2;


public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang < 1000000) return (double) tienHang*0.95;
        else 
            return (double) tienHang*0.93;
        
    }
}
