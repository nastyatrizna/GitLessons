package by.homework.lessons.task9;

public class Lion extends Animal {
    private String maneColor;

    public Lion(String color, int maxLifespan, String foodType, String maneColor) {
        super(color, maxLifespan, foodType);
        this.maneColor = maneColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Лев рычит: Рррр!");
    }

    @Override
    public void play() {
        System.out.println("Лев играет с мячом");
    }

    public String getManeColor() {
        return maneColor;
    }

    @Override
    public String toString() {
        return "Лев: " + getId() +
                ", основной цвет: '" + maneColor + '\'' +
                ", цвет: '" + getColor() + '\'' +
                ", максимальная продолжительность жизни: " + getMaxLifeLong() +
                ", тип еды: " + getFoodType();
    }
}
