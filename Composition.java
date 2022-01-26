import java.util.*;

public class Composition {

    public static void main(String[] args) {
     Dimensions dimensions=new Dimensions(20,20,5);

    Case myCase=new Case("2208", "Dell", "234", dimensions);

    Monitor theMonitor=new Monitor("27 inch beast", "acer",27, new Resolution(2341, 3000)); //we made an object without creating a variable

    Motherboard motherboard = new Motherboard(); //"bj 200", "asus",4, 5, "v2.44"

    PC thePC =new PC(myCase,theMonitor,motherboard);
        thePC.getMonitor().drawPixelAt(1590, 1234, "blue");
        thePC.getMotherboard().loadProgram("windows");
        thePC.getTheCase().pressPowerButton();

    }
    
}

class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard() {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter model: ");
        this.model = scn.nextLine();
        System.out.println("enter manufacturer: ");
        this.manufacturer = scn.nextLine();
        System.out.println("enter num of ramslots: ");
        this.ramSlots = scn.nextInt();
        System.out.println("enter num of cardslots: ");
        this.cardSlots = scn.nextInt();
        System.out.println("enter bios: ");
        this.bios = scn.nextLine();
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getRamSlots() {
        return this.ramSlots;
    }

    public int getCardSlots() {
        return this.cardSlots;
    }

    public String getBios() {
        return this.bios;
    }

    public void loadProgram(String programName) {
        System.out.println("program" + programName + " is now loading.........");
    }

}

class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeresolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeresolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeresolution = nativeresolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("drawing picture at :" + x + "," + y + "," + "in color: " + color);
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getSize() {
        return this.size;
    }

    public Resolution getNativeresolution() {
        return this.nativeresolution;
    }

}

class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

}

 class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public void pressPowerButton(){
        System.out.println(" power button pressed");
    }

}

class Dimensions{
    private int width;
    private int height;
    private int depth;


    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public int getWidth() {
        return this.width;
    }

    

    public int getHeight() {
        return this.height;
    }


    public int getDepth() {
        return this.depth;
    }
    

    
}

class PC{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }



    public Case getTheCase() {
        return this.theCase;
    }
    

    public Monitor getMonitor() {
        return this.monitor;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }


}