package cohen.projectile;

public class Projectile
{
    private final double angle;
    private final double velocity;
    private final double radians;
    private double time;

    public Projectile(double angle, double velocity)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.radians = Math.toRadians(angle);
        time = 0;
    }

    public double getTime(){return time;}

    public void incTime (double delta)
    {
        time += delta;
    }

    public double getAngle()
    {
        return angle;
    }

    public double getVelocity()
    {
        return velocity;
    }

    public double getX ()
    {
        return Math.cos(radians) * velocity * time;
    }

    public double getY ()
    {
        return Math.sin(radians) * velocity * time - 0.5 * 9.8 * time * time;
    }
}
