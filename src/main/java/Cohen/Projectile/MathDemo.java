package Cohen.Projectile;

public class MathDemo
{
    public static void main(String[] args)
    {
        Projectile rock = new Projectile(39, 77, 0);

        while (rock.getTime() < 11)
        {
            System.out.println("t = " + rock.getTime() + ": (" + rock.getX() + ", " + rock.getY() + ")");
            rock.incTime(1);
        }
    }
}