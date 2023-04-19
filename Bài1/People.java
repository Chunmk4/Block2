package Tuan1.Bài1;

public class People {
    public String name;
    public Boolean gender;
    public int age;

    public People() {
        this.name = "Tên mặc định";
        this.gender = false;
        this.age = 0;
    }
    public People(String name, Boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Boolean isGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println("People eating......");
    }

    public void sleep(){
        System.out.println("Sleeping.....");
    }

    @Override
    public String toString() {
        return "A people with name: "
                + getName()
                + ", age: "
                + getAge()
                + " and gender: "
                + (isGender() ? "Nam" : "Nữ");
    }


}