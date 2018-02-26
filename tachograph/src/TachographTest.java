
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by meres on 2/26/18.
 */
public class TachographTest {
    Tachograph tach;
    @Before
    public void before(){
        tach = new Tachograph(10,10,10);
    }
    @Test
    public void Tachotest(){
        Assert.assertEquals(1,tach.getTabelSize());
    }

}
