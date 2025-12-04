import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    SuperLinkedList list2 = new SuperLinkedList();
    SuperLinkedList list3 = new SuperLinkedList();
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

    System.out.println("Removing vowels in list 1:");
    System.out.println("Removed letters: " + list1.removeVowels());
    System.out.println("New list:" + list1.toString());
    System.out.println("Removing vowels in list 2:");
    System.out.println("Removed letters: " + list2.removeVowels());
    System.out.println("New list:" + list2.toString());
    System.out.println("Removing vowels in list 3:");
    System.out.println("Removed letters: " + list3.removeVowels());
    System.out.println("New list:" + list3.toString() + "\n");

    System.out.println("Resetting values of lists...\n");
    list1.reset();
    list2.reset();
    list3.reset();
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

    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");

    System.out.println("Removing consonants in list 1:");
    System.out.println("Removed letters: " + list1.removeConsonants());
    System.out.println("New list:" + list1.toString());
    System.out.println("Removing consonants in list 2:");
    System.out.println("Removed letters: " + list2.removeConsonants());
    System.out.println("New list:" + list2.toString());
    System.out.println("Removing consonants in list 3:");
    System.out.println("Removed letters: " + list3.removeConsonants());
    System.out.println("New list:" + list3.toString() + "\n");

    System.out.println("Resetting values of lists...\n");
    list1.reset();
    list2.reset();
    list3.reset();
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

    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");

    System.out.println("Removing duplicates in list 1:");
    System.out.println("Removed letters: " + list1.removeDuplicates());
    System.out.println("New list:" + list1.toString());
    System.out.println("Removing duplicates in list 2:");
    System.out.println("Removed letters: " + list2.removeDuplicates());
    System.out.println("New list:" + list2.toString());
    System.out.println("Removing duplicates in list 3:");
    System.out.println("Removed letters: " + list3.removeDuplicates());
    System.out.println("New list:" + list3.toString() + "\n");

    System.out.println("Resetting values of lists...\n");
    list1.reset();
    list2.reset();
    list3.reset();
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

    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");

    System.out.println("Concatenating list 1:");
    System.out.println("Concatenated list 1: " + list1.concatenateStrings());
    System.out.println("Concatenating list 2:");
    System.out.println("Concatenated list 2: " + list2.concatenateStrings());
    System.out.println("Concatenating list 3:");
    System.out.println("Concatenated list 3: " + list3.concatenateStrings() + "\n");

    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");

    System.out.println("List 1 and 2 mixed:");
    System.out.println(list1.mix(list2));
    System.out.println("List 1 and 3 mixed:");
    System.out.println(list1.mix(list3));
    System.out.println("List 2 and 3 mixed:");
    System.out.println(list2.mix(list3) + "\n");

    System.out.println("Resetting values of lists...\n");
    list1.reset();
    list2.reset();
    list3.reset();
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

    System.out.println("List 1:");
    System.out.println(list1.toString());
    System.out.println("List 2:");
    System.out.println(list2.toString());
    System.out.println("List 3:");
    System.out.println(list3.toString() + "\n");

    System.out.println("That's everything.\n-Meade");
  } // end main
} // end class