public class MyPoint {
    //Attributes
    private int x = 0;
    private int y = 0;

    //Default Constructor
    public MyPoint()
    {
    }

    //Parameterized Constructor
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Methods
    public int getX() 
    {
        return this.x;
    }

    public int getY() 
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        String pointString = "(" + this.x + "," + this.y + ")";
        return pointString;
    }

    public double distance(int x, int y)
    {
        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint pointOne)
    {
        int xDiff = this.x - pointOne.x;
        int yDiff = this.y - pointOne.y;

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance()
    {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

}