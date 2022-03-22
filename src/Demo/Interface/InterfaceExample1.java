package Demo.Interface;

interface Shopping {
    void itemName();
    void itemCategory();
    void itemPrice();
}


class ItemDetials implements Shopping {
    public void itemName() {
        System.out.println("Strawberries");
    }

    public void itemCategory() {
        System.out.println("Fruit");
    }


    public void itemPrice() {
        System.out.println("Rs. 200");
    }


}


public class InterfaceExample1 {
    public static void main(String[] args) {

        ItemDetials sp = new ItemDetials();


        sp.itemName();
        sp.itemCategory();
        sp.itemPrice();


    }
}
