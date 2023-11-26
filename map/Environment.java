package map;

public abstract class Environment {
    private double[][] sunlightIntensityMap;
    private double[][] temperatureMap;
    private double time;
    private double humidity;
    private double precipitation;
    private double windSpeed;
    private int width;
    private int height;
    
    /**
     * Constructs an Environment with the specified parameters.
     *
     * @param width          The width of the environment.
     * @param height         The height of the environment.
     * @param terrainType    The type of terrain in the environment.
     * @param initialTime    The initial time of day in hours (0 to 24).
     * @param initialHumidity The initial humidity level.
     * @param initialPrecipitation The initial precipitation level.
     * @param initialWindSpeed The initial wind speed.
     */
    public Environment(
            int width,
            int height,
            double initialTime,
            double initialHumidity,
            double initialPrecipitation,
            double initialWindSpeed
    ) {
        this.width = width;
        this.height = height;
        this.sunlightIntensityMap = new double[width][height];
        this.temperatureMap = new double[width][height];
        this.time = Math.max(0, Math.min(24, initialTime));
        this.humidity = initialHumidity;
        this.precipitation = initialPrecipitation;
        this.windSpeed = initialWindSpeed;
    }
    
    /**
     * Checks if a time is valid, i.e. between 0 and 24.
     *
     * @param double time The time to check.
     * @return {@code true} if valid, {@code false} if not.
     * @ensures {@code time < 24 && time >= 0}
     */
    private boolean isValidTime(double time) {
        if (time < 24 && time >= 0) {
            return true;
        } else {return false;}
    }
    
    /**
     * Gets the width of the environment.
     *
     * @return The width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the environment.
     *
     * @param width The new width to set.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Gets the height of the environment.
     *
     * @return The height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the environment.
     *
     * @param height The new height to set.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the initial time of day in the environment.
     *
     * @return The initial time of day.
     */
    public double getInitialTimeOfDay() {
        return time;
    }

    /**
     * Sets the initial time of day for the environment.
     *
     * @param initialTimeOfDay The new initial time of day to set.
     */
    public void setInitialTimeOfDay(double initialTimeOfDay) {
        // Ensure that time is within the range of 0 to 24 hours
        this.time = Math.max(0, Math.min(24, initialTimeOfDay));
    }

    /**
     * Gets the initial humidity level in the environment.
     *
     * @return The initial humidity level.
     */
    public double getInitialHumidity() {
        return humidity;
    }

    /**
     * Sets the initial humidity level for the environment.
     *
     * @param initialHumidity The new initial humidity level to set.
     */
    public void setInitialHumidity(double initialHumidity) {
        this.humidity = initialHumidity;
    }

    /**
     * Gets the initial precipitation level in the environment.
     *
     * @return The initial precipitation level.
     */
    public double getInitialPrecipitation() {
        return precipitation;
    }

    /**
     * Sets the initial precipitation level for the environment.
     *
     * @param initialPrecipitation The new initial precipitation level to set.
     */
    public void setInitialPrecipitation(double initialPrecipitation) {
        this.precipitation = initialPrecipitation;
    }

    /**
     * Gets the initial wind speed in the environment.
     *
     * @return The initial wind speed.
     */
    public double getInitialWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the initial wind speed for the environment.
     *
     * @param initialWindSpeed The new initial wind speed to set.
     */
    public void setInitialWindSpeed(double initialWindSpeed) {
        this.windSpeed = initialWindSpeed;
    }    
}
