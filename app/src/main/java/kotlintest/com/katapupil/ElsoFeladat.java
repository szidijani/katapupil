package kotlintest.com.katapupil;

public class ElsoFeladat {

    static int max(int[] integers) {
        int maxValue = 0;
        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------
        maxValue=integers[0];

        for(int element = 0; element < integers.length; element++) {
            if(integers[element]>maxValue){
                maxValue=integers[element];
            }
        }

        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------
        return maxValue;
    }

    static int summod3(int[] integers){
        int solution = 0;

        for(int element : integers){
            if(element%3==0){
                solution = solution + element;
            }
        }
        return solution;
    }

    static int mulmax(int[] egyik, int[] masik) {

        return max(egyik) * max(masik);
    }

    public static void main(String[] args) {

        int[] ints = {12, 3, 212, 12, 58, 32, 825, 4, 51, 6, 1};
        int[] newInts = {120, 30, 22, 1, 8, 320, 205, 40, 1, 60, 99};
        int sum = 0;
        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------

        sum = mulmax (ints, newInts);

        // -----------------------------------------------------
        // -----------------------------------------------------
        // -----------------------------------------------------
        System.out.println(sum);
    }
}
