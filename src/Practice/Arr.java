package Practice;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.util.Arrays;
import java.util.Stack;

public class Arr {



    public static void workingWithMaps(){
        Map<Integer, User> maps = new HashMap<>();
        maps.put(1,new User( "Mfon"));
        maps.put(2,new User("Paul"));
        maps.put(3,new User("Blessing"));
        System.out.println(maps.size());
        System.out.println(maps.get(1));
        System.out.println(maps.keySet());
        System.out.println(maps.entrySet());
        maps.entrySet().forEach(System.out::println);

     }
    static record User(String name){

    }

    public static void setBall(){
        Set<Ball> listOfBalls = new HashSet<>();
        listOfBalls.add(new Ball("Blue"));
        listOfBalls.add(new Ball("Yellow"));
        listOfBalls.add(new Ball("Yellow"));
        listOfBalls.add(new Ball("Purple"));
        listOfBalls.add(new Ball("Red"));
        listOfBalls.forEach(System.out::println);
        System.out.println(listOfBalls.size());
        System.out.println(listOfBalls.stream());
    }
    static  record  Ball(String color){

    }


    public static void ticTacTok(){
        char[][] board = new char[3][3];
        for(int index = 0; index < board.length; index++){
            for (int indexTwo = 0; indexTwo < board.length; indexTwo++){

            }
        }
        System.out.println(Arrays.deepToString(board));
    }
    public static void stackWork(){
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
    }
    public static void queueWork(){
        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add((new Person("Mfon", 22)));
        superMarket.add((new Person("Alex", 40)));
        superMarket.add((new Person("Paul", 19)));
        superMarket.add((new Person("Blessing", 24)));

        System.out.println(superMarket.size());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.size());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.poll());

    }
    static record Person(String name, int age){


    }

    public static void LinkedList(){
        LinkedList<Person> link = new LinkedList<>();
        link.add(new Person("Mfon", 22));
        link.add(new Person("Blessing", 24));
        link.add(new Person("Paul", 17));
        link.add(new Person("GoodLuck", 16));
        ListIterator personListIterator = link.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    public static void main(String[] args) {
        ticTacTok();
        stackWork();
        LinkedList();
        setBall();
        workingWithMaps();


        /**int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index] + " ");
        }
        for (int index = numbers.length-1; index >= 0; index--){
            System.out.println(numbers[index]);
        }

        //using enhance for loop

        for(int number : numbers){
            System.out.println(number);
        }

       //Arrays.stream(numbers).forEach(System.out::println);*/

    }
}
