package hu.bme.mit.train.sensor;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by meres on 3/12/18.
 */
public class TrainSensorImplTest {

    private TrainSensorImpl trainSensor;
    private TrainControllerImpl trainController;
    private TrainUserImpl trainUser;

    @Before
    public void before() {
        trainController= mock(TrainControllerImpl.class);
        trainUser = mock(TrainUserImpl.class);
        trainSensor= new TrainSensorImpl(trainController,trainUser);
    }

    @Test
    public void AbsuluteMarginTopTest() {
        when(trainController.getReferenceSpeed()).thenReturn(500);
        trainSensor.overrideSpeedLimit(600);
        verify(trainUser,times(1)).setAlarmState(true);
    }
    @Test
    public void AbsuluteMarginBottomTest() {
        when(trainController.getReferenceSpeed()).thenReturn(5);
        trainSensor.overrideSpeedLimit(-10);
        verify(trainUser,times(1)).setAlarmState(true);
    }

    @Test
    public void RelativeMarginAlarmTest() {
        when(trainController.getReferenceSpeed()).thenReturn(150);
        trainSensor.overrideSpeedLimit(50);
        verify(trainUser,times(1)).setAlarmState(true);
    }

    @Test
    public void RelativeMarginNoAlarmTest() {
        when(trainController.getReferenceSpeed()).thenReturn(50);
        trainSensor.overrideSpeedLimit(50);
        verify(trainUser,times(1)).setAlarmState(false);
    }



}
