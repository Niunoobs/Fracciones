public class recursivo
{
    public long sumaNEnteros(int n) 
    {
        if (n == 1)
            return 1;
        else{
            return n + sumaNEnteros(n-1);
        }

    }
}
