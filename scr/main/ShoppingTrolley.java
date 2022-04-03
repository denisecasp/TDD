import java.util.HashMap;

public class ShoppingTrolley {

    public HashMap<String, Integer> createShoppingTrolley() {
        HashMap<String, Integer> shoppingTrolley = new HashMap<String, Integer>();
        shoppingTrolley.put("Strawberry", 2);
        shoppingTrolley.put("Blueberry", 4);
        shoppingTrolley.put("Raspberry", 6);
        shoppingTrolley.put("Cherry", 8);

        return shoppingTrolley;
    }

    public boolean isStrawberryInShoppingTrolley (String givenFruitName){
        HashMap<String, Integer> shoppingTrolley = createShoppingTrolley();
        for (String actualFruitName : shoppingTrolley.keySet()) {
            if(actualFruitName.equals("Strawberry") && actualFruitName.equals(givenFruitName)) {
                return true;
            }
        }
        return false;
    }

    public int sumTotal() {
        HashMap<String, Integer> shoppingTrolley = createShoppingTrolley();
        int total = 0;
        for (int eachValueInHashMap : shoppingTrolley.values()){
            total += eachValueInHashMap;
        }
        System.out.println(total);
        return total;
    }
    public int NumberOfFruitsInShoppingTrolley() {
        HashMap<String, Integer> shoppingTrolley = createShoppingTrolley();
        int numberOfFruits = 0;
        for(String eachKeyInHashMap : shoppingTrolley.keySet()) {
            numberOfFruits++;
        }
        return numberOfFruits;
    }



}