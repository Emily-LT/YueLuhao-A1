public class HealthProfessional {
    // 实例变量
    private int ID;
    private String name;
    private String specialty;
    private String expertise; // 擅长治愈的疾病（添加）
    private String floor; // 楼层（添加）
    private double registrationFee; // 挂号费用（添加）

    // 默认构造函数
    public HealthProfessional() {
        this.ID = 0;
        this.name = "";
        this.specialty = "";
        this.expertise = "";
        this.floor = "";
        this.registrationFee = 0.0;
    }

    // 这是初始化
    public HealthProfessional(int ID, String name, String specialty, String expertise, String floor, double registrationFee) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
        this.expertise = expertise;
        this.floor = floor;
        this.registrationFee = registrationFee;
    }

    // Getter 和 Setter 方法
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

    // 打印所有实例变量的方法
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