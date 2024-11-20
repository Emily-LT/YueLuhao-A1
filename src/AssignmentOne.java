import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(
                1, "Yue Luhao", "General Practice",
                "Specializes in treating common and frequent illnesses such as colds, fevers, and indigestion. Has extensive experience in managing and preventing chronic diseases.",
                "1st Floor", 10.0, "Liuzhou People's Hospital"
        );
        GeneralPractitioner gp2 = new GeneralPractitioner(
                2, "Sun Lijiao", "General Practice",
                "Focuses on pediatric diseases, especially respiratory infections and allergic reactions in children.",
                "1st Floor", 10.0, "Liuzhou People's Hospital"
        );
        GeneralPractitioner gp3 = new GeneralPractitioner(
                3, "Peng Yiling", "General Practice",
                "Specializes in the initial diagnosis and management of cardiovascular diseases, with in-depth research on hypertension and hyperlipidemia.",
                "1st Floor", 10.0, "Liuzhou People's Hospital"
        );

        // 创建两个牙医对象
        Dentist dentist1 = new Dentist(
                4, "Zhang Suya", "Dentistry", "Dental Care", "2nd Floor", 15.0, "123456"
        );
        Dentist dentist2 = new Dentist(
                5, "Zhang Jingfang", "Dentistry", "Dental Care", "2nd Floor", 15.0, "654321"
        );

        // 将不同类型的健康专业人员对象添加到同一个列表中
        List<HealthProfessional> healthProfessionals = new ArrayList<>();
        healthProfessionals.add(gp1);
        healthProfessionals.add(gp2);
        healthProfessionals.add(gp3);
        healthProfessionals.add(dentist1);
        healthProfessionals.add(dentist2);

        // 打印所有健康专业人员的详细信息
        System.out.println("Health Professionals Details:");
        for (HealthProfessional hp : healthProfessionals) {
            hp.printDetails();
            System.out.println("-----------------------------------------");
        }

        System.out.println("----------------------------------------------------------");

        // Part 5 – Collection of appointments
        // 声明一个存储 Appointment 对象的 ArrayList
        List<Appointment> appointments = new ArrayList<>();

        // 创建预约
        createAppointment(1, "Zhongli", "1899998888", "10:00 AM - 11:00 AM", gp1, appointments);
        createAppointment(2, "Hutao", "1877510388", "11:00 AM - 12:00 PM", dentist1, appointments);
        createAppointment(3, "Xiao", "1920000099", "01:00 PM - 02:00 PM", gp2, appointments);
        createAppointment(4, "Keqing", "3211239999", "02:00 PM - 03:00 PM", dentist2, appointments);

        // 打印现有预约
        System.out.println("Current list of appointments:");
        printExistingAppointments(appointments);

        // 取消预约
        cancelBooking("1899998888", appointments);

        // 再次打印现有预约
        System.out.println("List of appointments after cancellation:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // 创建预约的方法
    public static void createAppointment(int appointmentId, String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor, List<Appointment> appointments) {
        if (patientName == null || patientName.isEmpty() || patientMobile == null || patientMobile.isEmpty() || timeSlot == null || timeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("Invalid input. Appointment cannot be created.");
            return;
        }
        // 验证电话号码格式
        if (!patientMobile.matches("\\d{10}")) {
            System.out.println("Invalid phone number format. Appointment cannot be created.");
            return;
        }
        Appointment appointment = new Appointment(appointmentId, patientName, patientMobile, timeSlot, selectedDoctor);
        appointments.add(appointment);
        System.out.println("Appointment created successfully. Appointment ID: " + appointmentId);
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
                System.out.println("Appointment canceled successfully. Patient Mobile: " + patientMobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for the given mobile number: " + patientMobile);
        }
    }
}