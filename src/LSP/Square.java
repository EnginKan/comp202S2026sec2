package LSP;

public class Square extends Rectangle{

     private int side;

    public Square(int side) {

        super(side, side);
        this.side = side;
            }


        @Override
        public double getArea(){
               return side*side;
            }

    public void setHeight(int height){
        this.setHeight(height);
        this.setWidth(height);
        this.side = side;
    }
}
