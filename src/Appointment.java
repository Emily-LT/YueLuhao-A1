public class Appointment {
    // 实例变量
    private int appointmentID;
    private String patientName;
    private HealthProfessional healthProfessional;
    private String date;
    private String time;

    // 默认构造函数
    public Appointment() {
    }

    // 第二个构造函数，用于初始化所有实例变量
    public Appointment(int appointmentID, String patientName, HealthProfessional healthProfessional, String date, String time) {
        this.appointmentID = appointmentID;
        this.patientName = patientName;
        this.healthProfessional = healthProfessional;
        this.date = date;
        this.time = time;
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