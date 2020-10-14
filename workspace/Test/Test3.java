class Person {

    private String name;

    private int age;

    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public void printInfo() {

        System.out.println("�̸� : " + name + ", ���� : " + age + "��");

    }

}

 

class Student extends Person  {

    private String school;

    public Student(String name, int age, String school) {
	super(name, age);

        this.school = school;

    }

    @Override

    public void printInfo() {
	super.printInfo();

        System.out.println("�б� : " + school);

    }

}

 

public class Test3 {
    public static void main(String[] args) {
    Student student = new Student("��ö��", 20, "���̴��б�");

    student.printInfo();
    }

}