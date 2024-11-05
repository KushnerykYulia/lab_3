/**
 * Клас ShadowDecorator є декоратором, який додає тінь до графічного елемента.
 */
public class ShadowDecorator extends GraphicDecorator {
    private int thickness;

    /**
     * Конструктор, що створює декоратор для додавання тіні з певною товщиною.
     *
     * @param decoratedGraphic графічний елемент, до якого додається тінь
     * @param thickness товщина тіні
     */
    public ShadowDecorator(Graphic decoratedGraphic, int thickness) {
        super(decoratedGraphic);
        this.thickness = thickness;
    }

    /**
     * Відображає графічний елемент з тінню.
     */
    @Override
    public void display() {
        addShadow();
        super.display();
    }

    /**
     * Додає тінь до графічного елемента.
     */
    private void addShadow() {
        System.out.println("Додано тінь товщиною " + thickness + " пікселі.");
    }

    /**
     * Повертає опис графічного елемента з тінню у вигляді рядка.
     * @return опис графічного елемента з тінню
     */
    @Override
    public String getDescription() {
        return decoratedGraphic.getDescription() + " і тінню товщиною " + thickness + " пікселі";
    }
}
