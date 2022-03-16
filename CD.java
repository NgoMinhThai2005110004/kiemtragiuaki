package oo.kiemtragiuaki;

public class CD {
    //khai báo các thuộc tính
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBH;
    private double giaThanh;
    //khởi tạo constructor mặc định
    public CD() {
    }
    //khởi tạo constructor có tham số
    public CD(int cD, String tuaCD, String caSy, int soBH, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    //------------begin getter and setter--------------
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTuaCD() {
        return tuaCD;
    }
 
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public double getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    //------------end getter and setter--------------
    @Override
    public String toString() {
        return "CD{" +
                "cD=" + maCD +
                ", tuaCD='" + tuaCD + "'" +
                ", caSy='" + caSy + "'" +
                ", soBH=" + soBH +
                ", giaThanh=" + giaThanh +
                '}';
    }
 
}
