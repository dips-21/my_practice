package questionSet1Shopping;

public  class Item {
    int Id;
    int costPerUnit;
    String name;

    public Item(int id,String name,int costPerUnit) {
        Id = id;
        this.costPerUnit=costPerUnit;
        this.name=name;
    }

    public int getId() {
        return Id;
    }

    public int getCostPerUnit() {
        return costPerUnit;
    }

    public String getName() {
        return name;
    }
}
