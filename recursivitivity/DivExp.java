
public class DivExp extends Exp
{
   private Exp left;
   private Exp right;
    public DivExp(Exp left, Exp right)
    {
        super();
        this.left=left;
        this.right=right;
    }

    public int eval()
    {
        return left.eval()/right.eval();
    }
}
