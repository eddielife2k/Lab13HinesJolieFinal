public interface Bridge<E>
{
   public void bridgeLength(E len);
   public E getBridgeLength();
   public void bridgeHeight(E height);
   public E getBridgeHeight();
   public void weightLimit(E wl);
   public E getWeightLimit();
   public void materials(String[] mat);
   public String getMaterials();
}
