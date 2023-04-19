package Tuan1.BaiTap;

public class Circle {

    private double bankinh;
    private String color;

    public Circle() {
        this.bankinh = 0.0;
        this.color = "trắng";
    }

    public Circle(double bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double dientich() {
        double dientich = (Math.PI * bankinh * bankinh);
        return dientich;
    }

    public double chuvi() {
        double chuvi = (2 * Math.PI * bankinh);
        return chuvi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "bankinh=" + bankinh +
                ", color='" + color + '\'' +
                '}';
    }
}

