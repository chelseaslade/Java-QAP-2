
public class TestMyLine {
    public static void main(String[] args)
    {
        //Create begin/end point objects
        MyPoint beginPoint = new MyPoint(1,3);
        MyPoint endPoint = new MyPoint(2,4);

        //Create line objects
        MyLine lineOne = new MyLine(beginPoint, endPoint);
        MyLine lineTwo = new MyLine(1, 2, 2, 4);

        //getBegin()
        System.out.println("Get Begin: ");
        System.out.println(lineOne.getBegin());
        System.out.println(lineTwo.getBegin());

        //setBegin() using another MyPoint object
        System.out.println("Set Begin: ");
        MyPoint newBegin = new MyPoint(3,5);
        lineOne.setBegin(newBegin);
        System.out.println(lineOne.getBegin());

        //setEnd() using another MyPoint object
        System.out.println("Set End: ");
        MyPoint newEnd = new MyPoint(1,2);
        lineOne.setEnd(newEnd);
        System.out.println(lineOne.getEnd());

        //getBeginX()
        System.out.println("Get Begin X: ");
        System.out.println(lineOne.getBeginX());

        //setBeginX()
        System.out.println("Set Begin X: ");
        lineOne.setBeginX(6);
        System.out.println(lineOne.getBegin());

        //getBeginY()
        System.out.println("Get Begin Y: ");
        System.out.println(lineOne.getBeginY());

        //setBeginY()
        System.out.println("Set Begin Y: ");
        lineOne.setBeginY(2);
        System.out.println(lineOne.getBegin());

        //getEndX()
        System.out.println("Get End X: ");
        System.out.println(lineOne.getEndX());

        //setEndX()
        System.out.println("Set End X: ");
        lineOne.setEndX(2);
        System.out.println(lineOne.getEnd());
        
        //getEndY()
        System.out.println("Get End Y: ");
        System.out.println(lineOne.getEndY());

        //setEndY()
        System.out.println("Set End Y: ");
        lineOne.setEndY(1);
        System.out.println(lineOne.getEnd());

        //getBeginXY()
        System.out.println("Get Begin XY: ");
        lineOne.getBeginXY();

        //setBeginXY()
        System.out.println("Set Begin XY: ");
        lineOne.setBeginXY(5,2);
        System.out.println(lineOne.getBegin());

        //getEndXY()
        System.out.println("Get End XY: ");
        lineOne.getEndXY();

        //setEndXY()
        System.out.println("Set End XY: ");
        lineOne.setEndXY(2,3);
        System.out.println(lineOne.getEnd());

        //getLength()
        System.out.println("Get Length: ");
        System.out.println(lineOne.getLength());

        //getGradient()
        System.out.println("Get Gradient: ");
        System.out.println(lineOne.getGradient());

        //toString()
        System.out.println("toString: ");
        System.out.println(lineOne.toString());
    }
}
