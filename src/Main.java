public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(2);
        boolean add = stringMagicBox.add("абв");
        boolean add1 = stringMagicBox.add("123");
        boolean add2 = stringMagicBox.add("123e");

        System.out.println(add + " " + add1 + " " + add2);

        String pick = stringMagicBox.pick();

        System.out.println(pick);

        //MagicBox <String> magicBox = new MagicBox(6);
        //System.out.println("Коробкаполная " + magicBox.add(String.valueOf(randomInt)));
    }
}