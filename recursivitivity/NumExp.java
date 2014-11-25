
public class NumExp extends Exp
{
   private int n;
    public NumExp(int n)
    {
        super();
        this.n=n;
    }

    public int eval()
    {
        return n;
    }
}
