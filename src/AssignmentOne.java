import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Doe", "General Practitioner", 10);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane Smith", "General Practitioner", 15);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Alice Brown", "General Practitioner", 8);

        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Bob Johnson", "Dentist", "DDS");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Carol White", "Nutritionist", "RD");

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