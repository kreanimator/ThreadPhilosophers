package object.barrels;

import entity.Entity;
import main.GamePanel;
import object.Object;

public class OBJ_ToxicBarrels5 extends Object {
    GamePanel gp;
    public final static String objName = "ToxicBarrels5";

    public OBJ_ToxicBarrels5(GamePanel gp, int col, int row) {
        super(gp, col, row);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        lightRadius = 300;
        collision = true;
        getImage();
        setAction();

        solidArea.x = 6;
        solidArea.y = gp.tileSize-24;
        solidArea.width = gp.tileSize+12;
        solidArea.height = gp.tileSize;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize +24;
        int height = gp.tileSize +24;

        down1 = setup("tiles/exterior/toxic_barrels5", width, height);


    }

    public void setAction() {

    }

    public void update() {

    }
}
