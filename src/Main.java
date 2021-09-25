public class Main {
    public static void main(String[] args) {

        int counter = 0;

        Animal[] arraysOfAnimal = new Animal[2];
        arraysOfAnimal[0] = new Dog(" Бобик ");
        arraysOfAnimal[1] = new Cat(" Шарик ");

        for (Animal animal : arraysOfAnimal) {
            animal.run(160);
            animal.swim(12);
            animal.run(40);
        }

        System.out.println();
        
        for (int i = 0; i < arraysOfAnimal.length; i++) {
            counter++;
        }
        System.out.println("Колличество животных: " + counter);
    }
}
