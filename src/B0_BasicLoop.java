public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 5;

        // for (int row = 0; row < 9; row = row + 1) {
        //   squareRow(row);
        squareGrid();



    }

    public void squareRow(int row) {
        for (int col = 0; col < 8; col = col + 1) {
            plane.teleport( col * 100, row * 100);
            System.out.println(col);
            plane.isTrail = true;
            plane.square(100);
            plane.setColor(row * 30, 100, col * 30);
        }
    }

    public void squareGrid() {
        for (int row = 0; row < 9; row = row + 1) {
            squareRow(row);
        }
    }


}



