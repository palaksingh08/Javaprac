class Student5{
     String name;
     int age;

     static int maxAge = 21;

     public static void main(String[] args){
          Student5 a = new Student5();
          a.name = "abc";
          a.age = 12;
          a.maxAge = 23; 

          Student5 b = new Student5();
          b.name = "def";
          b.age = 19;
     
          b.showInfo();
          a.showInfo();

     }

     void showInfo(){
          System.out.println(name);
          System.out.println(age);
          System.out.println(maxAge);

     }
}

// def
// 19
// 23
// abc
// 12
// 23