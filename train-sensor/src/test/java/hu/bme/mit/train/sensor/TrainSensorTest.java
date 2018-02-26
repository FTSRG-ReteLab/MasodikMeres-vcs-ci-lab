package hu.bme.mit.train.sensor;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    private TrainSensorImpl ts;
    private TrainControllerImpl tc;
    @Before
    public void before() {
         tc= new TrainControllerImpl();
        ts= new TrainSensorImpl(tc,new TrainUserImpl(tc));
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(15, ts.getSpeedLimit());
    }

    @Test
    public void ModifySpeedlimit(){
        ts.overrideSpeedLimit(10);
        Assert.assertEquals(10, ts.getSpeedLimit());
    }
    @Test
    public void ModifySpeedlimitTo3(){
        ts.overrideSpeedLimit(3);
        Assert.assertEquals(5, ts.getSpeedLimit());
    }

}
