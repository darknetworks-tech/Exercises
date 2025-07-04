public class Cat extends animal{



    public Cat(){
        habitat="Tree";
        LifeSpan=6;

    }

    @Override
    public void makeSound(){
        System.out.println("I am barking wooff");
    }


    public void scratch(){
        System.out.println("i am scratching ");
    }



   /*
    @Override

    void makeSound(){
       System.out.println("I am meowing");
   }

    */






}