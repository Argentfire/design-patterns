package designpatterns.commandobserver;

public class Observer {
    void Observe(Oven oven) {
        if(oven.getStatus()) {
            System.out.println("Oven is working");
        }
        else {
            System.out.println("Oven is not working");
        }
    }
}
