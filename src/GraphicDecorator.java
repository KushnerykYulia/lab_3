/**
 * Абстрактний клас GraphicDecorator є базовим класом для декораторів
 * графічних елементів. Цей клас реалізує інтерфейс Graphic.
 */
public abstract class GraphicDecorator implements Graphic {
    protected Graphic decoratedGraphic;


    /**
     * Конструктор, що приймає графічний елемент для декорування.
     *
     * @param decoratedGraphic графічний елемент, який буде декоровано
     */
    public GraphicDecorator(Graphic decoratedGraphic) {
        this.decoratedGraphic = decoratedGraphic;
    }

    /**
     * Викликає метод display() декорованого графічного елемента.
     */
    @Override
    public void display() {
        decoratedGraphic.display();
    }

    /**
     * Повертає опис декорованого графічного елемента у вигляді рядка.
     * @return опис декорованого графічного елемента
     */
    @Override
    public String getDescription() {
        return decoratedGraphic.getDescription();
    }
}
