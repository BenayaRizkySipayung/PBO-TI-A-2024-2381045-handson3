package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};

        int i = 0;
        do {
            System.out.println(kumpulanBuah[1]);
            i++;
        } while (i < kumpulanBuah.length);
    }
}
