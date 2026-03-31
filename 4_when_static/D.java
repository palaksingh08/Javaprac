class Student4{
     String name;
     int age;

     static int maxAge = 20;

     public static void main(String[] args){
          Student4 a = new Student4();
          a.name = "golu";
          a.age = 21;

          Student4 b = new Student4();
          b.name = "bholu";
          b.maxAge = 45;

          System.out.println(a.name);
          System.out.println(a.age);
          System.out.println(a.maxAge);
          System.out.println(b.name);
          System.out.println(b.age);
          System.out.println(b.maxAge);
     }

}


// golu
// 21
// 45
// bholu
// 0
// 45