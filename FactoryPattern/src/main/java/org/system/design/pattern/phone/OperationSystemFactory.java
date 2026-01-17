package org.system.design.pattern.phone;

public class OperationSystemFactory {

    String type;

    public OS getInstance(String type){

        if(type.equals("open")){
            return new Android();
        }
        else if(type.equals("closed"))
            return new IOS();
        else return new Windows();
    }
}
