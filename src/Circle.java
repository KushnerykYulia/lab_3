/**
 * Клас Circle представляє графічний елемент - коло, з параметрами координат, радіуса та кольору.
 */
public class Circle implements Graphic {
    private int x;
    private int y;
    private int radius;
    private String color;

    /**
     * Конструктор, що створює коло з заданими параметрами.
     *
     * @param x координата X центру кола
     * @param y координата Y центру кола
     * @param radius радіус кола
     * @param color колір кола
     */
    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Відображає коло з вказаними параметрами.
     */
    @Override
    public void display() {
        System.out.println("Коло радіусом " +  radius + " санитиметрів з центром у точці " + "(" + x + ", " + y + ")");
    }

    /**
     * Повертає опис кола у вигляді рядка.
     * @return опис кола у вигляді рядка
     */
    @Override
    public String getDescription() {
        return "Коло " + color + " кольору";
    }
}
