package algorithms;


import javax.swing.*;
import java.awt.*;

// приложение, което рисува правоъгълник с черен контур и елипса със син контур вътре в правоъгълника.

public class SimpleGraphics extends JFrame {

    public SimpleGraphics() {
        setTitle("Rectangle and Ellipse Drawing");
        setSize(400, 300);  // Задаване на размери на прозореца
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Създаване на панела за рисуване
        DrawingPanel panel = new DrawingPanel();
        add(panel);

        setVisible(true);
        //bsfn
    }

    public static void main(String[] args) {
        // Стартиране на приложението
        SwingUtilities.invokeLater(SimpleGraphics::new);
    }
}

// Клас за рисуване
class DrawingPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Взимане на размерите на панела
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Рисуване на черен правоъгълник, който запълва целия панел
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, panelWidth - 20, panelHeight - 20);

        // Рисуване на синя елипса, центрирана в правоъгълника
        g.setColor(Color.BLUE);
        g.drawOval(10, 10, panelWidth - 20, panelHeight - 20);
    }
}

//SimpleGraphics клас: Този клас наследява JFrame и представлява основния прозорец на приложението.
//В конструктора създаваме панел за рисуване и го добавяме към рамката.
// Извикваме setVisible(true) за да покажем прозореца.
//DrawingPanel клас: Този клас наследява JPanel и е мястото, където ще рисуваме нашите графики.
//paintComponent(Graphics g) методът е презаписан, за да рисуваме правоъгълник и елипса.
// Използваме drawRect() за правоъгълника и drawOval() за елипсата.
//  g.setColor(Color.BLACK); задава цвета за правоъгълника, а g.setColor(Color.BLUE); задава цвета за елипсата.
//SwingUtilities.invokeLater: Методът се използва, за да се уверим, че графичният интерфейс се стартира в основния нишка за събития на Swing.