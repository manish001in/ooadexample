import java.util.*;

/**
 * Created by manish.rastogi on 30/12/15.
 */
public class Group {
    private Map units;

    public Group(List unitList){
        units=new HashMap();
        for(Iterator i= unitList.iterator(); i.hasNext();){
            Unit unit =(Unit)i.next();
            units.put(unit.getId(),unit);
        }
    }
    public Group(){
        this(new LinkedList<>());
    }
    public void addUnit(Unit unit){
        units.put(unit.getId(),unit);
    }
    public void removeUnit(Unit unit){
        units.remove(unit.getId());
    }
    public void removeUnit(int id){
        units.remove(id);
    }
    public Unit getUnit(int id){
        return (Unit)units.get(id);
    }
    public List getAllUnits(){
        List unitList = new LinkedList();
        for(Iterator i= units.entrySet().iterator(); i.hasNext();){

            Unit unit =(Unit)i.next();
            unitList.add(unit);
        }
        return unitList;
    }

}
