package SimulationModule;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

import static java.lang.Math.PI;

public class Square {
    //size in meters
    public static Dimension size;
    static final Path2D shape = new Path2D.Double();

    Vec location, velocity, acceleration;

    public Square(Vec location) {
        this.location = location;
        acceleration = new Vec();
        velocity = new Vec();
        size = new Dimension(10, 10); //1 by 1 meter (10 by 10 pixel)
        shape.moveTo(0d, 0d);
        shape.lineTo(size.width, 0d);
        shape.lineTo(size.width, size.height);
        shape.lineTo(0d, size.height);
        shape.lineTo(0d, 0d);
    }



    void update(long frameDelta) {
        double delta = frameDelta * 0.000000001d;
        acceleration.add(Constants.G_EARTH_VEC);
        acceleration.mul(delta);
        acceleration.mul(10d);
        velocity.add(acceleration);
        velocity.limit(Constants.SPEED_OF_LIGHT);
        location.add(velocity);
    }

    void applyForce(Vec force) {
        acceleration.add(force);

    }

    void draw(Graphics2D g) {
        AffineTransform save = g.getTransform();

        g.translate(location.x, location.y);
        g.setColor(Color.white);
        g.fill(shape);
        g.setColor(Color.black);
        g.draw(shape);

        g.setTransform(save);
    }

    void run(Graphics2D g, long frameDelta) {
        update(frameDelta);
        draw(g);
    }
}
