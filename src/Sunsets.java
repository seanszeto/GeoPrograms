public class Sunsets extends World{
    public void go(){
        plane.isTrail=true;
       // plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
       // square(100);
       // square(plane.random(50,75));

        // int randomNumber = plane.random(2,3);
       // if (randomNumber == 1){
            //square(200);
      //  }
       // if (randomNumber == 2){
            //s(100);

    //   }
        for(int x=0;x<5;x=x+1){
            tri();
        }
    }


    public void s(int length){
        plane.teleport(500,200);
        plane.startingAngle(180);
        plane.move(length*20);
        plane.turn(90);
        plane.move(length*20);
        plane.turn(90);
        plane.move(length*20);
        plane.turn(270);
        plane.move(length*20);
        plane.turn(270);
        plane.move(length*20);
;    }


    public void tri(){
        plane.startingAngle(0);
        plane.isTrail = true;
        int randomNumber = plane.random(5,10);
        plane.trailWidth = randomNumber;


        int randomLength = plane.random(100,200);

        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(randomLength);
        plane.turn(120);
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(randomLength);
        plane.turn(120);
        plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
        plane.move(randomLength);
        plane.isTrail = false;
        plane.move(100);
    }

    public void square(int length){
        plane.startingAngle(00);
        plane.isTrail = true;
        plane.trailWidth = 10;
       // plane.setColor(88, 255, 88);
        plane.move(length);
        plane.turn(270);
       // plane.setColor(153, 204, 255);
        plane.move(length);
        plane.turn(270);
       // plane.setColor(255,255,51);
        plane.move(length);
        plane.turn(270);
        plane.move(length);

    }

    public void pickShape(int x){
        if(x==1){
            tri();
        }
    }

    public void sam(){
        plane.move(300);
    }

    public void max(){
        plane.square(100);
        sam();
    }

    public void alexa(){
        plane.triangle(100);
    }
    public void mysquare(int length, int width){
        plane.startingAngle(00);
        plane.isTrail = true;
        plane.trailWidth = 10;
       // plane.setColor(88, 255, 88);
        plane.move(100);
        plane.turn(-90);
       // plane.setColor(153, 204, 255);
        plane.move(100);
        plane.turn(-90);
      //  plane.setColor(255,255,51);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
    }
}


