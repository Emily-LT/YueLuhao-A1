public class GeneralPractitioner extends HealthProfessional {
    // 这是实例变量（全科医生）
    private String clinic;

    // 默认构造方法
    public GeneralPractitioner() {
        super(); // 调用父类的默认构造方法
        this.clinic = "";
    }

    // 第二个构造函数，用于初始化所有实例变量
    public GeneralPractitioner(int ID, String name, String specialty, String clinic) {
        super(ID, name, specialty); // 调用父类的带参数构造方法
        this.clinic = clinic;
    }

    // Getter 和 Setter 方法
    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}