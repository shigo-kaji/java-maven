/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bagorio_student;

/**
 *
 * @author Antonette
 */
public class Student {
    private int stnum;
    private String name;
    private String program;

    public Student(int stnum, String name, String program) {
        this.stnum = stnum;
        this.name = name;
        this.program = program;
    }

    public int getStnum() {
        return stnum;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    } 
}
