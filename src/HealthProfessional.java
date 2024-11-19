public class HealthProfessional {
    // 实例变量
    private int ID;
    private String name;
    private String specialty;

    // 默认构造函数
    public HealthProfessional() {
        this.ID=0;
        this.name="";
        this.specialty="";
    }
    //这个是初始化A second constructor that initialises all the instance variables.
    public HealthProfessional(int ID,String name,String specialty){
        this.ID=ID;
        this.name=name;
        this.specialty=specialty;
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
    // 这个是打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }
}