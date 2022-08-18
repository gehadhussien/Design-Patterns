package travelsystem;

public class Admin extends Person {
    
    private int Salary;
    public String Department;
     String [][] DataBaseAdmin = {{"12000","Web Developer","ahmedali@gmail.com", "135135","Ahmed Ali","13513513513","20201111"},
                                  {"10000","Customer Service","noureslam@gmail.com", "123456","Nour Eslam","11111111111","20202222"},
                                  {"10000","Customer Service","toqamohamed@gmail.com", "123456","Toqa Mohamed","1000153135","20203333"},
                                  {"5000","Call Center","nadaezzat@gmail.com", "123456","Nada Ezzat","13132222235","20204444"},
                                  {"7000","Testing","shalaby@gmail.com", "shshsh","Shalaby","13135555555","20205555"}};
     
    public Admin(int Salary, String Department,String Email, String PassWord,String UserName, String Mob_Number,String National_ID) {
        super(Email,PassWord,UserName,Mob_Number,National_ID);
        this.Salary = Salary;
        this.Department = Department;
        
    }
    
    public Admin(String Email, String PassWord,String UserName, String Mob_Number,String National_ID)
    {
        super(Email,PassWord,UserName,Mob_Number,National_ID);
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    public String Get_Admin_Info(){
        return"Username : "+ this.getUserName()+"\n  Password :"+this.getPassword()+"\n Email : "+this.getEmail()+"\n Salary:"+this.getSalary()+"\n Mobile Number :"+this.getMob_Number()+"\n National ID : "+this.getNational_ID();
    }
}
