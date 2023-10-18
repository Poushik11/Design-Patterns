import java.io.IOException;       
class PrototypeDemo{  
         public static void main(String[] args) throws IOException {  
            
            //create Prototype for Employee Record                    
            Prototype P1=new EmployeeRecord(000000,"XXXXXXXXXXXX","CSE",00000.00,"Nagpur");  
            P1.showRecord();  
            System.out.println("\n");  
            
            EmployeeRecord e2=(EmployeeRecord)P1.getClone();  
            e2.showRecord();  
            System.out.println("\n");  
            
            //create Prototype for Student Record 
            Prototype P2=new StudentRecord(000,"YYYYYYYYYYYY","CSE",00.00,"Nagpur");  
            P2.showRecord();  
            System.out.println("\n");  
            
            StudentRecord s2=(StudentRecord) P2.getClone();  
            s2.showRecord();  
            
        }     
    }