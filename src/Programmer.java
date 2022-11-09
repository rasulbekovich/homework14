public class Programmer extends Person {
    private String companyName;


    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void coding(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "companyName: " + companyName +"\n"+
                super.toString();
    }
}
