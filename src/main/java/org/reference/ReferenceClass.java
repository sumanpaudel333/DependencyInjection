package org.reference;

public class ReferenceClass {
    private ReferedClass referedClass;
    private String referedName;

    public ReferenceClass() {
        super();
    }

    @Override
    public String toString() {
        return "ReferenceClass{" +
                "referedClass=" + referedClass +
                ", referedName='" + referedName + '\'' +
                '}';
    }

    public ReferedClass getReferedClass() {
        return referedClass;
    }

    public void setReferedClass(ReferedClass referedClass) {
        this.referedClass = referedClass;
    }

    public String getReferedName() {
        return referedName;
    }

    public void setReferedName(String referedName) {
        this.referedName = referedName;
    }
}
