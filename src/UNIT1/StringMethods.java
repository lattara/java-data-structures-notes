package UNIT1;



// some of the most used sting methods
public class StringMethods {
    public static void main(String[] args) {
        // startsWith( new String[]{"funk", "chunk", "furry", "baconator"});
        // endsWith( new String[]{"funk", "chunk", "furry", "baconator"});
        findChar("blablabatorinticheirliers");
    }

    public static void startsWith( String [] words) {
        for(String word : words) {
            if(word.startsWith("fu")) {
                System.out.println(word + " starts with fu");
            }
        }
    }
    public static void endsWith( String [] words) {
        for(String word : words) {
            if(word.endsWith("y")) {
                System.out.println(word + " ends with y");
            }
        }
    }
    public static void findChar (String word) {
        String a = "Bacon ";
        String b = "       monster";
        // find index
        // System.out.println(word.indexOf("lie"));
        // concat the strings
        // System.out.println(a.concat(b));
        // replace
        //System.out.println(a.replace("B", "f"));
        //to uppercase
        //System.out.println(a.toUpperCase());
        //to lowercase
        //System.out.println(a.toLowerCase());
        //remove whitespace before and after the string
        // System.out.println(b.trim());
    }


}
