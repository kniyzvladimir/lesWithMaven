package hw4.hospital;

import java.util.List;

public class SurgeryDepartment extends HospitalDepartment{
    public SurgeryDepartment(String departmentName, HospitalWorker departmentHead, List<HospitalWorker> staffOfDepartment) {
        super(departmentName, departmentHead, staffOfDepartment);
    }

    public void вырезать() {
        System.out.println("Печнь вырезана");
        System.out.println("Почк вырезаны");
    }

    @Override
    public void primaryResponsibility() {
        System.out.println("Хирург – врач, специализирующийся на лечении различных заболеваний посредством физического вмешательства" +
                " \nв организм пациента. Обычно такие патологии невозможно вылечить медикаментозно," +
                " \nбез хирургических манипуляций – перевязок, обработок ран, оперативных вмешательств.");
    }
}
