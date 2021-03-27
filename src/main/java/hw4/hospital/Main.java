package hw4.hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HospitalDepartment> hdList = new ArrayList<>();

        HospitalWorker w1 = new Doctor("Панамаренко ОА", 35,"Врач", "Неврология", "Специалист");
        HospitalWorker w2 = new Doctor("Петренко ОА", 50, "Зав отделения",  "Неврология", "Супер Специалист");
        HospitalWorker w3 = new Doctor("Иваненко ОА", 50, "Зав отделения", "Терапия", "Супер Специалист");
        HospitalWorker w4 = new Doctor("Овчаренко ОА",36 ,"Врач", "Терапия", "Специалист");
        HospitalWorker w5 = new Doctor("Симоненко ОА", 50, "Зав отделения", "Хирургия", "Супер Специалист");
        HospitalWorker w6 = new Doctor("Гончаренко ОА", 35,"Врач", "Хирургия","Специалист");
        HospitalWorker w7 = new Doctor("Порошенко ОА", 35,"Врач", "Травматология","Специалист");
        HospitalWorker w8 = new Doctor("Лукашенко ОА", 50, "Зав отделения", "Травматология","Супер Специалист");
        HospitalWorker w9 = new Doctor("Стефаненко ОА", 35,"Врач", "Реаниматология","Специалист");
        HospitalWorker w10 = new Doctor("Стоценко ОА", 50, "Зав отделения", "Реаниматология","Супер Специалист");
        HospitalWorker w11 = new Nurse("Тимошенко ОА", 25, "Медсестра", "Общая");
        HospitalWorker w12 = new Nurse("Пастушенко ОА", 25, "Медсестра","Общая");
        HospitalWorker w13 = new Nurse("Комаров ОА", 25, "Медсестра","Общая");
        HospitalWorker w14 = new Nurse("Барский ОА", 25, "Медсестра","Общая");
        HospitalWorker w15 = new Nurse("Ильченко ОА", 25, "Медсестра","Общая");

        List <HospitalWorker> n_gy = Arrays.asList(w1, w2, w13);
        List <HospitalWorker> t_py = Arrays.asList(w3, w4, w15);
        List <HospitalWorker> s_ry = Arrays.asList(w5, w6, w14);
        List <HospitalWorker> t_gy = Arrays.asList(w7, w8, w12);
        List <HospitalWorker> r_on = Arrays.asList(w9, w10, w11);


        HospitalDepartment neurology = new NeurologyDepartment("Неврология", w2, n_gy);
        HospitalDepartment therapy = new TherapyDepartment("Терапия", w3, t_py);
        HospitalDepartment surgery = new SurgeryDepartment("Хирургия", w5, s_ry);
        HospitalDepartment traumatology = new TraumatologyDepartment("Травматология", w8, t_gy);
        HospitalDepartment resuscitation = new ResuscitationDepartment("Реанимация", w10, r_on);


        hdList.add(neurology);
        hdList.add(resuscitation);
        hdList.add(surgery);
        hdList.add(therapy);
        hdList.add(traumatology);

        for (int i = 0; i <  hdList.size(); i++) {
            System.out.printf("Отделение %s \n", hdList.get(i).getDepartmentName());
            for (int j = 0; j < hdList.get(i).getStaffOfDepartment().size(); j++){
                System.out.print("    - " + hdList.get(i).getStaffOfDepartment().get(j).getName());
                System.out.println("; " + hdList.get(i).getStaffOfDepartment().get(j).getPosition());
            }
        }

//        Service service = new Service();
//        service.reporting(neurology);
//        service.reporting(therapy);


    }
}
