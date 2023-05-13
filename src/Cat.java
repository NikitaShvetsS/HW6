public class Cat extends Animal{
    public void run(int distance) {
        if (distance <= Constants.CAT_MAX_RUN_DISTANCE) {
            System.out.println("Cat ran " + distance + " m");
        } else {
            System.out.println(Constants.IMPOSIBLE_VALUE);
        }
    }

    public void swim(int distance){
        System.out.println(Constants.IMPOSIBLE_SKILL);
    }

}
