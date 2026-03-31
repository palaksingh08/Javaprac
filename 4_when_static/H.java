class Circle{
     int radius;
     static float pi = 3.14f;

     void defineCircle(){
          System.out.println("a round plane figure whose boundary(the circumference)consists of points eqidistant from a fixed point(the centre)");
     }

     public static void main(String[] args){
          Circle a = new Circle();
          a.radius = 87;

          Circle b = new Circle();
          b.radius = 40;

          a.defineCircle();
          a.calcArea();

          b.defineCircle();
          b.calcArea();
     }

      void calcArea(){
          System.out.println(pi*radius*radius);
     }

}


// a round plane figure whose boundary(the circumference)consists of points eqidistant from a fixed point(the centre)
// 23766.662
// a round plane figure whose boundary(the circumference)consists of points eqidistant from a fixed point(the centre)
// 5024.0