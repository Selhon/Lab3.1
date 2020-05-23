public class TechicalItem extends GenericItem {
        short warrantyTime;
    void printAll(){
        System.out.printf("Warranty time: %d ",warrantyTime);
        super.printAll();
    }
    public boolean equals(Object o){
        if(super.equals(o)){
            if(o instanceof TechicalItem){
                TechicalItem curr=(TechicalItem) o;
                if(curr.warrantyTime==this.warrantyTime){
                    return true;
                }
            }
        }
        return false;
    }

    public Object clone(){
        TechicalItem newObj=new TechicalItem();
        newObj.ID=this.ID;
        newObj.name=this.name;
        newObj.price=this.price;
        newObj.category=this.category;
        newObj.warrantyTime=this.warrantyTime;
        if(this.analog!=null){
            //newObj.analog=(GenericItem) this.analog.clone();
        }
        return newObj;
    }
    public String toString(){
        return super.toString()+", warranty Time="+warrantyTime;
    }
}
