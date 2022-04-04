import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        // Prints -- There are 100 squares and 100 cubes , Union contains 196 elements.  --  Union being
        //  only non-duplicate numbers
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        //  This block prints the intersections -- 4096 is a square of 64.0 and the cube of 16.0 --
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is a square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        // Will print out all words, split, in no particular order, with no repeat words (the)
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine:");
        Set<String> diffOne = new HashSet<>(nature);
        diffOne.removeAll(divine);
        printSet(diffOne);

        System.out.println("divine - nature:");
        Set<String> diffTwo = new HashSet<>(divine);
        diffTwo.removeAll(nature);
        printSet(diffTwo);

        //  Symetric difference - only prince original words
        // -- all but art thee err nature forgive divine human unknown --
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)) {
            System.out.println("Divine is a subset of nature");
        }
        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a sebset of nature");
        }
        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }
    }

        private static void printSet(Set<String> set) {
            System.out.println("\t");
            for(String s : set) {
                System.out.print(s + " ");
            }
            System.out.println();

    }
}
