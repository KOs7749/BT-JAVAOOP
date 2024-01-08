package BT_JAVAOOP2.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Dinh Thi The", 21, "Female", "Toa nha handico", "0355349272");
        Person person2 = new Person("Dinh Thi Thu Thao", 21, "Female", "Toa nha handico me tri nam tu liem ha noi", "0355349434");
        person1.getInfo();
        person2.getInfo();
    }
}
