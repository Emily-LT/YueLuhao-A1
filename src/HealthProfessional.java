public class HealthProfessional {
    // 实例变量
    private int ID;
    private String name;
    private String specialization;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 第二个构造函数，用于初始化所有实例变量
    public HealthProfessional(int ID, String name, String specialization) {
        this.ID = ID;
        this.name = name;
        this.specialization = specialization;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}