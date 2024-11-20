import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Create three general practitioner objects
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

        // Create two dentist objects
        Dentist dentist1 = new Dentist(
                4, "Zhang Suya", "Dentistry", "Dental Care", "2nd Floor", 15.0, "123456"
        );
        Dentist dentist2 = new Dentist(
                5, "Zhang Jingfang", "Dentistry", "Dental Care", "2nd Floor", 15.0, "654321"
        );

        // Add different types of health professional objects to the same list
        List<HealthProfessional> healthProfessionals = new ArrayList<>();
        healthProfessionals.add(gp1);
        healthProfessionals.add(gp2);
        healthProfessionals.add(gp3);
        healthProfessionals.add(dentist1);
        healthProfessionals.add(dentist2);

        // Print details of all health professionals
        System.out.println("Health Professionals Details:");
        for (HealthProfessional hp : healthProfessionals) {
            hp.printDetails();
            System.out.println("-----------------------------------------");
        }

        System.out.println("----------------------------------------------------------");

        // Part 5 – Collection of appointments
        // Declare an ArrayList to store Appointment objects
        List<Appointment> appointments = new ArrayList<>();

        // Create appointments
        createAppointment(1, "Zhongli", "1899998888", "10:00 AM - 11:00 AM", gp1, appointments);
        createAppointment(2, "Hutao", "1877510388", "11:00 AM - 12:00 PM", dentist1, appointments);
        createAppointment(3, "Xiao", "1920000099", "01:00 PM - 02:00 PM", gp2, appointments);
        createAppointment(4, "Keqing", "3211239999", "02:00 PM - 03:00 PM", dentist2, appointments);

        // Print current appointments
        System.out.println("Current list of appointments:");
        printExistingAppointments(appointments);

        // Cancel an appointment
        cancelBooking("1899998888", appointments);

        // Print current appointments again
        System.out.println("List of appointments after cancellation:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // Method to create an appointment
    public static void createAppointment(int appointmentId, String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor, List<Appointment> appointments) {
        if (patientName == null || patientName.isEmpty() || patientMobile == null || patientMobile.isEmpty() || timeSlot == null || timeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("Invalid input. Appointment cannot be created.");
            return;
        }
        // Validate phone number format
        if (!patientMobile.matches("\\d{10}")) {
            System.out.println("Invalid phone number format. Appointment cannot be created.");
            return;
        }
        Appointment appointment = new Appointment(appointmentId, patientName, patientMobile, timeSlot, selectedDoctor);
        appointments.add(appointment);
        System.out.println("Appointment created successfully. Appointment ID: " + appointmentId);
    }

    // Method to print existing appointments
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

    // Method to cancel an appointment
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