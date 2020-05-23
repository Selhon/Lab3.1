import java.util.ArrayList;
import java.util.function.BiFunction;

public class Test1 <T,R>{
    public T merge(ArrayList<R> mas, T accum, BiFunction<R,T,T> curr){
        for(int i=0;i< mas.size();i++){
            accum=curr.apply(mas.get(i),accum);
        }
        return accum;
    }
}
