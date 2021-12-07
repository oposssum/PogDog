package SimulationModule;

import static java.lang.Math.*;

public class Vec {
    public double x, y;

    Vec() {
    }

    public Vec(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vec v) {
        x += v.x;
        y += v.y;
    }

    public void sub(Vec v) {
        x -= v.x;
        y -= v.y;
    }

    public void div(double val) {
        x /= val;
        y /= val;
    }

    public void mul(double val) {
        x *= val;
        y *= val;
    }

    public double mag(){
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    public double dot(Vec v){
        return x * v.x + y * v.y;
    }

    public void normalize() {
        double mag = mag();
        if (mag != 0) {
            x /= mag;
            y /= mag;
        }
    }

    public void limit(double lim) {
        double mag = mag();
        if (mag != 0 && mag > lim) {
            x *= lim / mag;
            y *= lim / mag;
        }
    }

    public double heading() {
        return atan2(y, x);
    }

    public static Vec sub(Vec v, Vec v2) {
        return new Vec(v.x - v2.x, v.y - v2.y);
    }

    public static double dist(Vec v, Vec v2) {
        return sqrt(pow(v.x - v2.x, 2) + pow(v.y - v2.y, 2));
    }

    public static double angleBetween(Vec v, Vec v2) {
        return acos(v.dot(v2) / (v.mag() * v2.mag()));
    }
}
