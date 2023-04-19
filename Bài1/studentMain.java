package Tuan1.Bài1;

import Tuan1.Bài1.Student;

public class studentMain {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student = new Student("D101_C1K14");
        System.out.println(student);

        student = new Student("Vũ Thị Trà My", false, 18, "IBSK1D1");
        System.out.println(student);
    }
}



