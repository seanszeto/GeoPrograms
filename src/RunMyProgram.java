

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new mountains() );
        run.planeIcon = "plane.png";
        run.pictureFileName="landscape.jpg";
        run.HEIGHT=1200;
        run.WIDTH=1200;
        run.Refresh();

        //new Thread(run).start();
    }
}
