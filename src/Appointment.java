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


    // 创建Getter 和 Setter 方法
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
    // 打印打印打印啊啊啊啊
    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Selected Doctor:");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }

}