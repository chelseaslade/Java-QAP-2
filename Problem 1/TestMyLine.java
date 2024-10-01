
public class TestMyLine {
    public static void main(String[] args)
    {
        //Create begin/end point objects
        MyPoint beginPoint = new MyPoint(1,3);
        MyPoint endPoint = new MyPoint(2,4);

        //Create line objects
        MyLine lineOne = new MyLine(beginPoint, endPoint);
        MyLine lineTwo = new MyLine(1, 2, 2, 4);

        //Get Begin()
        System.out.println(lineOne.getBegin());
        System.out.println(lineTwo.getBegin());

    }
}
