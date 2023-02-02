package Cohen.Projectile;

public class Projectile
{
    private final double angle;
    private final double velocity;
    private final double radians;
    private double time;

    public Projectile(double angle, double velocity, double time)
    {
        this.angle = angle;
        this.velocity = velocity;
        this.radians = Math.toRadians(angle);
        this.time = time;
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
        return Math.sin(radians) * velocity * time - 0.5 * 9.8 * Math.pow(time, 2);
    }
}
