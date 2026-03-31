class Circle1{
     int radius;
     static float pi = 3.14f;

     void defineCircle1(){
          System.out.println("a round plane figure whose boundary(the circumference)consists of points eqidistant from a fixed point(the centre)");
     }

     public static void main(String[] args){
          Circle1 a = new Circle1();
          a.radius = 87;

          Circle1 b = new Circle1();
          b.radius = 40;

          a.defineCircle1();
          calcArea(a);
          calcArea(b);
     }

     static void calcArea(Circle1 c){
          System.out.println(pi*c.radius*c.radius);
     }

}

// a round plane figure whose boundary(the circumference)consists of points eqidistant from a fixed point(the centre)
// 23766.662
// 5024.0