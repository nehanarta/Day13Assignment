public class MaxNum {
   // void MaxInt(Integer x,Integer y,Integer z) {
        // Integer x,y,z;
     //   int max = y;
       // if (x.compareTo(max) > 0) {
        //    max = x;
        //}
        //if (y.compareTo(max) > 0) {
         //   max = y;
        //}
        //if (z.compareTo(max) > 0) {
         //   max = z;
        //}
        //System.out.println(max);
    //}
    //public void MaxFloat(Float m ,Float n,Float p){
      //  Float maxF = n;
        //if(m.compareTo(maxF)>0) {
          //  maxF=m;

        //}if(n.compareTo(maxF)>0){
         //   maxF=n;
        //}if(p.compareTo(maxF)>0){
         //   maxF=p;
        //}
        //System.out.println(maxF);
    //}
    //    public void MaxString(String s1,String s2,String s3){
      //  String MaxS=s2;
        //if(s1.compareTo(MaxS)>0) {
          //  MaxS=s1;

        //}if(s2.compareTo(MaxS)>0){
         //   MaxS=s2;
        //}if(s3.compareTo(MaxS)>0){
         //   MaxS=s3;
        //}
        //System.out.println(MaxS);
    public static<E extends Comparable > void printMax(E x , E y ,E z){
        E max=x;
        if(y.compareTo(max)>0){
            max=y;
        }if(z.compareTo(max)>0){
            max=z;
        }
        System.out.println(max);
    }

            public static void main (String[] args){
                MaxNum obj=new MaxNum();
                obj.printMax(50,60,49);
                obj.printMax(4.7f,4.8f,4.1f);
                obj.printMax("apple","peach","Banana");
        }

    }

