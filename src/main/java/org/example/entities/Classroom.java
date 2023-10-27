package org.example.entities;

public class Classroom {
    private String className;
    private String classSize;

    public Classroom(String className, String classSize) {
        this.className = className;
        this.classSize = classSize;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassSize() {
        return classSize;
    }

    public void setClassSize(String classSize) {
        this.classSize = classSize;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "className='" + className + '\'' +
                ", classSize='" + classSize + '\'' +
                '}';
    }
}


