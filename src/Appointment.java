import java.util.Objects;

public class Appointment {
    // Instance variables
    private int appointmentId;
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.appointmentId = 0;
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.selectedDoctor = null;
    }

    // Second constructor
    public Appointment(int appointmentId, String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Create Getter and Setter methods
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

    // Print details
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

    // Override equals method to determine if two appointments are the same based on appointment ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return appointmentId == that.appointmentId;
    }

    // Override hashCode method for use in collections
    @Override
    public int hashCode() {
        return Objects.hash(appointmentId);
    }
}