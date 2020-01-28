package com.company;

import java.util.ArrayList;
import java.util.List;

//폴더, add ,remove, getChild 기능이 있어야 한다.
public class Folder extends Component{
    List<Component> children = new ArrayList<Component>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component component){
        //add가 되면 true가 된다.
        return children.add(component);
    }

    public boolean removeComponent(Component component){
        return children.remove(component);
    }
    public List<Component> getChild(){
        return children;
    }
}
