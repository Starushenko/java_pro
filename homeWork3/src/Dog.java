public class Dog extends Animals{

     private static int countDog=0;
    public Dog(String nameAnimal, int maxAge, int weight) {
        super(nameAnimal, maxAge, weight);
        countDog++;
    }

    @Override
    public void animalRun(int distant) {
        if (distant > 500){
            System.out.println(getClass().getName() + " can run only 500 m");
        } else {
            System.out.println(getClass().getName() + " run " + distant + " m");
        }
    }

    @Override
    public void animalSwim(int distant) {
        if (distant > 500){
            System.out.println(getClass().getName() + " can swim only 10 m");
        } else {
            System.out.println(getClass().getName() + " swim " + distant + " m");
        }
    }

    public static void getCountDog() {
        System.out.println("Count dogs - " +  countDog);
    }
}
