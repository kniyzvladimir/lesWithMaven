package hw4.hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class HospitalDepartment {
    private String departmentName;
    private HospitalWorker departmentHead;
    private List <HospitalWorker> staffOfDepartment;

    public HospitalDepartment(String departmentName, HospitalWorker departmentHead, List <HospitalWorker> staffOfDepartment) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
        this.staffOfDepartment = staffOfDepartment;
    }

    public List<HospitalWorker> getStaffOfDepartment() {
        return staffOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public HospitalWorker getDepartmentHead() {
        return departmentHead;
    }

    public void morningPlanner() {
        System.out.printf("%s проводит утренюю планёрку\n", this.departmentHead.getName());
    }

    public void takePatient() {
        System.out.printf("Отделение %s принимает нового пациента\n", this.departmentName);
    }

    public void primaryResponsibility(){};
}
