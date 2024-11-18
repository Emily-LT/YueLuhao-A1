public class Dentist extends HealthProfessional {
    // 牙医的实例变量(另一种健康专业人员)
    private String dentalLicenseNumber;

    // 默认构造函数
    public OtherHealthProfessional() {
    }

    // 第二个构造函数，用于初始化所有实例变量
    public OtherHealthProfessional(int ID, String name, String specialization, String certification) {
        super(ID, name, specialization);
        this.certification = certification;
    }

    // 打印健康专业人员的详细信息的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Certification: " + certification);
    }

    // Getter 和 Setter 方法
    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}