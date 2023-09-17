package javatopics;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
        ad.add(1);
        ad.add(7);
        ad.addFirst(0);
        ad.add(10);
        System.out.println(ad.getFirst());
        ad.removeLast();
        System.out.println(ad.getLast());
        System.out.println(ad.pollLast());
    }
}
