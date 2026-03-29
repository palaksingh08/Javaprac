class M{
     float e = 5.5f;

     public static void main(String[] args){
          M a = new M();
          a.pro();
     }

     void pro(){
          System.out.println(a.e);
     }
}

// M.java:10: error: cannot find symbol
//           System.out.println(a.e);
//                              ^
//   symbol:   variable a
//   location: class M
