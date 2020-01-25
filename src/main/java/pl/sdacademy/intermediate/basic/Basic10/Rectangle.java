package pl.sdacademy.intermediate.basic.Basic10;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {

        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Nieprawidłowa wartość");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void updateWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void updateHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int calculateArea() {
        return width * height;

    }

    public int calculatePerimeter() {
        return 2 * width + 2 * height;

    }
}


//    int getOne() {
//        return 1;

