package task6;

public class Algorithm {
    public void moskow(int[] tickets) {
        int lucky = 0, unLucky = 0;
        int one, two, three, four, five, six;
        for (int i = 0; i < tickets.length; i++) {
            one = (tickets[i] / 1000) / 100;
            two = ((tickets[i] / 1000) / 10) % 10;
            three = (tickets[i] / 1000) % 10;
            four = (tickets[i] % 1000) / 100;
            five = ((tickets[i] % 1000) / 10) % 10;
            six = (tickets[i] % 1000) % 10;
            System.out.print(i+1 + "\t" + one + " " + two + " " + three + " " + four + " " + five + " " + six);
            if (one + two + three == four + five + six) {
                lucky++;
                System.out.println(" - Lucky ticket");
            } else {
                unLucky++;
                System.out.println();
            }
        }
        System.out.println("The number of lucky tickets for the Moscow algorithm: " + lucky + "\n");
    }

    public boolean dividesByTwo(int a){
        return (a%2==0);
    }

    public void piter(int[] tickets) {
        int lucky = 0, unLucky = 0;
        int one, two, three, four, five, six;
        for (int i = 0; i < tickets.length; i++) {
            one = (tickets[i] / 1000) / 100;
            two = ((tickets[i] / 1000) / 10) % 10;
            three = (tickets[i] / 1000) % 10;
            four = (tickets[i] % 1000) / 100;
            five = ((tickets[i] % 1000) / 10) % 10;
            six = (tickets[i] % 1000) % 10;
            System.out.print(i+1 + "\t" + one + " " + two + " " + three + " " + four + " " + five + " " + six);
            int evenNumber = 0, oddNumber = 0;

            if(dividesByTwo(one))
            evenNumber += one;
            else
                oddNumber +=one;

            if(dividesByTwo(two))
                evenNumber += two;
            else
                oddNumber +=two;

            if(dividesByTwo(three))
                evenNumber += three;
            else
                oddNumber +=three;

            if(dividesByTwo(four))
                evenNumber += four;
            else
                oddNumber +=four;

            if(dividesByTwo(five))
                evenNumber += five;
            else
                oddNumber +=five;

            if(dividesByTwo(six))
                evenNumber += six;
            else
                oddNumber +=six;

            if (evenNumber == oddNumber) {
                lucky++;
                System.out.println(" - Lucky ticket");
            } else {
                unLucky++;
                System.out.println();
            }
        }
        System.out.println("The number of lucky tickets for the Piter algorithm: " + lucky + "\n");
    }

}
