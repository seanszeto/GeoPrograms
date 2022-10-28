public class MickeyFilter extends World {

    public int red;
    public int blue;
    public int green;

    public void go(){
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        // System.out.println(plane.howMuchRed());

        filterPants();
        filter();
    }

    public void filter(){
        for(int row = 500; row < 680; row = row + 1){ // rows
            for(int column = 50; column < 430; column = column + 1 ) { // columns
                plane.teleport(column, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (blue < 200 & red > 200 & green > 190) {
                    plane.setPixelColor(255, 192, 203);
                }
            }
        }
    }

    public void filterPants(){
        for(int row = 330; row < 500; row = row + 1) { // rows
            for (int column = 130; column < 300; column = column + 1) {
                plane.teleport(column, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (blue < 50 & red > 160 & green < 20){
                    plane.setPixelColor(60, 179, 113);
                }
            }
        }
    }
}
