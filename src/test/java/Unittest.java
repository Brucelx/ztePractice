import com.implement.CountPrice;
import org.junit.Test;

/**
 * Created by Lenovo on 2018/1/16.
 */
public class Unittest {
    @Test
    public void testPrice(){
        CountPrice countPrice = new CountPrice();
        String name = "西游记";
        float price = 98.0f;
        float discount = (float)0.8;

        countPrice.countPrice(name, price, discount);

    }
}
