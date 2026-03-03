package LSPCorrect;

public class Square implements Shape{
    int side;
    @Override
    public double getArea() {
        return side*side;
    }
}
