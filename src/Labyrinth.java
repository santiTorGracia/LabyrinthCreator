public class Labyrinth {
    private Cell[][] map;

    private static final int SMALL_SIZE = 5;

    protected Labyrinth(int width, int height){
        map = new Cell[width][height];
    }

    public static Labyrinth createSmallLabyrinth() {
        Labyrinth lab = new Labyrinth(SMALL_SIZE, SMALL_SIZE);
        Cell c = new Cell();

        c.setWall(Cell.Direction.LEFT);
        c.setWall(Cell.Direction.RIGHT);
        lab.map[0][0] = c;
        lab.map[0][0].setWall(Cell.Direction.UP);
        lab.map[0][1] = c;
        lab.map[0][3] = c;
        lab.map[0][4] = c;

        c = new Cell();
        c.setWall(Cell.Direction.LEFT);
        lab.map[0][2] = c;

        c = new Cell();
        c.setWall(Cell.Direction.DOWN);
        c.setWall(Cell.Direction.UP);
        lab.map[1][2] = c;
        lab.map[3][2] = c;

        c = new Cell();
        c.setWall(Cell.Direction.DOWN);
        lab.map[2][2] = c;

        c = new Cell();
        c.setWall(Cell.Direction.UP);
        c.setWall(Cell.Direction.RIGHT);
        c.setWall(Cell.Direction.LEFT);
        lab.map[2][1] = c;

        c = new Cell();
        c.setWall(Cell.Direction.UP);
        c.setWall(Cell.Direction.RIGHT);
        lab.map[4][2] = c;

        c = new Cell();
        c.setWall(Cell.Direction.LEFT);
        c.setWall(Cell.Direction.RIGHT);
        c.setEnd();
        lab.map[4][3] = c;

        return lab;
    }

    public Cell getCell(Coord coord) {
        return map[coord.getX()][coord.getY()];
    }
}
