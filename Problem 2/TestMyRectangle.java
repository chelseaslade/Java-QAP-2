
public class TestMyRectangle {
    public static void main(String[] args)
    {
        //Set objects
        MyPoint topLeftPoint = new MyPoint(1,4);
        MyPoint bottomRightPoint = new MyPoint(4, 2);

        MyRectangle rectangleOne = new MyRectangle(topLeftPoint, bottomRightPoint);

        //Test Methods
        //getTopLeft()
        System.out.println("Get Top Left: ");
        System.out.println(rectangleOne.getTopLeft());

        //setTopLeft()
        System.out.println("Set Top Left: ");
        rectangleOne.setTopLeft(2,3);
        System.out.println(rectangleOne.getTopLeft());

        //getBottomRight()
        System.out.println("Get Bottom Right: ");
        System.out.println(rectangleOne.getBottomRight());

        //setBottomRight()
        System.out.println("Set Bottom Right: ");
        rectangleOne.setBottomRight(5, 1);
        System.out.println(rectangleOne.getBottomRight());

        //getHeight()
        System.out.println("Get Height: ");
        System.out.println(rectangleOne.getHeight());

        //getWidth()
        System.out.println("Get Width: ");
        System.out.println(rectangleOne.getWidth());

        //getArea()
        System.out.println("Get Area: ");
        System.out.println(rectangleOne.getArea());

        //toString()
        System.out.println("toString: ");
        System.out.println(rectangleOne.toString());
    }
}
