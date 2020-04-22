package designpatterns.commandobserver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeAssistant homeAssistant = new HomeAssistant();
        Oven oven = new Oven();
        Command activateOven = new ActivateOvenCommand(oven);
        homeAssistant.SetCommand(activateOven);
        Observer observer = new Observer();

        while(true) {
            System.out.println("1 - Press the button | 2 - Status Reporter");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    homeAssistant.PressButton();
                    break;
                }
                case 2: {
                    observer.Observe(oven);
                    break;
                }
            }
        }
    }
}
