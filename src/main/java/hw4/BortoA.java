package hw4;

import java.util.ArrayList;
import java.util.List;

public class BortoA {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Наша Таня громко плачет:");
        list.add("Уронила в речку мячик.");
        list.add("— Тише, Танечка, не плачь:");
        list.add("Не утонет в речке мяч.");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
