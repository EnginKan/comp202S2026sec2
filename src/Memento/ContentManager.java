package Memento;

import java.util.EmptyStackException;
import java.util.Stack;

//CareTaker
public class ContentManager {


    private  Stack<ContentHistory> undoStack =
            new Stack<ContentHistory>();
    private  Stack<ContentHistory> redoStack =
            new Stack<ContentHistory>();


    public void saveContent(ContentHistory contentHistory){
        undoStack.push(contentHistory);
    }

    public  ContentHistory undoHistory(){
        if(!undoStack.empty()) {
            redoStack.push(undoStack.pop());
            return undoStack.peek();

        }
        else
            throw new EmptyStackException();
    }

    public ContentHistory redoHistory(){
        return redoStack.peek();
    }



}
