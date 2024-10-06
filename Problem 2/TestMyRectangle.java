
public class TestMyRectangle {
    public static void main(String[] args)
    {
        //Set objects
        MyPoint topLeftPoint = new MyPoint(1,4);
        MyPoint bottomRightPoint = new MyPoint(4, 2);

        MyRectangle rectangleOne = new MyRectangle(topLeftPoint, bottomRightPoint);

        //Test Methods
        //getTopLeft()
        System.out.println(rectangleOne.getTopLeft());

        //setTopLeft()
        rectangleOne.setTopLeft(2,3);
        System.out.println(rectangleOne.getTopLeft());

        //getBottomRight()
        System.out.println(rectangleOne.getBottomRight());

        //setBottomRight()
        rectangleOne.setBottomRight(5, 1);
        System.out.println(rectangleOne.getBottomRight());

        //getHeight()
        System.out.println(rectangleOne.getHeight());

        //getWidth()
        System.out.println(rectangleOne.getWidth());

        //getArea()
        System.out.println(rectangleOne.getArea());

        //toString()
        System.out.println(rectangleOne.toString());
    }
}
