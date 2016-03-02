/**
 * Created by vesar on 02.03.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        BookStack stack = new BookStack(5);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        stack.pop();
        stack.pop();

        stack.push("Fourth");


    }
}
