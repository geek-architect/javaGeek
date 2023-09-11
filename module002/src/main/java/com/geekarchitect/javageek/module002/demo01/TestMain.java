package com.geekarchitect.javageek.module002.demo01;
 class Employee implements Cloneable {
    private String name;
    private int age;
    private Department dept;

    public Employee(String name, int age, Department dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    // 实现Cloneable接口，重写clone()方法
    // 注意：clone()方法返回的是Object类型，需要进行强制类型转换
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

 class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个Department对象
        Department dept = new Department("IT");
        // 创建一个Employee对象
        Employee emp = new Employee("Tom", 30, dept);
        // 克隆Employee对象
        Employee clonedEmp = (Employee) emp.clone();
        // 打印原始Employee对象的信息
        System.out.println("Original Employee:" + emp.getName() + ", " + emp.getAge() + ", " + emp.getDept().getDeptName());
        // 打印克隆后的Employee对象的信息
        System.out.println("Cloned Employee:" + clonedEmp.getName() + ", " + clonedEmp.getAge() + ", " + clonedEmp.getDept().getDeptName());
        // 修改Department对象的deptName属性
        dept.setDeptName("HR");
        // 再次打印原始Employee对象的信息
        System.out.println("Original Employee:" + emp.getName() + ", " + emp.getAge() + ", " + emp.getDept().getDeptName());
        // 再次打印克隆后的Employee对象的信息
        System.out.println("Cloned Employee:" + clonedEmp.getName() + ", " + clonedEmp.getAge() + ", " + clonedEmp.getDept().getDeptName());
    }
}
