public class main {
    public static void main(String[] args) {
        employee ceo = new leaf("Poushik", "CEO", 1);
        ceo.showempdeails();
        employee production_manager = new leaf("Anuj", "PM", 2);
        employee Sales_Manager = new leaf("Ashutosh", "SM", 3);
        employee clerk1 = new leaf("Ash", "S", 4);
        employee clerk2 = new leaf("tosh", "M", 5);
        // employee Sales_Manager = new leaf("Ashutosh", "SM", 3);

        composite ceo_team = new composite();
        ceo_team.addemp(ceo);
        ceo_team.addemp(production_manager);
        ceo_team.addemp(Sales_Manager);
        // ceo_team.showempdeails();
        composite prod_team=new composite();
        prod_team.addemp(production_manager);
        prod_team.addemp(clerk1);
        composite sales_team=new composite();
        sales_team.addemp(Sales_Manager);
        sales_team.addemp(clerk2);
        ceo_team.addemp(sales_team);
        ceo_team.addemp(prod_team);
        ceo_team.showempdeails();
    }
}
