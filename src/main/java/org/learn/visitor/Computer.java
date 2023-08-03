package org.learn.visitor;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
