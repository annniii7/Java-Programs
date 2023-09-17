package javatopics;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
   ArrayList<Integer> l=new ArrayList();
   l.add(7);
   l.add(10);
   l.add(19);
   l.add(71);
   l.add(87);
   l.add(87);
//   l.add(87);
//   l.add(87);
//   l.add(87);
//   l.add(87);
//   l.add(87);
//   l.add(87);
//   l.add(87);
//        for (int i = 0; i <l.size() ; i++) {
//            System.out.print(l.get(i));
//            System.out.print(",");
//
//        }
//        l.clear();
        l.toArray();
        for (int i = 0; i <l.size() ; i++) {
            System.out.print(l.get(i));
            System.out.print(",");
//
        }

    }
}
