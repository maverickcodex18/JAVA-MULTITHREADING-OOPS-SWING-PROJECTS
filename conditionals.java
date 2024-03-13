public class conditionals {
    public static void main(String args[]){


    System.out.println("Name: Chitransh Agrawal");
    System.out.println("Roll No: 22115026");


    //if else if else


        int month=1;
    if(month==1||month==2||month==12||month==11){
        System.out.println("Winter");
    }
    else if(month==3||month==4||month==5||month==6){
        System.out.println("Summer");
    }
    else System.out.println("Monsoon");



    //switch case

    switch(month){
        case 1:
        case 11:
        case 12:
        case 2:
            System.out.println("Winter");
            break;

        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Summer");
            break;
        default:
            System.out.println("Monsoon");

    }


    //switch case "stings"
    String option="upper";

    switch(option){
        case "lower":
            System.out.println("hey");
            break;
        case "upper":
            System.out.println("HEY");
    }


        //can do NESTED SWITCH


    }








}
