public class AssignmentOne {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Doe", "General Practitioner", 10);
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane Smith", "General Practitioner", 15);
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Alice Brown", "General Practitioner", 8);

        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Bob Johnson", "Dentist", "DDS");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Carol White", "Nutritionist", "RD");

        System.out.println("General Practitioners:");
        gp1.printDetails();
        System.out.println("------------------------");
        gp2.printDetails();
        System.out.println("------------------------");
        gp3.printDetails();

        System.out.println("\nOther Health Professionals:");
        ohp1.printDetails();
        System.out.println("------------------------");
        ohp2.printDetails();
    }
}