import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Бананы", 50, 2);
        Product milk = new Product("Молоко", 45, 1);
        Product bread = new Product("Хлеб");
        bread.setMass(0.5);
        bread.setPrice(20);
        Product bread2 = new Product("Хлеб", 20, 0.5);

        ProductList productList = new ProductList();

        productList.addProduct(banana);
        productList.addProduct(milk);
        productList.addProduct(bread);
        //productList.addProduct(bread2);

        System.out.println(productList.getProductList());

        Set<Integer> nums = new HashSet<>();
        int i = 0;
        while (i < 20) {
            int value = (int) (Math.random() * 1000);
            if (!nums.contains(value)) {
                i++;
            }
            nums.add(value);
        }
        System.out.println(nums);

        int[] arr = new int[20];
        i = 0;

        for (Integer num : nums) {
            if (num % 2 != 0) arr[i] = num;
            i++;
        }
        for (int i1 : arr) {
            nums.remove(i1);
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(nums);


    }
}