import java.util.ArrayList;
import java.util.Iterator;

public class composite implements employee {
    ArrayList<employee> emp = new ArrayList<>();

    @Override
    public void showempdeails() {
        Iterator<employee> i = emp.iterator();
        while(i.hasNext()){
            i.next().showempdeails();
        }
    }

    @Override
    public void addemp(employee x) {
        emp.add(x);
    }

    @Override
    public void removeemp(employee x) {
        emp.remove(x);
    }

}
