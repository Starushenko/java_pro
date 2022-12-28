public class Cat extends Animals{
    private static int countCat=0;
    public Cat(String nameAnimal, int maxAge, int weight) {
        super(nameAnimal, maxAge, weight);
        countCat++;
    }

    @Override
    public void animalRun(int distant) {
        if (distant > 200){
            System.out.println(getClass().getName() + " can run only 200 m");
        } else {
            System.out.println(getClass().getName() + " run " + distant + " m");
        }
    }

    @Override
    public void animalSwim(int distant) {
            System.out.println(getClass().getName() + " can't swim at all");
    }

    public static void getCountDCat() {
        System.out.println("Count cats - " +  countCat);
    }

}
