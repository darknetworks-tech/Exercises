public class employee{

    String name;
    double salary;

    employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public void work(){
        System.out.println(this.name+" Is working");
    }

    public double getSalary(){
        return salary;
    }

    public void trackOvertime(int noOfHoursWorked){

        if(noOfHoursWorked>5){
            System.out.println("You have worked overtime");
        }
        else{
            System.out.println("You are still in the normal time frame");
        }

    }

    public void showHierarchy(){
        System.out.println("CHIEF EXECUTIVE OFFICER");
        System.out.println("MANAGING DIRECTOR");
        System.out.println("ASSISTANT MANAGING DIRECTOR");
        System.out.println("CHIEF FINANCIAL OFFICER");
        System.out.println("HEAD OF RETAIL MANAGER");
        System.out.println("HEAD OF DEPARTMENT");
        System.out.println("EMPLOYEE");

    }


}
