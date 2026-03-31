class Student2 {
     String name ;
     int age;

     public static void main(String[] args){
          Student2 a = new Student2();
          a.name = "om";
          a.age = 23;

          Student2 b = new Student2();
          b.name="ram";
          b.age = 24;

          Student2 c = new Student2();
          c.name = "veer";
          c.age = 25;

          System.out.println(a.name);
          System.out.println(a.age);
          System.out.println(b.name);
          System.out.println(b.age);
          System.out.println(c.name);
          System.out.println(c.age);
     }
}

// om
// 23
// ram
// 24
// veer
// 25