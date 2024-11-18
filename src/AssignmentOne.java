import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "岳鲁皓", "General Practice", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "孙丽娇", "General Practice", "Rural Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "彭一灵", "General Practice", "Community Clinic");

        // 创建两个牙医对象
        Dentist dentist1 = new Dentist(4, "张苏雅", "Dentistry", "123456");
        Dentist dentist2 = new Dentist(5, "张竞方", "Dentistry", "654321");

        System.out.println("General Practitioners:");
        gp1.printDetails();
        System.out.println("------------------------");
        gp2.printDetails();
        System.out.println("------------------------");
        gp3.printDetails();

        System.out.println("\nOther Health Professionals:");
        ohp1.printDetails();
        System.out.println("------------------------");
        ohp2.printDetails();

        // 第 5 部分 - 创建并打印预约对象
        Appointment appointment1 = new Appointment(1, "Alice", gp1, "2023-10-01", "10:00 AM");
        Appointment appointment2 = new Appointment(2, "Bob", ohp1, "2023-10-02", "02:00 PM");

        System.out.println("\nAppointments:");
        appointment1.printAppointmentDetails();
        System.out.println("------------------------");
        appointment2.printAppointmentDetails();
    }
}