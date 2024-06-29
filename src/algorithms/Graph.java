package algorithms;

import java.util.LinkedList;
import java.util.List;

//Основните операции в граф са:
// Създаване на граф
// Добавяне / премахване на връх / ребро
// Проверка дали даден връх / ребро съществува
// Намиране на наследниците на даден връх
//примерна реализация на представяне на граф с матрица на съседство и  как се извършват повечето операции.
// Този вид реализация е удобен, когато максималният брой на върховете е предварително известен и когато той не е много голям
// (за да се реализира представянето на граф с N върха е необходима памет от порядъка на N2 заради квадратната матрица).
// Поради това, няма да реализираме методи за добавяне / премахване на нов връх.


// Представлява насочен невзетен граф.

//"невзетен" (или невзвешен) се отнася до граф, в който ребрата не носят тегла (стойности).
// Това означава,че наличието на ребро между два върха показва само,
// че съществува връзка между тях, без да дава информация за "силата" или "разстоянието" на тази връзка.
public class Graph {
    // Съдържа върховете на графа
    private int vertices[][];

// Конструира графа.
    public Graph(int[][] vertices) {
        this.vertices = vertices;
    }


    // Добавя ново ребро от i до j.
      //i - началният връх.
      //j - крайният връх.

    public void addEdge(int i, int j) {
        vertices[i][j] = 1;
    }


    //Премахва реброто от i до j, ако съществува такова.

    public void removeEdge(int i, int j) {
        vertices[i][j] = 0;
    }

    //Проверява дали съществува ребро между върховете i и j.

    public boolean hasEdge(int i, int j) {
        return vertices[i][j] == 1;
    }

    //Връща наследниците на даден връх.

    public List<Integer> getSuccessors(int i) {
        List<Integer> successors = new LinkedList<Integer>();

        for (int j = 0; j < vertices[i].length; j++) { // Корекция на цикъла от 'i' на 'j'
            if (vertices[i][j] == 1) {
                successors.add(j);
            }
        }

        return successors;
    }
}
