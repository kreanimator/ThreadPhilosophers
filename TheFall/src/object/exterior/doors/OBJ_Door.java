package object.exterior.doors;

import entity.Entity;
import main.GamePanel;
import object.Object;


public class OBJ_Door extends Object {

    GamePanel gp;
    public final static String objName = "Door";
    boolean opened = false;

    public OBJ_Door(GamePanel gp, int col, int row) {
        super(gp,col,row);
        int height = (gp.tileSize*2)-30 ;
        int width = gp.tileSize+15;

        type = typeObstacle;
        name = objName;
        image = setup("objects/interactiveobjects/doorclosed", width, height);
        image2 = null;
        //image2 = setup("objects/interactiveobjects/dooropened", width, height);
        down1 = image;
        collision = true;
        this.gp = gp;
        solidArea.x = 20;
        solidArea.y = 8;
        solidArea.width = 48;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;


    }

    public void interact() {

        if (!opened) {
            gp.playSE(2);
            down1 = image2;
            opened = true;
            collision = false;
        }

    }

}

