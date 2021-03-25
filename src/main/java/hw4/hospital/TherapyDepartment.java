package hw4.hospital;

import java.util.List;

public class TherapyDepartment extends HospitalDepartment{
    public TherapyDepartment(String departmentName, HospitalWorker departmentHead, List<HospitalWorker> staffOfDepartment) {
        super(departmentName, departmentHead, staffOfDepartment);
    }

    public void диагностика() {
        System.out.println("Нет здоровых людей, есть недообследованные");
    }

    @Override
    public void primaryResponsibility() {
        System.out.println("Многопрофильный врач-терапевт занимается диагностикой и лечением целого ряда заболеваний человека." +
                " \nОн принимает пациентов, достигших возраста 18-ти лет. " +
                "\nВсе, что делает врач-терапевт, относится к заболеваниям и патологиям внутренних органов человека.");
    }
}
