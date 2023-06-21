package ejemplo;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,4,4,4,4};
        P1 p1 = new P1();
        System.out.println(p1.countClumps(array));

    }
}