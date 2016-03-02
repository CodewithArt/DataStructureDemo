import java.util.Arrays;

/**
 * Created by vesar on 02.03.2016.
 */
public class BookStack {
    private String[] data;
    private int top;

    public BookStack(int l) {
        data = new String[l];
        top = -1;
    }

    public void push(String element) {
        top++;
        data[top] = element;
    }

    public String pop() {
        String element = data[top];
        top--;
        return element;
    }

    @Override
    public String toString() {
        String str = new String();
        for (String el : data)
            str += el + ',';
        return str;
    }
}
