class Student3{
     String name;
     int age;

     int maxAge = 20;

     public static void main(String[] args){
          Student3 a = new Student3();

          a.name = "om";
          a.age = 9;
          a.maxAge = 21;

          Student3 b = new Student3();
          b.name = "ram";
          b.age = 12;
          b.maxAge = 34;
          
          Student3 c = new Student3();
          c.name = "golu";
          c.age = 21;

          System.out.println(a.name);
          System.out.println(a.age);
          System.out.println(a.maxAge);
          System.out.println(b.name);
          System.out.println(b.age);
          System.out.println(b.maxAge);
          System.out.println(c.name);
          System.out.println(c.age);
          System.out.println(c.maxAge);
     }
}
