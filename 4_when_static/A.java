class Student1{
     static String name;
     static int age;

     public static void main(String[] args){
          Student1 a = new Student1();
          a.name = "mohan";
          a.age = 12;

          Student1 b = new Student1();
          b.name = "ram";
          b.age = 13;

          Student1 c = new Student1();
          c.name = "om";
          c.age = 14;

          System.out.println(a.name);
          System.out.println(a.age);
          System.out.println(b.name);
          System.out.println(b.age);
          System.out.println(c.name);
          System.out.println(c.age);

     }
}

// om
// 14
// om
// 14
// om
// 14