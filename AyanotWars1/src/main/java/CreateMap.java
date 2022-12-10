
import com.sun.source.util.Trees;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Random;


public class CreateMap extends JPanel implements ActionListener , KeyListener {

    // controls the size of the map
    public static final int TILE_SIZE = 50;
    public static final int ROWS = 15;
    public static final int COLUMNS = 30;
    // controls how many enemies appear on the board
    public static final int NUM_ENEMIES = 10;
    public static final int NUM_ROCKS = 10;
    public static final int NUM_TREES = 10;
    public static final int[][] MAS_MAP = new int[COLUMNS][ROWS];

    // suppress serialization warning
    @Serial
    private static final long serialVersionUID = 490905409104883233L;

    // objects that appear on the game board
    private final Player player;
    private final ArrayList<Enemy> enemies;
      private final ArrayList<Stone> stone;
    private final ArrayList<Tree> trees;
    private final ArrayList<Grass> grasses;
    public CreateMap() {
        // set the game board size
        setPreferredSize(new Dimension(TILE_SIZE * COLUMNS, TILE_SIZE * ROWS));
        // set the game board background color
        setBackground(new Color(232, 232, 232));
        MAS_MAP[0][0] = 1;
        MAS_MAP[1][0] = 1;
        MAS_MAP[0][1] = 1;
        // initialize the game state
        player = new Player();
        enemies = populateEnemies();
        stone = fillStones();
        trees = fillTrees();
        grasses = fillGrass();


        // this timer will call the actionPerformed() method every DELAY ms
        int DELAY = 25;
        // keep a reference to the timer object that triggers actionPerformed() in
        // case we need access to it in another method
        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // this method is called by the timer every DELAY ms.
        // use this space to update the state of your game or animation
        // before the graphics are redrawn.

        // prevent the player from disappearing off the board
        player.tick();

        // give the player experience for killing enemies
        killEnemies();

        // calling repaint() will trigger paintComponent() to run again,
        // which will refresh/redraw the graphics.
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // when calling g.drawImage() we can use "this" for the ImageObserver
        // because Component implements the ImageObserver interface, and JPanel
        // extends from Component. So "this" Board instance, as a Component, can
        // react to imageUpdate() events triggered by g.drawImage()

        // draw our graphics.

//        drawBackground(g);
        for (Grass grass : grasses) {
            grass.draw(g, this);
        }
        for (Enemy enemy : enemies) {
            enemy.draw(g, this);
        }
        for (Stone stone : stone) {
            stone.draw(g, this);
        }
        for (Tree tree : trees) {
            tree.draw(g, this);
        }
        player.draw(g, this);
        drawExperience(g);

        // this smooths out animations on some systems
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // this is not used but must be defined as part of the KeyListener interface
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // react to key down events
        player.keyPressed(e, MAS_MAP);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // react to key up events
    }


    private void drawBackground(Graphics g) {
        // draw a checkered background
        g.setColor(new Color(214, 214, 214));
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                // only color every other tile
                if ((row + col) % 2 == 1) {
                    // draw a square tile at the current row/column position
                    g.fillRect(
                            col * TILE_SIZE,
                            row * TILE_SIZE,
                            TILE_SIZE,
                            TILE_SIZE
                    );
                }
            }
        }
    }

    private void drawExperience(Graphics g) {
        // set the text to be displayed
        String text = "Exp " + player.getExperience();
        // we need to cast the Graphics to Graphics2D to draw nicer text
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(
                RenderingHints.KEY_FRACTIONALMETRICS,
                RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        // set the text color and font
        g2d.setColor(new Color(0, 0, 0));
        g2d.setFont(new Font("Lato", Font.BOLD, 25));
        // draw the score in the bottom center of the screen
        // https://stackoverflow.com/a/27740330/4655368
        FontMetrics metrics = g2d.getFontMetrics(g2d.getFont());
        // the text will be contained within this rectangle.
        // here I've sized it to be the entire bottom row of board tiles
        Rectangle rect = new Rectangle(0, TILE_SIZE * (ROWS - 1), TILE_SIZE * COLUMNS, TILE_SIZE);
        // determine the x coordinate for the text
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        // determine the y coordinate for the text
        // (note we add the ascent, as in java 2d 0 is top of the screen)
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        // draw the string
        g2d.drawString(text, x, y);
    }

    private ArrayList<Enemy> populateEnemies() {
        ArrayList<Enemy> enemyList = new ArrayList<>();
        Random rand = new Random();

        // create the given number of enemies in random positions on the board.
        // note that there is not check here to prevent two coins from occupying the same
        // spot, nor to prevent coins from spawning in the same spot as the player
        for (int i = 0; i < NUM_ENEMIES;) {
            int enemyX = rand.nextInt(COLUMNS);
            int enemyY = rand.nextInt(ROWS);
            if (MAS_MAP[enemyX][enemyY] == 0) {
                MAS_MAP[enemyX][enemyY] = 1;
                enemyList.add(new Enemy(enemyX, enemyY));
                i++;
            }
        }

        return enemyList;
    }
    private ArrayList<Stone> fillStones() {
        ArrayList<Stone> stoneList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < NUM_ROCKS;) {
            int rockX = rand.nextInt(COLUMNS);
            int rockY = rand.nextInt(ROWS);
            if (MAS_MAP[rockX][rockY] == 0) {
                MAS_MAP[rockX][rockY] = 2;
                stoneList.add(new Stone(rockX, rockY));
                i++;
            }
        }

        return stoneList;
    }

    private ArrayList<Tree> fillTrees() {
        ArrayList<Tree> treeList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < NUM_TREES; ) {
            int treeX = rand.nextInt(COLUMNS);
            int treeY = rand.nextInt(ROWS);
            if (MAS_MAP[treeX][treeY] == 0) {
                MAS_MAP[treeX][treeY] = 2;
                treeList.add(new Tree(treeX, treeY));
                i++;
            }
        }
            return treeList;
    }
    private ArrayList<Grass> fillGrass() {
        ArrayList<Grass> grassList = new ArrayList<>();
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                grassList.add(new Grass(i, j));
            }
        }

        return grassList;
    }

    private void killEnemies() {
        // allow player to pickup coins
        ArrayList<Enemy> enemiesKilled = new ArrayList<>();
        for (Enemy enemy : enemies) {
            // if the player is on the same tile as a coin, collect it
            if (player.getPos().equals(enemy.getPos())) {
                // give the player some points for picking this up
                player.addExperience(100);
                enemiesKilled.add(enemy);
            }
        }
        // remove collected coins from the board
        enemies.removeAll(enemiesKilled);
    }


//    JFrame createMap;
//      Tiles tile;
//    ImageIcon grass = new ImageIcon("grass.png");
//    JPanel field;


//    public CreateMap() {

//        createMap = new JFrame("Ayanot Wars");
//        createMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        createMap.setSize(900, 900);
//        createMap.setResizable(false);
//        createMap.setLocationRelativeTo(null);
//        createMap.setLayout(null);

//        field = new JPanel[30];
//        for ( int i = 0; i < field.length; i++){
//            field[i] = new JPanel(String.valueOf(i));
//            field[i].add()
//        }
//        field = new JPanel();
//        for (int i = 0; i < 30; i++) {
//            for (int n = 0; n < 30; n++) {
//                field.add(new JLabel(grass));
//
//            }
//        }

//        createMap.add(field);
//        createMap.setVisible(true);

//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }

}




