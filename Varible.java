/**
 * Varibales are a way to store information in our computer. Variables that we
 * define in a program can be accessed by a name we give them
 * 
 * To define a variable we need to specify the daya type,then give our variable
 * a name, and optionally add an expression to intitialize the variable with a
 * value
 */

public class Varible {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int myFirstNumber = (10 + 5) + (2 * 10);
       char var = '\n';
        boolean _Value;
         _Value = Character.isWhitespace(var);
        System.out.println(_Value);

        // ! myFirstNumber is a variable of type int(Integer)
        System.out.println(myFirstNumber);
    }
}
