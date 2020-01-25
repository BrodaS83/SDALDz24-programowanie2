package pl.sdacademy.intermediate.basic.Basic10;

import lombok.Builder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private static final int DEFALT_WIDTH = 3;
    private static final int DEFALT_HEIGHT = 4;

    private Rectangle rectangle;

    @Before

    public void setRectangle() {
        this.rectangle = new Rectangle(DEFALT_WIDTH, DEFALT_HEIGHT);
    }

    @After
    public void printNewSet() {
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimete() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(-2, 0);
    }

    @Test
    public void testGetterWidth() {
        Assert.assertEquals(DEFALT_WIDTH, rectangle.getWidth());
    }

    @Test
    public void testGetterHeight() {
        Assert.assertEquals(DEFALT_HEIGHT, rectangle.getHeight());
    }

    @Test
    public void testUpdateWidth() {
        rectangle.updateWidth(5);
        Assert.assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void testUpdateHeight() {
        rectangle.updateHeight(10);
        Assert.assertEquals(10, rectangle.getHeight());
    }

}
//    public void testGetOne() {
//        Rectangle rectangle = new Rectangle();
//        Assert.assertNotEquals(1, rectangle.getOne());