class GFG
{
    static double PHI = 1.6180339;
     
    static int f[] = { 0, 1, 1, 2, 3, 5 };
     
   
    static int fib (int n)
    {
        if (n < 6)
            return f[n];
     
     
        int t = 5;
        int fn = 5;
     
        while (t < n) {
            fn = (int)Math.round(fn * PHI);
            t++;
        }
     
        return fn;
    }
     
    public static void main (String[] args)
    {
        int n = 9;
        System.out.println(n + "th Fibonacci Number = "
                                                +fib(n));
    }
}
 
