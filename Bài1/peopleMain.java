package Tuan1.Bài1;

import Tuan1.Bài1.People;

public class peopleMain {

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);

        people = new People("Trần Quốc Chung", true, 18);
        System.out.println(people);

        people.setAge(20);
        System.out.println(people);
    }
}



