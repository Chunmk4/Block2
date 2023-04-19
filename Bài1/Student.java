package Tuan1.Bài1;

import Tuan1.Bài1.People;

public class Student extends People {
    public String className;
    public Student(){
        super();
        this.className="D101-C1K14";
    }
    public Student(String className) {
        super();
        this.className = className;
    }
    public Student(String name, boolean gender, int age, String className) {
        super(name, gender, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public void study(){
        System.out.println("Learning code......");
    }

    @Override
    public String toString() {
        return "A student with class name: "
                + getClassName()
                + " ,which is a subclass of "
                + super.toString();
    }

}
