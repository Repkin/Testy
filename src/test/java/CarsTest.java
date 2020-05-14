import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException(){

        //given

        Integer treadThickness = 21;
        Integer fuelUsage = 4;
        Integer carMillage = null;
        Cars car = new Cars();

        //when

        //then

        Assertions.assertThrows(IllegalArgumentException.class,() -> car.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_allValuesOK_resultTrue(){

        //given

        Integer treadThickness = 3;
        Integer fuelUsage = 4;
        Integer carMillage = 3000;
        Cars car = new Cars();

        //when

        boolean result = car.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then

        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_fuelUsageNotOK_resultFalse(){

        //given

        Integer treadThickness = 3;
        Integer fuelUsage = 15;
        Integer carMillage = 4000;
        Cars car = new Cars();

        //when

        boolean result = car.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then

        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_carMillageNotOK_resultFalse(){

        //given

        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 400000;
        Cars car = new Cars();

        //when

        boolean result = car.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then

        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_treadThicknessNotOK_resultFalse(){

        //given

        Integer treadThickness = 1;
        Integer fuelUsage = 5;
        Integer carMillage = 4000;
        Cars car = new Cars();

        //when

        boolean result = car.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then

        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_valuesEqualToMinOrMax_resultFalse(){

        //given

        Integer treadThickness = 2;
        Integer fuelUsage = 0;
        Integer carMillage = 0;
        Cars car = new Cars();

        //when

        boolean result = car.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then

        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_fuelUsageLessThanZero_throwsIllegalArgumentException(){

        //given

        Integer treadThickness = 4;
        Integer fuelUsage = -2;
        Integer carMillage = 4000;
        Cars car = new Cars();

        //when

        //then

        Assertions.assertThrows(IllegalArgumentException.class, () -> car.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
}
