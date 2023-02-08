package cohen.projectile;

public class MathDemo
{
    public static void main(String[] args)
    {
        Projectile rock = new Projectile(39, 77);

        for (int i = 0; i < 11; i++)
        {
            System.out.println("t = " + rock.getTime() + ": (" + rock.getX() + ", " + rock.getY() + ")");
            rock.incTime(1);
        }
    }
}