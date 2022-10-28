public class Landscape extends World{

    public void go(){
        System.out.println("This will be printed to the  window. ");
        // plane.teleport(0, 0);
        plane.showBackGround();

        for (int y=0;y<2;y=y+1) {
            triangle();
        }
        int randomLength = plane.random(100, 200);
        plane.move(randomLength/2);
        plane.turn(270);
        plane.move(randomLength);
        plane.turn(90);
        plane.move(randomLength);
        plane.turn(90);
        plane.move(randomLength);
    }

    public void tri(){
        for (int y=0;y<2;y=y+1) {
            triangle();
        }
    }

public void triangle(){
    plane.startingAngle(0);
    plane.isTrail = true;
    int randomNumber = plane.random(5,10);
    plane.trailWidth = randomNumber;

    int randomLength = plane.random(100,200);

    for (int x = 0; x < 3; x = x + 1) {
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.move(randomLength);
        plane.turn(120);
}


    }
}
