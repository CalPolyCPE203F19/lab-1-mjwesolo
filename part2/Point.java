class Point
{
   //instance variables
   private double x;
   private double y;
   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
 
   public double getX(){ return x;}
   public double getY(){ return y;}

   public double getRadius()
   {
      double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
      return dist;
   }

   public double getAngle()
   {
      double angle = Math.atan(y/x);
      return angle;
   }

   public Point rotate90()
   {
      return (new Point(-y, x));
   }

}
