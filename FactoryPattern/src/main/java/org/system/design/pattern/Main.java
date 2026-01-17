package org.system.design.pattern;

import org.system.design.pattern.phone.OS;
import org.system.design.pattern.phone.OperationSystemFactory;

public class Main {
    public static void main(String[] args) {
        OperationSystemFactory operationSystemFactory=new OperationSystemFactory();
        OS os=operationSystemFactory.getInstance("open");
        os.spec();

    }
}
