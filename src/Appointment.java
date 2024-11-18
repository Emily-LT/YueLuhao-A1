import java.util.Objects;

public class Appointment {
    // 实例变量
    private int appointmentId;
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    // 默认构造方法
    public Appointment() {
        this.appointmentId = 0;
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.selectedDoctor = null;
    }

    // 第二个构造方法
    public Appointment(int appointmentId, String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印预约详细信息的方法
    public void printAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Health Professional:");
        healthProfessional.printDetails();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }

    // Getter 和 Setter 方法
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}