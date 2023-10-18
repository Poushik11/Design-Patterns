public class leaf implements employee {
    String name;
    long id;
    String position;
    leaf(String name, String position, long id){
        this.name = name;
        this.position = position;
        this.id = id;
    }

    @Override
    public void showempdeails() {
        System.out.println(name + "   " + position + "    " + id);
    }

    @Override
    public void addemp(employee x) {
        
    }

    @Override
    public void removeemp(employee x) {
       
    }
    
}
