import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingTrolleyTest {
    ShoppingTrolley shoppingTrolley;

    @BeforeEach
    void setUp() {
        shoppingTrolley = new ShoppingTrolley();
    }

    //Test 1 - Is there Strawberries in the trolley?
    @Test
    @DisplayName("Running a test")
    void isStrawberryInShoppingTrolleyTest () {
        assertTrue(shoppingTrolley.isStrawberryInShoppingTrolley("Strawberry"));
    }

    //Test 2 - Quantity of fruits in the trolley
    @Test
    void numberOfFruitsInShoppingCartTest() {
        assertEquals(4,shoppingCart.NumberOfFruitsInShoppingCart());
    }


    //Test 3 - The total cost
    @Test
    void totalCostTest() {
        assertEquals(20,shoppingTrolley.sumTotal(), 0.5);
    }


}