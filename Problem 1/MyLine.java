public class MyLine {
    //Attributes
    public MyPoint beginPoint;
    public MyPoint endPoint;

    //Default Constructor
    public MyLine(MyPoint beginPoint, MyPoint endPoint)
    {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    //Parameterized Constructor
    public MyLine(int x1, int y1, int x2, int y2)
    {
        beginPoint = new MyPoint(x1, y1);
        endPoint = new MyPoint(x2, y2);
    }

    //Methods
    public void getBegin()
    {
        System.out.println(beginPoint);
    }
}
