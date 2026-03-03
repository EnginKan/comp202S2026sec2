package LSP;

public class Rectangle {

    private int height,width;


    public Rectangle(int height, int width){
        this.height= height;
        this.width = width;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }
}
