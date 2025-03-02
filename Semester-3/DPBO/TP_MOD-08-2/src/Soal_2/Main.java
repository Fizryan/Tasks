package Soal_2;
/**
 *
 * @author Hafizryandin HM
 */
public class Main {
    public static void main(String[] args) {
        Appliance tv = new Television("Television", 9);
        Appliance audio = new Audio("Audio", "red");
        
        tv.turnOn();
        tv.turnOff();
        audio.turnOn();
        audio.turnOff();
    }
}
