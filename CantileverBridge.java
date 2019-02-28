public class CantileverBridge<E> extends CarBridge<E>
{
    protected E cantileverLength;
  public CantileverBridge(E len, String[] mat, E h, E wl, int nL, E sL,E cL){
      super(len,mat,h,wl,nL,sL);
      cantileverLength = cL;
    }
  public void cantileverLength(E len){
      cantileverLength = len;
    }
    public E getCantileverLength(){
        return cantileverLength;
    }
  public void tensions(double[]ten){}
  public void arcRad(E rad){}
}
