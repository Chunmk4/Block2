package Tuan1.BaiTap;


public class circleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10, "vàng");
        System.out.println(circle);

        circle.setColor("Đen");
        System.out.println(circle);
    }
}
