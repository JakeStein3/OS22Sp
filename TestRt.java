package Oswego;
import org.junit.Assert;
import org.junit.Test;
import shapes.SRectangle;

public class TestRt {

    @Test
    public void recTest(){
       int height = 50;
        SRectangle key = new SRectangle((double) height /2, height);
        ShippingContainer.rec(key);
        Assert.assertEquals(key, 100);

    }

}
