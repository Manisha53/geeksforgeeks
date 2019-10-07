class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        // Your code here
        int d = a ^ a;
        System.out.println(d);
       int  e = c ^ b;
       System.out.println(e);
       int f = a & b;
       System.out.println(f);
       int  g = c | (a ^ a);
       System.out.println(g);
       int h = ~e;         //~N=~(N+1)
        System.out.println(h);
        
    }
}

/*


1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~e
Note: ^ is for xor.


Example:
Input:
1
4 8 2

Output:
0
10
0
2
-11

*/
