public class rectangle extends Shape{


    double length;
    double breadth;

    public rectangle(String color,double length,double breadth){
       super(color);
       this.length=length;
       this.breadth=breadth;
        color="RED";
    }





    @Override
    public double getArea(){
        return length * breadth;
    }



    public String get_color(){
        return color;
    }

    public void set_color(String new_color){
        this.color=new_color;
    }

    boolean is_square(){
        return length==breadth;
    }

    public void resize(double new_breadth, double new_length){
        this.breadth=new_breadth;
        this.length=new_length;

    }


    // ADDITIONAL METHOD TO VIEW THE RESIZED SHAPE
    public void view_size(){
        System.out.println("The new length is "+ this.length+"The new breadth is "+this.breadth);
    }



  





}


