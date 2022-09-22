public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        System.out.println(magicBox.add("Успех"));
        System.out.println(magicBox.add("Везенье"));
        System.out.println(magicBox.add("Удача"));
//        magicBox.pick();
        System.out.println(magicBox.add("Hi"));
        System.out.println(magicBox.add("Hello"));
        System.out.println(magicBox.add("Привет"));
        System.out.println(magicBox.pick());


        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        System.out.println(magicBox2.add(3));
        System.out.println(magicBox2.add(5));
        System.out.println(magicBox2.add(1));
//        magicBox.pick();
        System.out.println(magicBox2.add(4));
        System.out.println(magicBox2.add(7));
        System.out.println(magicBox2.add(6));
        System.out.println(magicBox2.pick());
    }
}

