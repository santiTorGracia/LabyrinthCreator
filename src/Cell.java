/**
 *
 */
public class Cell {
    /** */
    public enum Direction{LEFT, RIGHT, UP, DOWN}

    private boolean[] walls = new boolean[4];
    /** Indicates whether this Cell represents the end of the maze.*/
    private boolean isEnd;

    public Cell() {
        for(Direction dir: Direction.values()) {
            walls[dir.ordinal()] = false;
        }
        isEnd = false;
    }

    /**
     * Returns whether there is a wall in the {@see direction} we are looking at.
     * @param direction specifies the direction we are looking at.
     * @return true if there is a wall, false otherwise
     */
    public boolean hasWall(Direction direction){
        return walls[direction.ordinal()];
    }

    /**
     * Adds a wall in the specified direction. // Executing {@link Cell#hasWall(Direction) hasWall(direction)}
     * will return true.
     * @param direction the direction in which we will add a wall.
     */
    protected void setWall(Direction direction) {
        walls[direction.ordinal()] = true;
    }

    public boolean isEnd() {
        return isEnd;
    }

    protected void setEnd() {
        isEnd = true;
    }
}
