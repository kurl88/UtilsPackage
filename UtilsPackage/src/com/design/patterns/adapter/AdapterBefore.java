package com.design.patterns.adapter;

public class AdapterBefore
{
    public static void main(String[] args)
    {
        Object[] shapes = 
        {
            new LegacyLine(), new LegacyRectangle()
        };
        // A begin and end point from a graphical editor
        
//        for (int i = 0; i < shapes.length; ++i){
//        	System.out.println("="+shapes[i].getClass().getName());
//        	System.out.println("="+shapes[i].getClass().getSimpleName());
//
//
//        }
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i)
        	//System.out.println("="+shapes[i].getClass().getName());
		if (shapes[i].getClass().getSimpleName().equals("LegacyLine")){
            ((LegacyLine)shapes[i]).draw(x1, y1, x2, y2);

		}
          else if (shapes[i].getClass().getSimpleName().equals("LegacyRectangle")){
        	  ((LegacyRectangle)shapes[i]).draw(Math.min(x1, x2), Math.min(y1, y2)
                      , Math.abs(x2 - x1), Math.abs(y2 - y1));

          		}
               }
}
class LegacyLine
{
    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' 
          + y2 + ')');
    }
}

class LegacyRectangle
{
    public void draw(int x, int y, int w, int h)
    {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w
          + " and height " + h);
    }
}


//Output
//
//line from (10,20) to (30,60)
//rectangle at (10,20) with width 20 and height 40