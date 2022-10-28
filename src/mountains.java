public class mountains extends World{

    public int red;
    public int blue;
    public int green;

    public void go(){

        plane.pausetime = 1;
        plane.showBackGround();
        hills();
        trees();

    }

    public void hills(){
        plane.teleport(100, 400);
        plane.isTrail = true;
        plane.startingAngle(0);

        int randomWidth = plane.random(5,10);
        plane.trailWidth = randomWidth;

        int randomHeight = plane.random(100,200);
        for (int row = 0; row < 5; row = row + 1) {
            for (int x = 0; x < 3; x = x + 1) {
                plane.setColor(255, 255, 255);
                plane.move(randomHeight);
                plane.turn(120);
            }
            plane.move(randomHeight);
        }
    }

    public void trees(){
        plane.teleport(100,600);
        plane.trailWidth = 7;



        for (int row = 0; row < 5; row = row + 1) {
            int randomRed = plane.random(0,255);
            int randomGreen = plane.random(0,255);
            int randomBlue = plane.random(0,255);

            plane.setColor(randomRed,randomGreen,randomBlue);
            if (randomRed > 50 & randomBlue > 50 & randomGreen > 190) {
                plane.setColor(0, 153, 0);
            }
            plane.isTrail = true;
            plane.startingAngle(0);

            int randomLength = plane.random(100, 200);
            plane.move(randomLength / 2);
            plane.turn(104.478);
            plane.move(randomLength);
            plane.turn(151.004);
            plane.move(randomLength);
            plane.turn(104.478);
            plane.move(randomLength / 4);
            plane.turn(270);
            plane.move(randomLength / 2);
            plane.turn(180);
            plane.move(randomLength / 2);
            plane.turn(270);
            plane.move(randomLength / 4);
        }
    }
}
