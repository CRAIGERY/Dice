import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die bob;
Die tim;
public void setup()
 {
     noLoop();
     size(300,300);
     noFill();
 }
 public void draw()
 {
     background(0);
     bob = new Die(75,75);
     tim = new Die(175,75);
     bob.roll();
     bob.show();
     tim.roll();
     tim.show();
     stroke(255);
     text("You rolled " + (bob.numDots + tim.numDots), 150, 150);
     text("Click the screen...", 130,50);
 }
   public void mousePressed()
 {
     redraw();
 }
 class Die //models one single dice cube
 {
     int numDots, myX, myY;
     Die(int x, int y) //constructor
     {
         myX = x;
         myY = y;
         numDots = (int)(Math.random()*6)+1;
     }
     public void roll()
     {
         if (numDots == 1)
         {
            ellipse(myX+25,myY+25,10,10);
         }
         if (numDots == 2)
         {
            ellipse(myX+10,myY+10,10,10);
            ellipse(myX+40,myY+40,10,10);
         }
         if (numDots == 3)
         {
            ellipse(myX+10,myY+10,10,10);
            ellipse(myX+25,myY+25,10,10);
            ellipse(myX+40,myY+40,10,10);
         }
         if (numDots == 4)
         {
            ellipse(myX+10,myY+10,10,10);
            ellipse(myX+10,myY+40,10,10);
            ellipse(myX+40,myY+40,10,10);
            ellipse(myX+40,myY+10,10,10);
         }
         if (numDots == 5)
         {
            ellipse(myX+10,myY+10,10,10);
            ellipse(myX+10,myY+40,10,10);
            ellipse(myX+40,myY+40,10,10);
            ellipse(myX+40,myY+10,10,10);
            ellipse(myX+25,myY+25,10,10);
         }
         if (numDots == 6)
         {
            ellipse(myX+10,myY+10,10,10);
            ellipse(myX+10,myY+40,10,10);
            ellipse(myX+40,myY+40,10,10);
            ellipse(myX+40,myY+10,10,10);
            ellipse(myX+10,myY+25,10,10);
            ellipse(myX+40,myY+25,10,10);
         }
     }
     public void show()
     {
         rect(myX,myY,50,50);
     }
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
