import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    LinkedList <String> list1 = new LinkedList <String> ();
    LinkedList <String> list2 = new LinkedList <String> ();
    LinkedList <String> list3 = new LinkedList <String> ();
    list1.add("b");
    list2.add("R");
    list3.add("t");
    list1.add("b");
    list2.add("j");
    list3.add("E");
    list1.add("b");
    list2.add("l");
    list3.add("G");
    list1.add("i");
    list2.add("V");
    list3.add("p");
    list1.add("O");
    list2.add("h");
    list3.add("I");

    System.out.println("Original Lists:\n");
    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");


    
  } // end main
} // end class