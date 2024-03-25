package ca.mcgill.cs.swdesign.composite.amazonbox;

import java.lang.reflect.Method;

public class DeliveryService {

    private Box box;
    public DeliveryService() {

    }
    public void setupOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }
    public double calculateOrderPrice(){
        return box.calculatePrice();
    }

    public static void main(String[] args){
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new Book("2", 20),
                        new CompositeBox(
                                new VideoGame("3", 120)
                        )
                )
        );


        System.out.println("-------------printing all the methods under class CompositeBox --------------");

        Class<CompositeBox> class1 = CompositeBox.class;
        for (Method method : class1.getDeclaredMethods()){
            System.out.println(method);
        };


    }
}
