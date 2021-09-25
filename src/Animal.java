public class Animal {
    public String name;

    public int swimLimit = 0;
    public int runLimit = 0;

    public Animal(String name) {
        this.name = name;
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " смог проплыть " + distance);
        } else {
            System.out.println(name + "не смог проплыть " + distance);
        }
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " смог пробежать " + distance);
        } else {
            System.out.println(name + "не смог пробежать " + distance);
        }
    }

}
