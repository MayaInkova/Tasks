package exam01;

public class Rectangle {
    private int width;
    private int height;

    // Конструктор
    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    // Getter за ширината
    public int getWidth() {
        return width;
    }

    // Setter за ширината
    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Getter за височината
    public int getHeight() {
        return height;
    }

    // Setter за височината
    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Метод за изчисляване на площта
    public int area() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Width: " + rect.getWidth() + ", Height: " + rect.getHeight() + ", Area: " + rect.area());

        rect.setWidth(-3);  // Опит за задаване на отрицателна ширина
        System.out.println("Width: " + rect.getWidth() + ", Height: " + rect.getHeight() + ", Area: " + rect.area());
    }

}
