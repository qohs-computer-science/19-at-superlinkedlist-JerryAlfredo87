import java.util.LinkedList;
import java.util.Iterator;
//Name: Meade Havenstein
//Date and period: 12/1 Pd 6
//Purpose: 
public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        Iterator <E> iter  = this.iterator();
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
        Iterator <E> iter  = this.iterator();
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
        Iterator <E> iter  = this.iterator();
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
        iter  = this.iterator();
        return a;
    }

    public LinkedList<String> concatenateStrings() {
        Iterator <E> iter  = this.iterator();
        LinkedList <E> a = new LinkedList <E> ();
        String temp;
        for(i = 0; i < this.length(); i++)
        {
            for(x = 0; x <= i; x++)
            {
                temp += iter.next();
            }
            a += temp;
        }
        return a;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        Iterator <E> iter  = this.iterator();
        Iterator <E> ator  = list2.iterator();
        LinkedList <E> merged = new LinkedList <E> ();
        while(iter.hasNext())
        {
            merged += iter.next();
            merged += ator.next();
        }
        return merged;
    }

    public String toString() {
        Iterator <E> iter  = this.iterator();
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