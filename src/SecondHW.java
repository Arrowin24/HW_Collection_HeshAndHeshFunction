import java.util.HashSet;
import java.util.Set;

public class SecondHW {
    public static void main(String[] args) {
        //Проверка второго домашнего задания ч.2
        Set<Integer> nums = new HashSet<>();
        int i = 0;
        while (i < 20) {
            int value = (int) (Math.random() * 1000);
            if (!nums.contains(value)) {
                i++;
            }
            nums.add(value);
        }
        System.out.println("До удаления "+nums);
        nums.removeIf(num -> num % 2 == 1);
        System.out.println("После удаления "+nums);
    }
}
