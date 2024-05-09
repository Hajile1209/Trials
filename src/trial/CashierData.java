package Main;
import java.util.*;

public class CashierData extends Employee{

    
    public CashierData(String name, int employeeID, String password) {
        super(name, employeeID, password);
    }
    
    ArrayList<CashierData> cashierEmployees = new ArrayList<CashierData>();
    
    public ArrayList<CashierData> registeredCashier(){
       
       CashierData emp3 = new CashierData("Bryle", 004, "Hello");
       cashierEmployees.add(emp3);
       CashierData emp2 = new CashierData("Ibarbia", 005, "Hi");
       cashierEmployees.add(emp2);
        
   return cashierEmployees;
   }
   
    
   /*public boolean VerifyEmployee(int employeeID,String password){
       boolean result=false; 
       for(Employee employee : employees){
            if(employee.employeeID == employeeID && employee.password.equals(password)){
                result = true;
                break;
            }
            else{
            }
        }
           return result;   
   } */
}
