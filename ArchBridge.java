public class ArchBridge<E> extends CarBridge<E>
{
  protected E radius;
  public ArchBridge(E len, String[] mat, E h, E wl, int nL, E sL, E rad){
      super(len,mat,h,wl,nL,sL);
      radius = rad;
    }
  public void arcRad(E rad){
      radius = rad;
    }
  public E getArcRad(){
        return radius;
    }
  public void cantileverLength(E len){}
  public void tensions(double[] ten){}
}
