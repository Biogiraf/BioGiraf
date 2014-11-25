
public class AddExp extends Exp
{
   private Exp left;
   private Exp right;
    public AddExp(Exp left, Exp right)
    {
        super();
        this.left=left;
        this.right=right;
    }

    public int eval()
    {
        return left.eval()+right.eval();
    }
}
