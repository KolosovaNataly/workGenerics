import java.util.Random;

public class MagicBox<T> {

   private static final Random remainder = new Random();
    private T[] items;

    public MagicBox (int lengthItems){
        this.items = (T[]) new Object[lengthItems];
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна и осталось ещё " + (items.length -1));
            }
        }

        int randomCell = remainder.nextInt(items.length-1);
        return items[randomCell];
    }
}

