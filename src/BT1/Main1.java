
package BT1;


public class Main1 {

    
    public static void main(String[] args) {
        Content CT = new Content();
        
        CT.setTinhToan(new Nhan());
        System.out.println("Thực hiện pháp tính nhân (3*5) :"+CT.tinh(3, 5));
        
        CT.setTinhToan(new Cong());
        System.out.println("Thực hiện pháp tính cộng (72+18) :"+CT.tinh(72, 18));
        
        CT.setTinhToan(new Tru());
        System.out.println("Thực hiện pháp tính trừ (18-50) :"+CT.tinh(18, 50));
    }
    
}
