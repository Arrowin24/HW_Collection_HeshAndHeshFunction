package MultiplicationExercise;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final int MAX=9;
    private static final int MIN=2;

    public static void main(String[] args) {

        Set<NumsForExercise> exercises = new HashSet<>();
        while(exercises.size()<15){
            int num1 = (int) (Math.random() * ((MAX - MIN) + 1) + MIN);
            int num2 = (int) (Math.random() * ((MAX - MIN) + 1) + MIN);
            exercises.add(new NumsForExercise(num1,num2));
        }

        for (NumsForExercise exercise : exercises) {
            System.out.println(exercise);
        }

    }
}
