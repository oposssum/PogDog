package SimulationModule;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Entities {
    static List<Square> entities;

    public Entities() {
        entities = new ArrayList<>();
    }

    public void testSpawn(){
        /*for (int i = 0; i < 10; i++){
            entities.add(new TestEntity(new Vec(100, 100)));
        }*/
    }

    public void run(Graphics2D g, long frameDelta){
        for (int i = 0; i < entities.size(); i++){
            entities.get(i).run(g, frameDelta);
        }
    }

    public static void add(Vec vec){
        entities.add(new Square(vec));
    }

    public static void rmAll(){
        entities.clear();
    }

}
