public abstract class CarBridge<E> implements Bridge
{
    protected E length;
    protected String[] materials;
    protected E height;
    protected E weightLimit;
    protected int numLanes;
    protected E speedLimit;
    public CarBridge() {
    }
    public void bridgeLength(E len) {
    }
    public E getBridgeLength() {
        return length;
    }
    public void materials(String[] mat) {
    }
     public String getMaterials() {
        String temp = "";
        for(String str: materials) {
            temp += str; 
        }
        return temp;
    }
    public void bridgeHeight(E height) {
    }
     public E getBridgeHeight() {
        return height;
    }
    public void weightLimit(E wl) {
    }
    public E getWeightLimit() {
        return weightLimit;
    }
    public void numLanes(int nL) {
    }
    public int getNumLanes() {
        return numLanes;
    }
    public void speedLimit(E lim) {
    }
    public E getSpeedLimit() {
        return speedLimit;
    }
    public abstract void tensions(double[] ten);
    public abstract void cantelieverLength(E len);
    public abstract void arcRad(E rad);
}
