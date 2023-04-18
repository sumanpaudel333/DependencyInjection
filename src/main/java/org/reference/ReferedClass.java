package org.reference;

public class ReferedClass {
    private int variable;

    public ReferedClass() {
        super();
    }

    @Override
    public String toString() {
        return "ReferedClass{" +
                "variable=" + variable +
                '}';
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}
