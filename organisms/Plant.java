package organisms;

public class Plant {
    // initial energy is 100 points
    public final double INITIAL_ENERGY = 100.0;
    
    private double energy;
    private int x, y; // position
    
    /**
     * Initialises a plant with a starting energy
     * and specified position.
     * 
     * @param x x-coordinate of plant
     * @param y y-coordinate of plant
     */
    public Plant(int x, int y) {
        this.energy = INITIAL_ENERGY;
        this.x = x;
        this.y = y
    }
    
    // absorbs energy from sun to fuel plant
    public void photosynthesis() {
        //TO DO
    }
    
    /**
     * Gets the current energy level of the plant.
     *
     * @return The energy level of the plant.
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * Sets the energy level of the plant.
     *
     * @param energy The new energy level to set.
     */
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    /**
     * Gets the x-coordinate of the plant.
     *
     * @return The x-coordinate of the plant.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the plant.
     *
     * @param x The new x-coordinate to set.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the plant.
     *
     * @return The y-coordinate of the plant.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the plant.
     *
     * @param y The new y-coordinate to set.
     */
    public void setY(int y) {
        this.y = y;
    }
}
