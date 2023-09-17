package OOP;

interface sample{
    void meth1();
    void meth2();
}
interface childofsample extends sample{
    void meth3();
    void meth4();
}
class myclass implements childofsample{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        myclass c=new myclass();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();

    }
}
