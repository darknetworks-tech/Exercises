public class HRManager extends employee {
    HRManager(String name,double salary){
        super(name,salary);
    }

    @Override
    public void work(){
        System.out.println(this.name+"is managing HR Tasks");
    }

    public void addEmployee(String employeeName){
        System.out.println("HR ADDED "+employeeName);
    }

    public void scheduleInterviews(String date,String time,String candidate_name){
        System.out.println("Interview scheduled for "+candidate_name+"on"+date+"at"+time);
    }

    public int calculateAdditionalPay(int hoursWorked){

        int addPay=hoursWorked+3000;

        return addPay;

    }

    public void requestSalary(){
        System.out.println("Send an email to the Institution concerning your salary increment");
    }

}
