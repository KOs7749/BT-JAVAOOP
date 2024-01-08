package BT_JAVAOOP2.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private String getAddress() {
        return address;
    }

    private String getPhone() {
        return phone;
    }

    protected void getInfo() {
        System.out.println("Name: " + getName() + ", age: " + getAge() + ", gender: " + getGender() + ", address: " + getAddress() + ", phone: " + getPhone() );
    }

    //Use for class Company
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getInfoCompany() {
        System.out.println("Name: " + getName() + ", age: " + getAge() + ", gender: " + getGender());
    }
}
