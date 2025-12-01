import java.util.LinkedList;
import java.util.Iterator;
//Name: Meade Havenstein
//Date and period: 12/1 Pd 6
//Purpose: 
public class SuperLinkedList extends LinkedList<String> {
    LinkedList <E> myList = new LinkedList <E> ();
    public boolean removeVowels() {
        Iterator <E> iter  = myList.iterator();
        boolean torf = false;
        while (iter.hasNext())
        {
            if(iter.next().equals(A || a || E || e || I || i || O || o || U || u))
            {
                iter.remove();
                torf = true;
            }
        }
        return torf;
    }

    public boolean removeConsonants() {
        Iterator <E> iter  = myList.iterator();
        boolean torf = false;
        while (iter.hasNext())
        {
            if(!(iter.next().equals(A || a || E || e || I || i || O || o || U || u)))
            {
                iter.remove();
                torf = true;
            }
        }
        return torf;
    }

    public LinkedList<String> removeDuplicates() {
        Iterator <E> iter  = myList.iterator();
        LinkedList <E> a = new LinkedList <E> ();
        boolean torf;
        String variable;
        String last;
        while(iter.hasNext())
        {
            while(variable.equals(last))
            {
                variable = iter.next();
            }
            while(iter.hasNext())
            {
                if(variable = iter.next())
                {
                    last += iter.remove();
                }
            }
            a += last;
        }
        iter  = myList.iterator();
        return a;
    }

    public LinkedList<String> concatenateStrings() {
        Iterator <E> iter  = myList.iterator();
        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        Iterator <E> iter  = myList.iterator();
        return null;
    }

    public String toString() {
        Iterator <E> iter  = myList.iterator();
        String returned;
        while(iter.hasNext())
        {
            returned += iter.next();
            if (iter.hasNext())
            {
                returned += ", ";
            }
        }
        return returned;
    }
} // end SuperLinkedList