import java.util.List;

public class Main {

    public static void main(String[] args){
        Labyrinth lab = Labyrinth.createSmallLabyrinth();
        List<Coord> coords = LabyrinthSolver.backTracking(lab, new Coord(0, 0));

        for(Coord coord: coords) {
            System.out.println(coord);
        }
    }
}
