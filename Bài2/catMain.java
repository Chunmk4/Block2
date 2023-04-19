package Tuan1.Bài2;

public class catMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        cat = new Cat(9.5);
        System.out.println(cat);

        cat = new Cat(34.5, 6, 10);
        System.out.println(cat);
    }
}


