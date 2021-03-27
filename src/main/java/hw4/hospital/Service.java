package hw4.hospital;

import java.util.List;

public class Service {

    public void reporting(HospitalDepartment department){
        String result = "";
        List<HospitalWorker> workers = department.getStaffOfDepartment();
        for (int i = 0; i < workers.size(); i++) {
            String workersName = workers.get(i).getName();
            result = result + workersName + "\n";
        }
        System.out.println(result);
    }
}
