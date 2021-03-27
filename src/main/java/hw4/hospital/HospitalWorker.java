package hw4.hospital;

public abstract class HospitalWorker {
    private String name;
    private int age;
    private String position;
    private String specialization;

    public HospitalWorker(String name, int age, String position, String specialization) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
