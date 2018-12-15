package kata6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> {
    
    private Map<T, Integer> map;
    
    public Histogram(Iterator<T> iterator){
        this(iterableOf(iterator));
    }
    
    public Histogram(Iterable<T> iterable){
        this.map = new HashMap<T, Integer>();
        for(T item : iterable) add(item);
    }
    
    public static <T> Iterable<T> iterableOf(Iterator<T> iterator){
        return () -> iterator;
    }
    
    private void add(T item) {
        map.put(item, get(item)+1);
    }
    
    private Integer get(T item) {
        return map.containsKey(item) ? map.get(item) : 0;
    }
}
