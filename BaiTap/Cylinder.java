package Tuan1.BaiTap;

public class Cylinder extends Circle{
   private double chieucao;
   public Cylinder(){
       super();
       this.chieucao=1;
   }
   public Cylinder(double chieucao){
       super();
       this.chieucao=chieucao;
   }
   public Cylinder(double bankinh, String color, double chieucao){
       super(bankinh,color);
       this.chieucao=chieucao;
   }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    public double thetich(){
       double thetich=(dientich()*chieucao);
       return thetich;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieucao=" + chieucao +
                '}';
    }
}
