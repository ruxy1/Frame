package com.stephen;
import java.awt.*;
import javax.swing.JFrame;
public class SimpleFrame extends JFrame {

public SimpleFrame(){
    setSize(200,200);
    setLocation(200,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  //Make the frame visible
    public void showIt(){
    setVisible(true);
    }

    //Make the frame visible and set the title text
    public void showIt(String title){
    setTitle(title);
    setVisible(true);
    }

    //Make the frame visible and set the title text and set the position of the window
    public void showIt(String title,int x,int y){
    setTitle(title);
    setLocation(x,y);
    setVisible(true);
}

//Make the frame invisible
    public void hideIt(){
    setVisible(false);
    }

    public static void main(String[] args) {
	SimpleFrame sFrame1=new SimpleFrame();
    SimpleFrame sFrame2=new SimpleFrame();
    sFrame1.showIt("SimpleFrame1");
    sFrame2.showIt("simpleFrame 2",300,300);
    }
}
