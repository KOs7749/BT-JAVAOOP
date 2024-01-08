package BT_JAVAOOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien employee = new NhanVien("Dinh Thi The", 21, "0355349272", "Toa nha Handico");
        System.out.println("The employee's information is:" );
        employee.GetInfo();
    }
}
