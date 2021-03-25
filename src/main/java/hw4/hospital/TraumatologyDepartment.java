package hw4.hospital;

import java.util.List;

public class TraumatologyDepartment extends HospitalDepartment{
    public TraumatologyDepartment(String departmentName, HospitalWorker departmentHead, List<HospitalWorker> staffOfDepartment) {
        super(departmentName, departmentHead, staffOfDepartment);
    }

    public void вправитьЧелюсть() {
        System.out.printf("%s вправляет пациенту челюсть. \nХРЯСЬЬ - Челюсть вправленна, зубы на месте.\n", super.getDepartmentHead());
    }
    @Override
    public void primaryResponsibility() {
        System.out.println("Травматолог-ортопед — это врач, занимающийся диагностикой и лечением заболеваний и травм" +
                " \nопорно-двигательного аппарата. К компетенции врача травматолога-ортопеда относятся различные" +
                " \nтравматические повреждения, а также врожденные и приобретенные заболевания и деформации костей," +
                " \nсуставов, мышц, связок и сухожилий.");
    }
}
