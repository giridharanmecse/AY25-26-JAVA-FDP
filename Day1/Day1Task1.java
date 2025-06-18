interface Vehicle extends Display{
    public void run();
}

interface Animal extends Display{
    public void run();
}

interface Shape{
    public void area();
}

interface Display{
   public void printMessage();
}
class Dog implements Animal,Display{
    public void run(){
        System.out.println("Dog runs");
    }

    public void printMessage(){
        System.out.println("Dog class Message");
    }
}

class BullockCart implements Animal,Vehicle,Display{
    public void run(){
        System.out.println("Bullock Cart Run");
    }

    public void printMessage(){
        System.out.println(" Bullock Cart Class");
    }
}

public class Day1Task1 {
    public static void main(String[] args) {
        Animal a1 = new BullockCart();
        a1.run();
        a1.printMessage();
        Vehicle a2 = new BullockCart();
        a2.run();
        a2.printMessage();
    }
    
}
