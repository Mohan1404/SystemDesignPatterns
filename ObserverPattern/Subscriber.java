public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name=name;
    }
    void update(){
        System.out.println("New video uploaded and user "+name+" is notified");
    }
}
