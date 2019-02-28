public class Runner
{
    public static void main(String args[]) {
       String[] m1 = {"Steel", "Cable"};
       String[] m2 = {"Brick", "Concrete"};
       double[] ten = {50.1, 22.35};
        String arcRad = "180 feet";
       SuspensionBridge<String> b1 = new SuspensionBridge<String>("Very Long", m1, "Very Tall", 
       "No one heavier than a pickup truck.", 2, "Highway Speed", ten);
       b1.numLanes(3);
       System.out.println("The bridge is " + b1.getBridgeLength() + " and "  + b1.getBridgeHeight() + ". \n " +
       b1.getWeightLimit() + " The bridge has " + b1.getNumLanes() + " lanes. Please go at " + 
       b1.getSpeedLimit() + ". \nThe tensions on the bridge are " + b1.getTensions());
       
        System.out.println();
        
       CantileverBridge<String>b2 = new CantileverBridge<String>("200",m1,"100","weight limit: 100,000 lbs",
       4, "60 mph", cantileverLength);
       System.out.println("The bridge is " + b2.getBridgeLength() + "ft long and " + b2.getBridgeHeight() + "ft tall . \n" 
    + b2.getWeightLimit() + "\n Num Lanes: " + b2.getNumLanes() + "\n materials: " + b2.getMaterials() + "\n speedlimit: "
    + b2.getSpeedLimit() + "\n Cantilever Length: " + b2.getCantileverLength());
    
       System.out.println();
       
        ArchBridge<String> b3 = new ArchBridge<String>("100",m2,"50","weight limit: 30,000 lbs",
        1, "15 mph", arcRad);
        System.out.println("The bridge is " + b3.getBridgeLength() + "ft long and " + b3.getBridgeHeight() + "ft tall . \n" 
        + b3.getWeightLimit() + "\n Num Lanes: " + b3.getNumLanes() + "\n materials: " + b3.getMaterials() + "\n speedlimit: "
        + b3.getSpeedLimit() + "\n Arc radius: " + b3.getArcRad());
    }
    
}
