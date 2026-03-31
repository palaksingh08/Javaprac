class Student7{
     String name;
     int age;

     static int maxAge = 21;

     public static void main(String[] args){
          Student7 a = new Student7();
          a.name = "abc";
          a.age = 12;
          a.maxAge = 23; 

          Student7 b = new Student7();
          b.name = "def";
          b.age = 19;
     
          b.showInfo(b);
          a.showInfo(a);

     }

     static void showInfo(Student7 s){
          System.out.println(s.name);
          System.out.println(s.age);
          System.out.println(maxAge);

     }
}

