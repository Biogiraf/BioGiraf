
public class SubExp extends Exp
{
   private Exp left;
   private Exp right;
    public SubExp(Exp left, Exp right)
    {
        super();
        this.left=left;
        this.right=right;
    }

    public int eval()
    {
        return left.eval()-right.eval();
    }
}
