package Tuan1.BaiTap;

public class cylinderMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(15, "Hồng");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder.setChieucao(25);
        System.out.println(cylinder);


    }
}
