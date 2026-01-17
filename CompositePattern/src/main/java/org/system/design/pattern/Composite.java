package org.system.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    String name;
    List<Component> components=new ArrayList<>();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component component){
        components.add(component);
    }
    @Override
    public void showPrices() {
        System.out.println(name);
        for(Component component:components){
            component.showPrices();
        }

    }
}
