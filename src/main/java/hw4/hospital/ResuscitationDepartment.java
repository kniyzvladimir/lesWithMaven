package hw4.hospital;

public class ResuscitationDepartment extends HospitalDepartment{
    public ResuscitationDepartment(String departmentName, String departmentHead) {
        super(departmentName, departmentHead);
    }
    public void разрядЕщёРазряд() {
        System.out.println("Человек реанимирован и пошел гулять по воде");
    }
    @Override
    public void primaryResponsibility() {
        System.out.println("Реаниматолог - это специалист, который в совершенстве владеет навыками интенсивной терапии," +
                " \nоказывающий помощь пациентам в критическом состоянии, сопряженном с потерей жизни." +
                " \nПомимо этого врач контролирует процесс восстановления основных функций организма.");
    }
}
