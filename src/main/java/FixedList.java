import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> items;
    private int maxsize;

    public FixedList(List<T> items, int maxsize) {
        this.items = items;
        this.maxsize = maxsize;

    }
    private void add(T item){
        if(items.size()<maxsize){
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }

}
