

public abstract class CarBridge<E> implements Bridge<E>
{
    protected E length;
    protected String[] materials = new String[2];
    protected E height;
    protected E weightLimit;
    protected int numLanes;
    protected E speedLimit;
    public CarBridge(E len, String[] mat, E h, E wl, int nL, E sL) {
        length = len;
        materials = mat;
        height = h;
        weightLimit = wl;
        numLanes = nL;
        speedLimit = sL;
    }
    public void bridgeLength(E len) {
        len = length;
    }
    public E getBridgeLength() {
        return length;
    }
    public void materials(String[] mat) {
        mat = materials;
    }
     public String getMaterials() {
        String temp = "";
        for(String str: materials) {
            temp += str + ", "; 
        }
        return temp;
    }
    public void bridgeHeight(E h) {
        h = height;
    }
     public E getBridgeHeight() {
        return height;
    }
    public void weightLimit(E wl) {
        weightLimit = wl;
    }
    public E getWeightLimit() {
        return weightLimit;
    }
    public void numLanes(int nL) {
        numLanes = nL;
    }
    public int getNumLanes() {
        return numLanes;
    }
    public void speedLimit(E lim) {
        lim = speedLimit;
    }
    public E getSpeedLimit() {
        return speedLimit;
    }
    public abstract void tensions(double[] ten);
    public abstract void cantileverLength(E len);
    public abstract void arcRad(E rad);
}
