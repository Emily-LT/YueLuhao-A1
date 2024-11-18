public class Dentist extends HealthProfessional {
    // 牙医的实例变量(另一种健康专业人员)
    private String dentalLicenseNumber;

    // 这个是默认构造方法
    public Dentist() {
        super(); // 调用父类的默认构造方法
        this.dentalLicenseNumber = "";
    }

    // 初始化
    public Dentist(int ID, String name, String specialty, String dentalLicenseNumber) {
        super(ID, name, specialty);
        this.dentalLicenseNumber = dentalLicenseNumber;
    }


    // Getter 和 Setter 方法
    public String getDentalLicenseNumber() {
        return dentalLicenseNumber;
    }

    public void setDentalLicenseNumber(String dentalLicenseNumber) {
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

}