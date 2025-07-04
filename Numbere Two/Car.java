import java.util.Scanner;
public class Car extends vehicle {



/*
    void setPrice(int price){
        if(price<0){
            System.out.println("Price cant be less than zero");
        }

    }


 */
    Scanner in =new Scanner(System.in);

    @Override

    public void drive(){
        System.out.println("repairing a car");

    }


    public Car(int fuelLevel){
        super (fuelLevel);
        speed="10000km/h";

    }

    public void checkFuel(){
        if(fuelLevel<15){
            System.out.println("Alert!!!! fuel is dangerously low");
        }
        else{
            System.out.println("Fuel is sufficient ");
        }

    }

    public void check_engine_status(){
        System.out.println("Car diagnostics:Essential services accurately normal,Temperature fairly hot");
    }


    public void calculate_trip_cost(){
        double fuelConsumption;

        System.out.println("Enter The Fuel Level ");

        fuelConsumption = in.nextInt();

        if(fuelConsumption <= 50){
            System.out.println("The trip cost would be $50");
        }
        else{
            System.out.println("The trip would be $80");
        }
    }






    /*
    Car(String brand){
       super(brand);
    }
    @Override

    public void move(){
        System.out.println("I am moving around");
    }

     */





}




