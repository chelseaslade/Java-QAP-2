
public class TestMyLine {
    public static void main(String[] args)
    {
        //Create begin/end point objects
        MyPoint beginPoint = new MyPoint(1,3);
        MyPoint endPoint = new MyPoint(2,4);

        //Create line objects
        MyLine lineOne = new MyLine(beginPoint, endPoint);
        MyLine lineTwo = new MyLine(1, 2, 2, 4);

        // //getBegin()
        // System.out.println(lineOne.getBegin());
        // System.out.println(lineTwo.getBegin());

        // //setBegin() using another MyPoint object
        // MyPoint newBegin = new MyPoint(3,5);
        // lineOne.setBegin(newBegin);
        // System.out.println(lineOne.beginPoint);

        // //setEnd() using another MyPoint object
        // MyPoint newEnd = new MyPoint(1,2);
        // lineOne.setEnd(newEnd);
        // System.out.println(lineOne.endPoint);

        // //getBeginX()
        // System.out.println(lineOne.getBeginX());

        // //setBeginX()
        // lineOne.setBeginX(6);
        // System.out.println(lineOne.beginPoint);

        // //getBeginY()
        // System.out.println(lineOne.getBeginY());

        // //setBeginY()
        // lineOne.setBeginY(2);
        // System.out.println(lineOne.beginPoint);

        // //getEndX()
        // System.out.println(lineOne.getEndX());

        // //setEndX()
        // lineOne.setEndX(2);
        // System.out.println(lineOne.endPoint);
        
        // //getEndY()
        // System.out.println(lineOne.getEndY());

        // //setEndY()
        // lineOne.setEndY(1);
        // System.out.println(lineOne.endPoint);

        //getBeginXY()
        System.out.println("Get Begin XY: ");
        lineOne.getBeginXY();

        //setBeginXY()
        System.out.println("Set Begin XY: ");
        lineOne.setBeginXY(2,3);
        System.out.println(lineOne.beginPoint);

        //getEndXY()
        System.out.println("Get End XY: ");
        lineOne.getEndXY();

        //setEndXY()
        System.out.println("Set End XY: ");
        lineOne.setEndXY(2,3);
        System.out.println(lineOne.endPoint);
    }
}
