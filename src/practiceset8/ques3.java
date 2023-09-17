package practiceset8;

class Square{
    float side;
    float area;
    float perimeter;
    public void setdata(float length){
        side=length;

    }
    public void cal(){
        area=side*side;
        perimeter=4*side;
    }
    public void print(){
        System.out.println(area);
        System.out.println(perimeter);
    }
}
public class ques3 {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.setdata(4);
        obj.cal();
        obj.print();
    }
}
