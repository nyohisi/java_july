package ru.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.javajuly.sandbox.Point;

public class DistanceTests {
    @Test
    public void distanceTestPositiveCoordinates() {
        Point p1 = new Point(2,1);
        Point p2 = new Point(1,1);
        Assert.assertEquals(p1.distance(p2), 1.0);
    }

    @Test
    public void distanceTestSamePoint() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,1);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }

    @Test
    public void distanceTestNegativeCoordinates() {
        Point p1 = new Point(-1,1);
        Point p2 = new Point(1,-5);
        Assert.assertEquals(p1.distance(p2), 6.324555320336759);
    }
}
