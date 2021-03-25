package hw4.hospital;

public abstract class HospitalWorker {
    private String name;
    private int age;
    private String position;
    private String specialization;
    private String department;

    public HospitalWorker(String name, int age, String position, String specialization, String department) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.specialization = specialization;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
