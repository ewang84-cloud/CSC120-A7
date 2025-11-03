/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Constructor of the Cafe Class
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams=nCreams;
        this.nCups=nCups;
        System.out.println("You have built a cafe: ☕");
    }


    /**
     * A method that sells the coffee
     * @param size the amount of coffee ounces that will be used in this selled coffee
     * @param nSugarPackets the amount of sugar packets that will be used in this selled coffee
     * @param nCream the amount of cream that will be used in this selled coffee
     */
    @Override
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces>= size && this.nSugarPackets>=nSugarPackets && this.nCreams>=nCreams && this.nCups>=1){
            this.nCoffeeOunces-=size;
            this.nSugarPackets-=nSugarPackets;
            this.nCreams-=nCreams;
            this.nCups-=1;
            System.out.println("Successfully purchased, your coffee is on the way");
        }
        else{
            System.out.println("No enough materials for your coffee. Restocking now!!");
            restock(100, 100, 100, 50);
            sellCoffee(size, nSugarPackets, nCreams);
        }
    }
    
    /**
     * Method for restocking cofe inventory
     * @param nCoffeeOunces the amount of Coffee Ounces that we want to restock
     * @param nSugarPackets the amounf of Sugar Packets that we want to restock
     * @param nCreams the amount of Creams we wants to restock
     * @param nCups the amount of cups that we want to restock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Restocked: +" + nCoffeeOunces + "oz coffee, +" + nSugarPackets + " sugar, +" + nCreams + " creams, +" + nCups + " cups.");
    }


    public static void main(String[] args) {
        new Cafe("Compass", "123 Prospect Street", 2, 100, 100, 100, 100);
    }
    
}
