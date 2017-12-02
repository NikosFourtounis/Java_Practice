package java_practice;
/**
 *
 * @author NFourtounis
 */
public class Room implements Rented{
    private String ID;
    private int capacity;
    private boolean view;
    private String type;

    @Override
    public boolean isAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculateCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
