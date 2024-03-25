package ca.mcgill.cs.swdesign.unittesting.flashlight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests cloud features by creating a static stub
 */
public class FlashlightTest2 {


    static class CloudStub implements Config{

        int brightnessConfig;

        CloudStub(int b){ brightnessConfig = b;}

        /**
         * @return the brightness level (0-5) that is set in the cloud config
         */
        @Override
        public int getCloudConfigBrightness() {
            return brightnessConfig;
        }

        /**
         * @return not needed for testing
         */
        @Override
        public int otherComplexMethod() {
            return 0;
        }
    }

    Flashlight f;
    @BeforeEach
    void setup(){this.f = new Flashlight(); }

    @Test
    void testSettingBrightnessFromCloud(){
        CloudStub cloud  = new CloudStub(4);
        f.setConfig(cloud);
        f.setBrightnessFromCloud();
        assertEquals(4, f.getBrightness());

    }

}
