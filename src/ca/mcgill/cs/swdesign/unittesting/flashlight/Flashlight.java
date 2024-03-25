package ca.mcgill.cs.swdesign.unittesting.flashlight;

import java.util.Optional;

/**
 * Flashlight class with int field brightness,
 * optional cloud configuration that is set to empty
 * Includes getter and setter methods that ensures that brightness is within (0,5) range
 * And cloudconfig is not null
 */
public class Flashlight {
    private int brightness = 0;
    private Optional<Config> aCloudConfig;

    /**
     * Getter method for brightness
     * @return brightness of the current flashlight object
     */
    public int getBrightness(){return brightness; }

    /**
     * Setter method for brightness
     * @param pBrightness an int that represents the new brightness that we want to set to
     *                   needs to be within range of 0 to 5, inclusive
     * @throws IllegalArgumentException if the input is not within range
     */
    public void setBrightness(int pBrightness) {
        if (pBrightness > 5 || pBrightness < 0 ){
            throw new IllegalArgumentException("brightness needs to be between 0 and 5");
        }
        this.brightness = pBrightness;

    }

    /**
     * Sets the cloud configuration of flashlight object
     * @param pCloudConfig the Config object that we want to set the flashlight to
     * @pre cloudConfig != null
     */
    public void setConfig(Config pCloudConfig){
        assert pCloudConfig != null;
        aCloudConfig = Optional.of(pCloudConfig);
    }

    private void incrementBrightness() {
        this.brightness = (this.brightness + 1) % 6;
    }

    /**
     * sets flashlight brightness according to the cloud config setting
     */
    public void setBrightnessFromCloud(){
        if (aCloudConfig.isPresent()){
            int b = aCloudConfig.get().getCloudConfigBrightness();
            setBrightness(b);
        }
    }


}
