public class MaxNum {
    void MaxInt(Integer x,Integer y,Integer z) {
        // Integer x,y,z;
        int max = y;
        if (x.compareTo(max) > 0) {
            max = x;
        }
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max);
    }
            public static void main (String[] args){
                MaxNum obj=new MaxNum();
                obj.MaxInt(50,60,49);
        }

    }

