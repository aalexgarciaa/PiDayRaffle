import java.util.*;

public class PiDayRaffle{
    public static void main (String [] args){
        //Variables Needed
        String Student;
        int Number_recited;
        int counter = 0;
        String answer;
        String winner;
        int numberChosen;

        //Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //Creating an ArrayList
        List<String> studentList = new ArrayList<String>();


        do{

            //Asking for Student First and Last Name
            System.out.println("Please enter student's first and last name: ");
            Student = input.nextLine();

            System.out.println("How many numbers were they able to recite?");
            Number_recited = input.nextInt();

            //Adding Student to list x amount of times where x is the number or numbers in pi recited.
            for(int i=0; i <Number_recited; i++){
                studentList.add(counter+i,Student);     //counter+i represents last index of previous student + i
            }

            //adding placeholder to counter
            counter =+ Number_recited;

            System.out.println("Do you want to enter another students information? yes or no?");
            answer = input.next();

            //Clearing scanner
            input.nextLine();

        }while(answer.equals("yes"));

        numberChosen = randomNumber(studentList.size());

        /*
         * Choosing Winner
         */
        winner = studentList.get(numberChosen);

        System.out.println("Congratulations to : " + winner + " !!!");

        //closing scanner
        input.close();

        
    }

    /*
     * randomNumber method chooses a randome number that will be
     *  used to select random winner from studentList
     */
    public static int randomNumber(int max){

        Random random = new Random();

        int numberChosen = random.nextInt(max);

        System.out.println(numberChosen);

        return numberChosen;
    }
}