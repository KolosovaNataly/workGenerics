import java.util.Random;

public class MagicBox<T> {

    private int value = 5;
    private int remainder = value;
    private T[] items = (T[]) new Object[value];

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                remainder--;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна и осталось ещё " + remainder + " ячеек заполнить");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(value);
        return items[randomInt];
    }
}

