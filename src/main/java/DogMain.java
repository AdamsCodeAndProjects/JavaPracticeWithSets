public class DogMain {
    public static void main(String[] args) {
        BostonTerrier grover = new BostonTerrier("Grover");
        Dog unknownDog = new Dog("Grover");

        System.out.println(unknownDog.equals(grover));
        System.out.println(grover.equals(unknownDog));
    }
}
