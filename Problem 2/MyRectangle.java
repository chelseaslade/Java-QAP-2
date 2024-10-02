
public class MyRectangle {
    //Attributes
    protected MyPoint topLeftPoint;
    protected MyPoint bottomRightPoint;

    //Constructors
    public MyRectangle(MyPoint topLeftPoint, MyPoint bottomRightPoint)
    {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }
    
    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        topLeftPoint = new MyPoint(x1, y1);
        bottomRightPoint = new MyPoint(x2, y2);
    }

    //Methods
    //getTopLeft()

    //setTopLeft()

    //getBottomRight()

    //setBottomRight()

    //toString()

}
