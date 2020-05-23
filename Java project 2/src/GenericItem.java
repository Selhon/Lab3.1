public class GenericItem implements Cloneable {
    GenericItem(){
        this.ID = GenericItem.currentID++;
    }
    GenericItem(int id,String n,float p, Category c){
        ID=id;
        name=n;
        price=p;
        category=c;
    }
    public GenericItem(String name, float price, Category category){
        this.name=name;
        this.price=price;
        this.category=category;
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog){
        this.name=name;
        this.price=price;
        this.analog=analog;
        this.ID = GenericItem.currentID++;
    }

    static int currentID;
    public GenericItem analog;
    public int ID;
    public String name;
    public float price;
    public Category category=Category.GENERAL;
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , Price: %5.2f , Category:%s \n",ID,name,price,category);
    }
    public boolean equals(Object o){
        if(o instanceof GenericItem){
            GenericItem curr=(GenericItem)o;
            if((curr.ID==this.ID)&&(curr.name==this.name)&&(curr.price==this.price)&&(curr.category==this.category)){
                return true;
            }
        }
        return false;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Object DeepClone() throws CloneNotSupportedException{
        GenericItem newObj=new GenericItem();
        newObj=(GenericItem)super.clone();
        newObj.analog=(GenericItem)analog.clone();
        newObj.analog.analog=newObj;
        return newObj;
    }
    public String toString(){
        return "ID="+ID+", name="+name+", price="+price+", category="+category;
    }
}
/*на методах
        джинерик типы хранить
relist
параметризированый метод принимает 3 парам аррау-лист, элем любого типа аккумулятор и би фамшен метод эплай
статический метод мёрч проходит по листу берет 1 элемент берет
би фам берет 1 эл и аккум и возвращает типа аккум*/