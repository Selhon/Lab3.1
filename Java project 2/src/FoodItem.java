public class FoodItem  extends GenericItem {
        java.util.Date dateOfIncome;
        short expires;

        public FoodItem(String name, float price, FoodItem analog, java.util.Date date, short expires){
            this(name,price,expires);
            this.analog=analog;
            this.dateOfIncome=date;
        }
        public FoodItem(String name, float price, short expires){
            this.name=name;
            this.price=price;
            this.expires=expires;
        }
        public FoodItem(String name){
            this.name=name;
        }

    void printAll(){
        System.out.printf("Date: %s, Expires: %d ",dateOfIncome,expires);
        super.printAll();
    }
    public boolean equals(Object o){
        if(super.equals(o)){
            if(o instanceof FoodItem){
                FoodItem curr=(FoodItem) o;
                if((curr.expires==this.expires)&&(curr.dateOfIncome==this.dateOfIncome)){
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        return super.toString()+", date="+dateOfIncome+", expires="+expires;
    }
}
