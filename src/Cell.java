public class Cell {
    public enum Direction{LEFT, RIGHT, UP, DOWN}

    private boolean[] walls = new boolean[4];
    private boolean isEnd;

    public Cell() {
        for(Direction dir: Direction.values()) {
            walls[dir.ordinal()] = false;
        }
        isEnd = false;
    }

    public boolean hasWall(Direction direction){
        return walls[direction.ordinal()];
    }

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
