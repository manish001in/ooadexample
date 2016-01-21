import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by manish.rastogi on 29/12/15.
 */
public class Unit {

    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id)
    {
        this.id=id;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(Weapon weapon){
        if(weapons==null)
        {
            weapons=new LinkedList();
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String property, Object value){
        if(properties==null)
        {
            properties=new HashMap();
        }
        properties.put(property, value);
    }
    public Object getProperty(String property) throws RuntimeException{
        if(properties==null)
        {
            throw new RuntimeException("No properties available!!");
        }
        Object value= properties.get(property);
        if(value==null)
        {
            throw new RuntimeException("No property value!!");
        }else{
            return value;
        }
    }
}
