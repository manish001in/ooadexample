/**
 * Created by manish.rastogi on 29/12/15.
 */

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private List units;
    
    public Tile() {
        units= new LinkedList();
    }
    
    protected void addUnit(Unit unit){
        units.add(unit);
    }
    protected void removeUnit(Unit unit){
        units.remove(unit);
    }
    protected void removeUnits(){
        units.clear();
    }

    public List getUnits() {
        return units;
    }
}
