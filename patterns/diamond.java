public class diamond {
    public static void main(String args[]){
        System.out.println("Chitransh Agrawal");
        System.out.println("22115026");
        int height=5;
        int totalSpacePerRow=1+2*(height-1);


        //for loop
        for (int i = 0; i < height; i++) {
            int noOfstars=1+2*i;
            int blankSpace=totalSpacePerRow-noOfstars;
            System.out.println(" ".repeat(blankSpace/2)+"*".repeat(noOfstars)+" ".repeat(blankSpace/2));
        }


        //while loop
        int i=-1;
        while(i++<height){
            int noOfstars=1+2*i;
            if(noOfstars>totalSpacePerRow) break;
            int blankSpace=totalSpacePerRow-noOfstars;
            System.out.println(" ".repeat(blankSpace/2)+"*".repeat(noOfstars)+" ".repeat(blankSpace/2));
        }


        //do while
        i=0;
        do{
            int noOfstars=1+2*i;
            if(noOfstars>totalSpacePerRow) break;
            int blankSpace=totalSpacePerRow-noOfstars;
            System.out.println(" ".repeat(blankSpace/2)+"*".repeat(noOfstars)+" ".repeat(blankSpace/2));
        }while(i++<height);
    }
}
