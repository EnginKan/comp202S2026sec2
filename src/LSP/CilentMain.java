package LSP;

public class CilentMain {


    public static void main(String[] args) {

        Rectangle r = new Rectangle(3,4);
        r = new Square(4);

        r.setHeight(5);

        System.out.println(r.getArea());
    }
}
