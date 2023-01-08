package main;

import enemies.*;
import entity.NPC_BigRock;
import entity.NPC_Ghoul;
import entity.NPC_Nick;
import entity.NPC_Patient;
import object.armor.OBJ_Armor_Learther;
import object.armor.OBJ_Armor_Metal;
import object.exterior.*;
import object.interior.*;
import object.misc.OBJ_Flashlight;
import object.misc.OBJ_HPPack;
import object.misc.OBJ_Lockpick;
import object.misc.OBJ_Tent;
import object.weapon.OBJ_Ammo_Pistol;
import object.weapon.OBJ_Melee_Bat_normal;
import object.weapon.OBJ_Pistol;
import object.weapon.OBJ_Wrench;
import tile_interactive.IT_Box;
import tile_interactive.IT_MetalPlate;
import tile_interactive.IT_Vase;

public class AssetSetter {


    GamePanel gp;


    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int mapNum = 0;
        int i =0;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 49;
        gp.obj[mapNum][i].worldY = gp.tileSize * 31;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 38;
        gp.obj[mapNum][i].worldY = gp.tileSize * 22;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 51;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Door(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 65;
        gp.obj[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Pistol(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 29;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot( new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 30;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Wrench(gp) );
        gp.obj[mapNum][i].worldX = gp.tileSize * 58;
        gp.obj[mapNum][i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot( new OBJ_Lockpick(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 44;
        gp.obj[mapNum][i].worldY = gp.tileSize * 26;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(  new OBJ_Ammo_Pistol(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 47;
        gp.obj[mapNum][i].worldY = gp.tileSize * 26;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_Armor_Metal(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 68;
        gp.obj[mapNum][i].worldY = gp.tileSize * 12;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot( new OBJ_Tent(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 15;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(  new OBJ_Armor_Learther(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 14;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(  new OBJ_Melee_Bat_normal(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 12;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_Locker(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 13;
        gp.obj[mapNum][i].worldY = gp.tileSize * 64;
        i++;
        gp.obj[mapNum][i] = new OBJ_Table(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 12;
        gp.obj[mapNum][i].worldY = gp.tileSize * 69;
        i++;
        gp.obj[mapNum][i] = new OBJ_Table(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 28;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chair(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 27;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chair(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 29;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chair(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 12;
        gp.obj[mapNum][i].worldY = gp.tileSize * 68;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 15;
        gp.obj[mapNum][i].worldY = gp.tileSize * 69;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 51;
        gp.obj[mapNum][i].worldY = gp.tileSize * 27;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 51;
        gp.obj[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 40;
        gp.obj[mapNum][i].worldY = gp.tileSize * 18;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 69;
        gp.obj[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 71;
        gp.obj[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bed(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 40;
        gp.obj[mapNum][i].worldY = gp.tileSize * 20;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bookshelf2(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 64;
        gp.obj[mapNum][i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bookshelf2(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 65;
        gp.obj[mapNum][i].worldY = gp.tileSize * 11;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bookshelf(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 25;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Bookshelf(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 35;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        i++;
        gp.obj[mapNum][i] = new OBJ_Table(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 45;
        gp.obj[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chair(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 44;
        gp.obj[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.obj[mapNum][i] = new OBJ_Chair(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 46;
        gp.obj[mapNum][i].worldY = gp.tileSize * 29;
        i++;
        gp.obj[mapNum][i] = new OBJ_GarbageTrunk(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 23;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[mapNum][i] = new OBJ_GarbageTrunk(gp);
        gp.obj[mapNum][i].setLoot(new OBJ_HPPack(gp));
        gp.obj[mapNum][i].worldX = gp.tileSize * 54;
        gp.obj[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.obj[mapNum][i] = new OBJ_BunkerDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 85;
        gp.obj[mapNum][i].worldY = gp.tileSize * 16;
        mapNum = 1;
        i=0;
        gp.obj[mapNum][i] = new OBJ_IronDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 89;
        gp.obj[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        mapNum = 2;
        i=0;
        gp.obj[mapNum][i] = new OBJ_IronDoor(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 98;
        gp.obj[mapNum][i].worldY = gp.tileSize * 57;

    }



    public void setInteractiveTile(){
        int mapNum = 0;
        int i =0;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,14);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,54,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,55,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,56,15);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,19,77);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,20,76);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,21,75);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,28,78);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,78);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,27,79);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,12);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,13);
        i++;
        gp.iTile[mapNum][i] = new IT_Box(gp,46,14);

        mapNum = 1;
        i=0;
        gp.iTile[mapNum][i] = new IT_Vase(gp,16,41);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,17,41);
        i++;
        gp.iTile[mapNum][i] = new IT_Vase(gp,18,41);
        i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,11,12);
        i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,34,84);
        i++;
        gp.iTile[mapNum][i] = new IT_MetalPlate(gp,87,59);
    }
    public void setNPC() {
        int mapNum = 0;
        int i =0;
        gp.npc[mapNum][i] = new NPC_Nick(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 26;
        gp.npc[mapNum][i].worldY = gp.tileSize * 79;

//        gp.npc[mapNum][i] = new OBJ_CampFire(gp);
//        gp.npc[mapNum][i].worldX = gp.tileSize * 25;
//        gp.npc[mapNum][i].worldY = gp.tileSize * 79;

        mapNum = 1;
        i=0;
        gp.npc[mapNum][i] = new NPC_Ghoul(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 14;
        gp.npc[mapNum][i].worldY = gp.tileSize * 41;
        i++;
        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 80;
        gp.npc[mapNum][i].worldY = gp.tileSize * 56;
        i++;
        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 6;
        gp.npc[mapNum][i].worldY = gp.tileSize * 17;
        i++;
        gp.npc[mapNum][i] = new NPC_BigRock(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 29;
        gp.npc[mapNum][i].worldY = gp.tileSize * 80;
        mapNum = 3;
        i=0;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 4;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 4;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 4;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 4;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 7;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 7;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 7;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 7;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 10;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 10;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 10;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 10;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 13;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 13;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 13;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 13;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 16;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 16;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 16;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 16;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 19;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 19;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 19;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 19;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 22;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 22;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 22;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 22;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 25;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 25;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 25;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 25;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 28;
        gp.npc[mapNum][i].worldY = gp.tileSize * 57;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 28;
        gp.npc[mapNum][i].worldY = gp.tileSize * 54;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 28;
        gp.npc[mapNum][i].worldY = gp.tileSize * 51;
        i++;
        gp.npc[mapNum][i] = new NPC_Patient(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 28;
        gp.npc[mapNum][i].worldY = gp.tileSize * 48;


    }

    public void setEnemy() {
        int mapNum = 0;
        int i = 0;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 77;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 80;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 77;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 82;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 78;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 85;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 75;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
        i++;
        gp.enemy[mapNum][i] = new GreenSlime(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 74;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 83;
        i++;

        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 49;
        gp.enemy[mapNum][i].worldY = gp.tileSize *13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 50;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 63;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 46;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 47;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 28;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 60;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 13;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 18;
        i++;
        gp.enemy[mapNum][i] = new Punk(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 30;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 19;
        i++;
        gp.enemy[mapNum][i] = new Ghoul(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 75;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 46;
        i++;
        gp.enemy[mapNum][i] = new DeathClaw(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 29;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 48;

        mapNum =1;
        i=0;
        gp.enemy[mapNum][i] = new Spider(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 35;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 79;
        i++;

        gp.enemy[mapNum][i] = new Bug1(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 10;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        gp.enemy[mapNum][i] = new Bug2(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 13;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        gp.enemy[mapNum][i] = new Bug3(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 15;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 14;

        mapNum =3;
        i=0;
        gp.enemy[mapNum][i] = new SlimeBoss(gp);
        gp.enemy[mapNum][i].worldX = gp.tileSize * 59;
        gp.enemy[mapNum][i].worldY = gp.tileSize * 45;



    }
}
