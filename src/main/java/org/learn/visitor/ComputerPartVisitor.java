package org.learn.visitor;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keybord);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
}
