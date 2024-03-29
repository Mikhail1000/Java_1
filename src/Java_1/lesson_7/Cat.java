package Java_1.lesson_7;

public class Cat {

    private String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(this.appetite);
        if (satiety){
            System.out.println("Кот " + this.name + " поел и сыт.");
        }
        else {
            System.out.println("Кот " + this.name + " остался голоден. Для него в миске недостаточно еды.");
        }
    }
}
