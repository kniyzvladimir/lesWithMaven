package hw4.hospital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HospitalDepartment> hdList = new ArrayList<>();
        HospitalDepartment neurology = new NeurologyDepartment("Неврология", "Иванов ИИ");
        HospitalDepartment resuscitation = new ResuscitationDepartment("Реанимация", "Петров ПП");
        HospitalDepartment surgery = new SurgeryDepartment("Хирургия", "Мясников СС");
        HospitalDepartment therapy = new TherapyDepartment("Терапия", "Ибн Сина");
        HospitalDepartment traumatology = new TraumatologyDepartment("Травматология", "Выбийзуб ТТ");

        hdList.add(neurology);
        hdList.add(resuscitation);
        hdList.add(surgery);
        hdList.add(therapy);
        hdList.add(traumatology);


        for (int i = 0; i < hdList.size(); i++) {
            System.out.println(i);
            hdList.get(i).morningPlanner();
            if (i % 2.0 == 0.0) {
                hdList.get(i).takePatient();
                if (hdList.get(i) instanceof TraumatologyDepartment)
                    ((TraumatologyDepartment) hdList.get(i)).вправитьЧелюсть(); //идея сама сделала преобразование, у меня не получалось.
            }
        }
    }
}
