package hw4.hospital;

public class Doctor extends HospitalWorker{
    private String qualification;

    public Doctor(String name, int age, String position, String specialization, String qualification) {
        super(name, age, position, specialization);
        this.qualification = qualification;
    }
}
