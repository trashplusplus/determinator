package com.zeroxthree;

import javax.swing.*;

public class Window extends JFrame{
    private int width = 275;
    private int height = 256;
    private String name = "Determinant / v.1 by 0x3";

    Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(this.width, this.height);
        setLocationRelativeTo(null);
        setTitle(this.name);
        setVisible(true);
        setResizable(false);
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
