package org.system.design.pattern;

/**
 * Adapter class which is using the default Pilot pen class so we can use its methods
 *
 */

public class PenAdapter implements Pen{

    PilotPen pp=new PilotPen();
    @Override
    public void write(String text) {
        pp.mark(text);
    }
}
