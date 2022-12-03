import java.util.Random;

public class MagicBox<T> {

    private T[] items;
    private int sizeArray;


    public MagicBox(int sizeArray){
        this.items = (T[]) new Object[sizeArray];
        this.sizeArray = sizeArray;
    }

    public boolean add(T item) {
        for(int i = 0; i < items.length; i++) {
            if(items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for(int i = 0; i < items.length; i++) {
            if(items[i] == null) {
                throw new RuntimeException(String.format("Неполная коробка! Необходимо заполнить % d элементов", items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(sizeArray);
        return items[randomInt];
    }

    //public String maxName;
    //public MagicBox(String maxName) {
        //this.maxName = maxName;
   // }
}
