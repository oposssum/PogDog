package RenderModule;

import SimulationModule.Entities;
import SimulationModule.Vec;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {

    public LeftPanel() {
        setBounds(0,0, 100, 520);
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.black));

        setLayout(new FlowLayout());

        JButton addEntityBtn = new JButton();
        addEntityBtn.setPreferredSize(new Dimension(32, 32));
        addEntityBtn.setBackground(Color.LIGHT_GRAY);
        addEntityBtn.setIcon(new ImageIcon("res/add.png"));
        addEntityBtn.addActionListener(e -> Entities.add(new Vec(100, 100)));
        add(addEntityBtn);

        JButton clearBtn = new JButton();
        clearBtn.setPreferredSize(new Dimension(32, 32));
        clearBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.setIcon(new ImageIcon("res/delete.png"));
        clearBtn.addActionListener(e -> Entities.rmAll());
        add(clearBtn);
    }
}
