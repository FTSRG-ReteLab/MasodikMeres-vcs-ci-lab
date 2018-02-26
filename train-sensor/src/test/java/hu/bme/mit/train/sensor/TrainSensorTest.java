package hu.bme.mit.train.sensor;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    private TrainSensor ts;
    private TrainController tc;
    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        tc = system.getController();
        ts= system.getSensor();
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
