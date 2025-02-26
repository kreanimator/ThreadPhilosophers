package object.barrels;

import entity.Entity;
import main.GamePanel;
import object.Object;

public class OBJ_ToxicBarrels8 extends Object {
    GamePanel gp;
    public final static String objName = "ToxicBarrels8";

    public OBJ_ToxicBarrels8(GamePanel gp, int col, int row) {
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
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize;
        int height = gp.tileSize;

        down1 = setup("tiles/exterior/toxic_barrels8", width, height);


    }

    public void setAction() {

    }

    public void update() {

    }
}
