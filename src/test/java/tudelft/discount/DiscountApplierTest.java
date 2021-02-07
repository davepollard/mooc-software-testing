package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    void applyDiscount(){
        Product p1 = new Product("p1", 10, "HOME");
        Product p2 = new Product("p2", 100, "BUSINESS");
        List<Product> results = Arrays.asList(p1, p2);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier da = new DiscountApplier(dao);
        da.setNewPrices();

        Assertions.assertEquals(9, p1.getPrice());
        Assertions.assertEquals(110, p2.getPrice());
    }
}
