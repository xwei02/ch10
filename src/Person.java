public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void talk(){
        if (spouse != null){
            System.out.println("Hello! My name is "+this.name+". And my spouse is " + spouse.getName());
        }else {
            System.out.println("Hello! My name is "+name+" and I am not married.");
        }

    }
    public void setSpouse(Person spouse){
        this.spouse = spouse;
    }
    public String getName(){
        return this.name;
    }
}
