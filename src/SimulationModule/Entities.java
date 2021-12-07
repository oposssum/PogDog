package SimulationModule;

import RenderModule.Screen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Entities {
    List<TestEntity> entities;

    public Entities() {
        entities = new ArrayList<>();
    }

    public void testSpawn(){
        for (int i = 0; i < 10; i++){
            entities.add(new TestEntity(new Vec(100, 100)));
        }
    }

    public void run(Graphics2D g){
        for (int i = 0; i < entities.size(); i++){
            entities.get(i).run(g);
        }
    }
}
