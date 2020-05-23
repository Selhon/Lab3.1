import java.util.ArrayList;
import java.util.function.BiFunction;
/*String line ="Конфеты ’Маска’;45;120";
        String item_fld[]=line.split(";",3);
        FoodItem a=new FoodItem(item_fld[0],new Float(item_fld[1]),new Short(item_fld[2]));
        a.printAll();*/
public class Main {
    public static void main(String[] args) {
        Test1<Integer,String> d=new Test1<Integer,String>();
        ArrayList<String> m=new ArrayList<String>();
        m.add("1");
        m.add("2");
        m.add("3");
        Integer e=0;
        Integer ans;
        BiFunction<String,Integer,Integer> fun=(val,acc)-> acc+Integer.parseInt(val);
        ans=d.merge(m,e,fun);
        System.out.print(ans);
    }
}