package Zadachi.For_Loop;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
