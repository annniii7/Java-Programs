package practiceset8;

class Employee{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String newname){
        name=newname;
        return newname;
    }
}
public class ques1 {
    public static void main(String[] args) {
        Employee object=new Employee();
        object.name="Anirudh";
        object.salary=108;
        System.out.println(object.getName());
        System.out.println(object.getSalary());
        System.out.println(object.setName("anii"));
        System.out.println(object.getName());

    }
}
