package com.bloomberg;

public final class Student {
    final String name;
    final int regNo;

    public Student(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
}

// Driver class
class Test
{
    public static void main(String args[])
    {
        Student s = new Student("ABC", 101);
        Student s1 = new Student("wer", 12);
        System.out.println(s1.getName());
        System.out.println(s1.getRegNo());

        // Uncommenting below line causes error
        // s.regNo = 102;
    }
}