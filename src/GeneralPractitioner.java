public class GeneralPractitioner extends HealthProfessional {
    // 实例变量
    private int experienceYears;

    // 默认构造函数
    public GeneralPractitioner() {
    }

    // 第二个构造函数，用于初始化所有实例变量
    public GeneralPractitioner(int ID, String name, String specialization, int experienceYears) {
        super(ID, name, specialization);
        this.experienceYears = experienceYears;
    }

    // 打印健康专业人员的详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Experience Years: " + experienceYears);
    }

    // Getter 和 Setter 方法
    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}