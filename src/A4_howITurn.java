

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(00);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(88, 255, 88);
        plane.move(100);
        plane.turn(120);
        plane.setColor(153, 204, 255);
        plane.move(100);
        plane.turn(120);
        plane.setColor(255,255,51);
        plane.move(100);


    }


}
