public abstract class Animals {
    private String nameAnimal;
    private int maxAge;
    private int weight;

    private static int countAnimals = 0;

    public Animals(String nameAnimal, int maxAge, int weight) {
        this.nameAnimal = nameAnimal;
        this.maxAge = maxAge;
        this.weight = weight;
        this.countAnimals++;
    }

    public abstract void animalRun(int distant);
    public abstract void animalSwim(int distant);

    public static void getCountAnimals() {
        System.out.println("Count animals - " +  countAnimals);
    }
}
