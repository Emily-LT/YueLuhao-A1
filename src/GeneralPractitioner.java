public class GeneralPractitioner extends HealthProfessional {
    // Instance variable (for general practitioner)
    private String clinic;

    // Default constructor
    public GeneralPractitioner() {
        super(); // Call the default constructor of the superclass
        this.clinic = "";
    }

    // Second constructor for initializing all instance variables
    public GeneralPractitioner(int ID, String name, String specialty, String expertise, String floor, double registrationFee, String clinic) {
        super(ID, name, specialty, expertise, floor, registrationFee); // Call the parameterized constructor of the superclass
        this.clinic = clinic;
    }

    // Getter and Setter methods
    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    // Now print the detailed information of the general practitioner
    @Override
    public void printDetails() {
        super.printDetails(); // Call the printDetails method of the superclass
        System.out.println("Clinic: " + clinic);
    }
}