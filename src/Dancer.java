public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void dancing(){
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "groupName: " + groupName +"\n"+
                super.toString();
    }
}
