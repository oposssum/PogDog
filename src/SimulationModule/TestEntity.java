package SimulationModule;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class TestEntity {
    public int size;
    public Path2D shape = new Path2D.Double();

    public Vec location;

    public TestEntity(Vec location) {
        this.location = location;
        size = 3;
        shape.moveTo(0, -size * 2);
        shape.lineTo(-size, size * 2);
        shape.lineTo(size, size * 2);
        shape.closePath();
    }

    public TestEntity(int size, Path2D shape, Vec location) {
        this.size = size;
        this.shape = shape;
        this.location = location;
    }

    public void move(Vec location){
        this.location.add(location);
    }

    public void draw(Graphics2D g){
        AffineTransform save = g.getTransform();

        g.translate(location.x, location.y);
        g.setColor(Color.white);
        g.fill(shape);
        g.setColor(Color.black);
        g.draw(shape);

        g.setTransform(save);
    }

    public void run(Graphics2D g){
        move(new Vec(Math.random(), Math.random()));
        draw(g);
    }
}
