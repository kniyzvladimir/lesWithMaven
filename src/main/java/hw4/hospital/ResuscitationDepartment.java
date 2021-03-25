package hw4.hospital;

import java.util.ArrayList;
import java.util.List;

public class ResuscitationDepartment extends HospitalDepartment{
    public ResuscitationDepartment(String departmentName, HospitalWorker departmentHead, List<HospitalWorker> staffOfDepartment) {
        super(departmentName, departmentHead, staffOfDepartment);
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
