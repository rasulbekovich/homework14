public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn(){
        System.out.println(" ");
    }
    public void walk(){
        System.out.println(" ");
    }
    public  void eat(){
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "name: "+name+"\n"+
                "designation: "+designation+"\n";

    }
}

