package handson1;

public class ForEach    {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Ape", "Pisang", "Mangga", "Jeruk"};

        for (String itemBuah : kumpulanBuah) {
            System.out.println(itemBuah);
        }
    }
}
