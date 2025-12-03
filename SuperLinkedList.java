import java.util.LinkedList;
import java.util.Iterator;
//Name: Meade Havenstein
//Date and period: 12/1 Pd 6
//Purpose: 
public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        Iterator <String> iter  = this.iterator();
        boolean torf = false;
        while (iter.hasNext())
        {
            if("aeiou".indexOf(iter.next().toLowerCase())!=-1)
            {
                iter.remove();
                torf = true;
            }
        }
        return torf;
    }

    public boolean removeConsonants() {
        Iterator <String> iter  = this.iterator();
        boolean torf = false;
        while (iter.hasNext())
        {
            if("aeiou".indexOf(iter.next().toLowerCase())==-1)
            {
                iter.remove();
                torf = true;
            }
        }
        return torf;
    }

    public void reset() {
        Iterator <String> iter = this.iterator();
        while(iter.hasNext())
        {
            iter.next();
            iter.remove();
        }
    }

    public LinkedList<String> removeDuplicates() {
        Iterator <String> iter  = this.iterator();
        LinkedList <String> a = new LinkedList <String> ();
        String variable = "";
        String last = "";
        while(iter.hasNext())
        {
            while(variable.equals(last))
            {
                variable = iter.next();
            }
            while(iter.hasNext())
            {
                if(variable == iter.next())
                {
                    last = variable;
                    iter.remove();
                }
            }
            a.add(last);
        }
        iter  = this.iterator();
        return a;
    }

    public LinkedList<String> concatenateStrings() {
        Iterator <String> iter  = this.iterator();
        LinkedList <String> a = new LinkedList <String> ();
        String temp = "";
        for(int i = 0; i < this.size(); i++)
        {
            for(int x = 0; x <= i; x++)
            {
                temp += iter.next();
            }
            a.add(temp);
        }
        return a;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        Iterator <String> iter  = this.iterator();
        Iterator <String> ator  = list2.iterator();
        LinkedList <String> merged = new LinkedList <String> ();
        while(iter.hasNext())
        {
            merged.add(iter.next());
            merged.add(ator.next());
        }
        return merged;
    }

    public String toString() {
        Iterator <String> iter  = this.iterator();
        String returned = "";
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