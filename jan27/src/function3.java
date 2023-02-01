public class function3 {
    public static int logic(int x,int y){
        int z;
        if (x>y) {
            z = x + y;
        }
            else{
                z=(x+y)*5;
            }
            return z;
        }

    public static void main(String[] args) {
        int a=3;
        int b=8;
        int c;
        c=logic(a,b);
        int s1=7;
        int s2=2;
        int s3;
        s3=logic(s1,s2);
        System.out.println(c);
        System.out.println(s3);
    }

    }

