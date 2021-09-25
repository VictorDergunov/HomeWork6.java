public class Cat extends Animal {
    public Cat(String name) {
        super("кот" + name);
        runLimit = 150;
        swimLimit = 0;
    }

        public void swim() {  // не понимаю почему не находит метод!
            System.out.println("Коты не умеют плавать!");
        }
    }
