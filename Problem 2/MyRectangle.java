
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
    public MyPoint getTopLeft()
    {
        return this.topLeftPoint;
    }

    //setTopLeft()
    public void setTopLeft(int x1, int y1)
    {
        this.topLeftPoint = new MyPoint(x1, y1);
    }

    //getBottomRight()
    public MyPoint getBottomRight()
    {
        return this.bottomRightPoint;
    }

    //setBottomRight()
    public void setBottomRight(int x2, int y2)
    {
        this.bottomRightPoint = new MyPoint(x2, y2);
    }

    //getHeight()

    
    //getWidth()


    //toString()

}
