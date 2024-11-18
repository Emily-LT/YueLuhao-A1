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

        // 打印所有健康专业人员的详细信息
        System.out.println("Health Professionals Details:");
        gp1.printDetails();
        System.out.println("--------------------");
        gp2.printDetails();
        System.out.println("--------------------");
        gp3.printDetails();
        System.out.println("--------------------");
        dentist1.printDetails();
        System.out.println("--------------------");
        dentist2.printDetails();
        System.out.println("--------------------");

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        // 声明一个存储 Appointment 对象的 ArrayList
        List<Appointment> appointments = new ArrayList<>();

        // 创建预约
        createAppointment(1, "Zhongli", "1234567890", "10:00 AM - 11:00 AM", gp1, appointments);
        createAppointment(2, "Hutao", "0987654321", "11:00 AM - 12:00 PM", dentist1, appointments);
        createAppointment(3, "Xiao", "1112223333", "01:00 PM - 02:00 PM", gp2, appointments);
        createAppointment(4, "Keqing", "4445556666", "02:00 PM - 03:00 PM", dentist2, appointments);

        // 打印现有预约
        printExistingAppointments(appointments);

        // 取消预约
        cancelBooking("1234567890", appointments);

        // 再次打印现有预约
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }
    // 创建预约的方法
    public static void createAppointment(int appointmentId, String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor, List<Appointment> appointments) {
        if (patientName == null || patientName.isEmpty() || patientMobile == null || patientMobile.isEmpty() || timeSlot == null || timeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("Invalid input. Appointment cannot be created.");
            return;
        }
        Appointment appointment = new Appointment(appointmentId, patientName, patientMobile, timeSlot, selectedDoctor);
        appointments.add(appointment);
        System.out.println("Appointment created successfully.");
    }
    // 打印现有预约的方法
    public static void printExistingAppointments(List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println("--------------------");
        }
    }
    // 取消预约的方法
    public static void cancelBooking(String patientMobile, List<Appointment> appointments) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment canceled successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for the given mobile number.");
        }
    }
}