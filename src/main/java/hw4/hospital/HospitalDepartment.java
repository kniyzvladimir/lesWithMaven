package hw4.hospital;

public abstract class HospitalDepartment {
    private String departmentName;
    private String departmentHead;

    public HospitalDepartment(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void morningPlanner() {
        System.out.printf("%s проводит утренюю планёрку\n", this.departmentHead);
    }

    public void takePatient() {
        System.out.printf("Отделение %s принимает нового пациента\n", this.departmentName);
    }

    public void primaryResponsibility(){};
}
