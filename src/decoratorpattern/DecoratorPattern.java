package decoratorpattern;

import decoratorpattern.Computer;
import decoratorpattern.Disk;
import decoratorpattern.Monitor;
import decoratorpattern.CD;

public class DecoratorPattern {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new Disk(computer); 
// vì disk là con của extends Computer mà ComponentDecorator là con của computer
        computer = new Monitor(computer);
        computer = new CD(computer);
        
        System.out.println("You'are getting a " + computer.description());
    }
}
