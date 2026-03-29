class P{
     static int y = 45;

     public static void main(String[] args){
          P a = new P();
          a.y = 99;

          P b = new P();
          b.y = 999;

          P c = new P();
          c.y = 9999;

          c.pro();
          b.pro();
          a.pro();
     }

     void pro(){
          System.out.println(y);
     }
}


// 9999
// 9999
// 9999