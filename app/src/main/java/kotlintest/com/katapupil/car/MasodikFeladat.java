package kotlintest.com.katapupil.car;

import java.util.ArrayList;
import java.util.List;

public class MasodikFeladat {

    public static void main(String[] args) {

        Part kipufogo = new Part("H73");
        Part kipuf2 = kipufogo;
        Part kerek = new Part("A71");
        Part szelvedo = new Part("A13");
        Part balElsoLampa = new Part("D22");

        Work kerekCsere = new Work(1, 12);
        Work olajCsere = new Work(1, 10);
        Work lakatosMunka = new Work(10, 190);
        Work motorBeallitas = new Work(2, 20);

        Client kata = new Client("AH687BE", Membership.START);
        Client szidi = new Client("ZH6876J", Membership.PLATINA);

        List<Part> partList = new ArrayList<>();
        partList.add(kipufogo);
        partList.add(kerek);

        List<Work> workList = new ArrayList<>();
        workList.add(olajCsere);
        workList.add(kerekCsere);

        Service kataService = new VanService(partList, workList, kata, WeightCategory.NORMAL);

        System.out.println("Kata's service fees: " + kataService.workPrice());
    }
}
