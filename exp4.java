/*unary operators
pre increment (++i)
post increment(i++)
pre decrement(--i)
post decrement(i--)*/

public class exp4 {
    public static void main(String[] args){
        int i = 0;

        System.out.println(i++);//0
        System.out.println(i);//1
        System.out.println(i--);//1
        System.out.println(i);//0

        System.out.println(++i);//1
        System.out.println(--i);//0

        i+=20;

        i*=3;                                                                                                           

    }
}
