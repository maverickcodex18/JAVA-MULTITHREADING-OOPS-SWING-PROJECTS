
public class hollowPyramidStar {
    public static void main(String[] args) {

        System.out.println("Chitransh Agrawal");
        System.out.println("22115026");
        int height=5;
        int totalSpacePerRow=1+2*(height-1);


        //for loop
        System.out.println(" ".repeat((totalSpacePerRow-1)/2)+"*"+" ".repeat((totalSpacePerRow-1)/2));

        for (int i = 1; i < height-1; i++) {
            int noOfstars=1+2*i;
            int blankSpace=totalSpacePerRow-noOfstars;
            System.out.println(" ".repeat(blankSpace/2)+"*"+" ".repeat(noOfstars-2)+"*"+" ".repeat(blankSpace/2));

        }
        System.out.println("*".repeat(totalSpacePerRow));




        //while
        int i=0;
        System.out.println(" ".repeat((totalSpacePerRow-1)/2)+"*"+" ".repeat((totalSpacePerRow-1)/2));

        while(i++<height-2){
            int noOfstars=1+2*i;
                        int blankSpace=totalSpacePerRow-noOfstars;
                        System.out.println(" ".repeat(blankSpace/2)+"*"+" ".repeat(noOfstars-2)+"*"+" ".repeat(blankSpace/2));
        }
        System.out.println("*".repeat(totalSpacePerRow));


        //do while
        i=1;
        System.out.println(" ".repeat((totalSpacePerRow-1)/2)+"*"+" ".repeat((totalSpacePerRow-1)/2));
        do{
            int noOfstars=1+2*i;
                        int blankSpace=totalSpacePerRow-noOfstars;
                        System.out.println(" ".repeat(blankSpace/2)+"*"+" ".repeat(noOfstars-2)+"*"+" ".repeat(blankSpace/2));
        }while(i++<height-2);
        System.out.println("*".repeat(totalSpacePerRow));

    }
}
