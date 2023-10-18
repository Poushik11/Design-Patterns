class StudentRecord implements Prototype{  
      
   private int rollno;  
   private String name, department;  
   private double CGPA;  
   private String address;  
      
   public StudentRecord(){  
            System.out.println("   Student Records ");  
            System.out.println("---------------------------------------------");  
            System.out.println("Sroll number"+"\t"+"Sname"+"\t"+"Sdepartment"+"\t"+"SCGPA"+"\t\t"+"Saddress");  
      
}  
  
    public  StudentRecord(int rollno, String name, String department, double CGPA, String address) {  
          
        this();  
        this.rollno = rollno;  
        this.name = name;  
        this.department = department;  
        this.CGPA = CGPA;  
        this.address = address;  
    }  
      
    public void showRecord(){  
          
        System.out.println(rollno+"\t"+name+"\t"+department+"\t"+CGPA+"\t"+address);  
    }  
  
    @Override  
    public Prototype getClone() {  
          
        return new StudentRecord(rollno,name,department,CGPA,address);  
    }  
}