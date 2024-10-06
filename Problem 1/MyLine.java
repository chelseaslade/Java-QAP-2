public class MyLine {
    //Attributes
    private MyPoint beginPoint;
    private MyPoint endPoint;

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
    public MyPoint getBegin()
    {
        return this.beginPoint;
    }

    public void setBegin(MyPoint newBegin)
    {
        this.beginPoint = newBegin;
    }

    public MyPoint getEnd()
    {
        return this.endPoint;
    }

    public void setEnd(MyPoint newEnd)
    {
        this.endPoint = newEnd;
    }

    public int getBeginX()
    {
        return beginPoint.getX();
    }

    public void setBeginX(int x)
    {
        beginPoint.setX(x);
    }

    public int getBeginY()
    {
        return beginPoint.getY();
    }

    public void setBeginY(int y)
    {
        beginPoint.setY(y);
    }

    public int getEndX()
    {
        return endPoint.getX();
    }

    public void setEndX(int x)
    {
        endPoint.setX(x);
    }

    public int getEndY()
    {
        return endPoint.getY();
    }

    public void setEndY(int y)
    {
        endPoint.setY(y);
    }

    public int[] getBeginXY()
    {
        int intX = beginPoint.getX();
        int intY = beginPoint.getY();

        int[] beginXY = {intX, intY};

        for (int i = 0; i<beginXY.length; i++) 
        {
            System.out.println(beginXY[i]);
        }

        return beginXY;
    }

    public void setBeginXY(int x, int y)
    {
        this.beginPoint.setX(x);
        this.beginPoint.setY(y);
    }


    public int[] getEndXY()
    {
        int intX = endPoint.getX();
        int intY = endPoint.getY();

        int[] endXY = {intX, intY};

        for (int i = 0; i<endXY.length; i++) 
        {
            System.out.println(endXY[i]);
        }

        return endXY;
    }

    public void setEndXY(int x, int y)
    {
        this.endPoint.setX(x);
        this.endPoint.setY(y);
    }

    public double getLength() 
    {
        return this.beginPoint.distance(this.endPoint);
    }

    public double getGradient() 
    {
        double xDiff = this.endPoint.getX() - this.beginPoint.getX() ;
        double yDiff = this.endPoint.getY() - this.beginPoint.getY();

        return Math.atan2(yDiff, xDiff);
    }

    public String toString()
    {
       String lineString = "MyLine[begin=" + this.getBegin() + ",end=" + this.getEnd();

       return lineString;
    }
}
