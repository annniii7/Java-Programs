package practiceset8;

class circle{
    double rad;
    double area;
    double circumference;
    public void setRad(double radius){
        rad=radius;
    }
    public void cal(){
        area=3.14*rad*rad;
        circumference=2*3.14*rad;
    }
    public void print(){
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: "+ circumference);
    }
}
public class ques6 {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.setRad(3.1496);
        obj.cal();
        obj.print();

    }
}
