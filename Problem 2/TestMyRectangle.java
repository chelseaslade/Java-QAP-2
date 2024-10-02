
public class TestMyRectangle {
    public static void main(String[] args)
    {
        //Set objects
        MyPoint topLeftPoint = new MyPoint(1,2);
        MyPoint bottomRightPoint = new MyPoint(4,5);

        MyRectangle rectangleOne = new MyRectangle(topLeftPoint, bottomRightPoint);

        //Test Methods
        //getTopLeft()
        System.out.println(rectangleOne.getTopLeft());

        //setTopLeft()
        rectangleOne.setTopLeft(2,3);
        System.out.println(rectangleOne.topLeftPoint);

        //getBottomRight()
        System.out.println(rectangleOne.getBottomRight());

        //setBottomRight()
        rectangleOne.setBottomRight(5, 6);
        System.out.println(rectangleOne.bottomRightPoint);

        //toString()
    }
}
