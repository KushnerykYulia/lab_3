/**
 * Клас BorderDecorator є декоратором, який додає рамку до графічного елемента.
 */
public class BorderDecorator extends GraphicDecorator {
    private int thickness;

    /**
     * Конструктор, що створює декоратор для додавання рамки з певною товщиною.
     *
     * @param decoratedGraphic графічний елемент, до якого додається рамка
     * @param thickness товщина рамки
     */
    public BorderDecorator(Graphic decoratedGraphic, int thickness) {
        super(decoratedGraphic);
        this.thickness = thickness;
    }

    /**
     * Відображає графічний елемент з рамкою.
     */
    @Override
    public void display() {
        addBorder();
        super.display();
    }

    /**
     * Додає рамку до графічного елемента.
     */
    private void addBorder() {
        System.out.println("Додано рамку товщиною " + thickness + " пікселі.");
    }

    /**
     * Повертає опис графічного елемента з рамкою у вигляді рядка.
     * @return опис графічного елемента з рамкою
     */
    @Override
    public String getDescription() {
        return decoratedGraphic.getDescription() + " з рамкою товщиною " + thickness + " пікселі";
    }
}
