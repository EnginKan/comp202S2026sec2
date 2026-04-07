package Memento;

public class MainProg {

    public static void main(String[] args) {

        MyDocument document=new MyDocument();

        document.setContent("This");

        document.save();
        System.out.println(document.getContent());
        document.setContent("is");
        document.save();
        document.setContent("content");
        document.save();

        System.out.println(document.getContent());

        document.undo();
        System.out.println(document.getContent());
        document.undo();
        System.out.println(document.getContent());
        document.redo();
        System.out.println(document.getContent());
        document.redo();
        System.out.println(document.getContent());

    }
}
