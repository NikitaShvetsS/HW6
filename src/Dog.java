public class Dog extends Animal{


    public void run(int distance) {
        if (distance <= Constants.DOG_MAX_RUN_DISTANCE) {
            System.out.println("Dog ran " + distance + " m");
        } else {
            System.out.println(Constants.IMPOSIBLE_VALUE);
        }
    }

    public void swim(int distance) {
        if (distance <= Constants.DOG_MAX_SWIM_DISTANCE) {
            System.out.println("Dog swam " + distance + " m");
        } else {
            System.out.println(Constants.IMPOSIBLE_VALUE);
        }
    }
}
