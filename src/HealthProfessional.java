public class HealthProfessional {
    // Instance variables
    private int ID;
    private String name;
    private String specialty;
    private String expertise; // Specialization in treating certain diseases (added)
    private String floor; // Floor (added)
    private double registrationFee; // Registration fee (added)

    // Default constructor
    public HealthProfessional() {
        this.ID = 0;
        this.name = "";
        this.specialty = "";
        this.expertise = "";
        this.floor = "";
        this.registrationFee = 0.0;
    }

    // This is the initialization
    public HealthProfessional(int ID, String name, String specialty, String expertise, String floor, double registrationFee) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
        this.expertise = expertise;
        this.floor = floor;
        this.registrationFee = registrationFee;
    }

    // Getter and Setter methods
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Expertise: " + expertise);
        System.out.println("Floor: " + floor);
        System.out.println("Registration Fee: " + registrationFee);
    }
}