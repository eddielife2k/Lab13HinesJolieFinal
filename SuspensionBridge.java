public class SuspensionBridge<E> extends CarBridge<E>
{
    protected double[] tensions;
    public SuspensionBridge(E len, String[] mat, E h, E wl, int nL, E sL, double[] ten) {
        super(len, mat, h, wl, nL, sL);
        ten = tensions;
    }
    public void tensions(double[] ten){
        ten = tensions;
    }
    public String getTensions() {
        String temp = "";
        for(double d: tensions) {
            temp+= d + ", ";
        }
        return temp;
    }
    public void cantileverLength(E len){}
    public void arcRad(E rad){}
}
