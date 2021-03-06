Die bob;
Die tim;
void setup()
 {
     noLoop();
     size(300,300);
     noFill();
 }
 void draw()
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
   void mousePressed()
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
     void roll()
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
     void show()
     {
         rect(myX,myY,50,50);
     }
 }