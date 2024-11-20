public class Dentist extends HealthProfessional {
    // Instance variable for dentist (another type of health professional)
    private String dentalLicenseNumber;

    // Default constructor
    public Dentist() {
        super(); // Call the default constructor of the superclass
        this.dentalLicenseNumber = "";
    }

    // Initialization
    public Dentist(int ID, String name, String specialty, String expertise, String floor, double registrationFee, String dentalLicenseNumber) {
        super(ID, name, specialty, expertise, floor, registrationFee);
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    // Getter and Setter methods
    public String getDentalLicenseNumber() {
        return dentalLicenseNumber;
    }

    public void setDentalLicenseNumber(String dentalLicenseNumber) {
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    // Print details
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Dental License Number: " + dentalLicenseNumber);
    }
}