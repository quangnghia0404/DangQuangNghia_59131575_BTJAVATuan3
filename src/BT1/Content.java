
package BT1;


public class Content {
    ITinh tinhToan;

    public Content() {
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
