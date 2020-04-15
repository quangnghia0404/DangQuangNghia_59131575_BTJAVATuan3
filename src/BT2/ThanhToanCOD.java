
package BT2;


public class ThanhToanCOD implements IThanhToan{
    
    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang > 2000000) return (double) tienHang*0.98;
        else 
            return (double) tienHang*1;
    }
}
