package hw4.hospital;

import java.util.List;

public class Service {

    public void reporting(List<HospitalWorker> workers){
        String result = "";
        for (int i = 0; i < workers.size(); i++) {
            String workersName = workers.get(i).getName();
            result = result + workersName + "\n";
        }
        System.out.println(result);
    }
}
