package hw4.hospital;

public class NeurologyDepartment extends HospitalDepartment{
    public NeurologyDepartment(String departmentName, String departmentHead) {
        super(departmentName, departmentHead);
    }
    public void лечимРадикулит () {
        System.out.println("Ура, радикулит вылечен!");
    }
    @Override
    public void primaryResponsibility() {
        System.out.println("Врачи-неврологи занимаются диагностикой, профилактикой и лечением широкого перечня заболеваний " +
                "\nцентральной и периферической нервной системы, проводят терапию некоторых патологий опорно-двигательного аппарата." +
                " \nБольшая часть обращений к этим специалистам связана с такими патологиями, как неврит, остеохондроз и радикулит.");
    }
}
