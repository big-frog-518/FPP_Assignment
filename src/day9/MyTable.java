package day9;

/**
 * @Author Jinxu Zheng
 * @Date 6/8/2023
 * Inner class
 **/
public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }



    //returns the String that is matched with char c in the table
    public String get(char c) {
        //implement
        for (int i = 0; i < entries.length; i++) {
            if (entries[i].ch == c) {
                return entries[i].str;
            }
        }
        return null;
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement
        //  compute the position
        int index = c - 'a';
        if (index >= 0 && index < entries.length) {
            entries[index] = new Entry(c, s);
        }
    }

    //returns a String consisting of nicely formatted display
    //of the contents of the table
    public String toString() {
        //implement
        StringBuilder sb = new StringBuilder();
        for (Entry e:entries){
            if (e!=null){
                sb.append(e+"\n");
            }
        }
        return sb.toString();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            //implement
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
            //implement
            return ch + "->" + str;
        }
    }
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t.get('a'));
        System.out.println(t);
    }
}
