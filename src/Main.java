import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stacks and Queues or Graphs or Recursive Algorithm or Fibonacci or Triangle Numbers or Priority queue with Dijkstra's");
        String use = scanner.nextLine();

        if (use.equals("Stacks and Queues") || use.equals("stacks and queues")) {

            System.out.println("Enter your phrase: ");
            String phrase = scanner.nextLine();

            System.out.println("Do you want to use a stack or queue? ");
            use = scanner.nextLine();

            if (use.equals("stack") || use.equals("Stack")) {
                Stack stack = new Stack(phrase);
                for (int i = 0; i < phrase.length(); i++) {
                    stack.push(phrase.charAt(i));
                }

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop() + ", ");
                }

                System.out.println();

                System.out.println("Do you want to continue? (Y/N) ");
                String answer = scanner.nextLine();
                if (answer.equals("N")) {
                    System.out.println("Goodbye!");
                    System.exit(0);

                } else {
                    System.out.println("Do you want to use Stack or Queue? ");
                    use = scanner.nextLine();
                }
            } else if (use.equals("queue") || use.equals("Queue")) {
                Queue queue = new Queue(phrase);
                for (int i = 0; i < phrase.length(); i++) {
                    queue.enqueue(phrase.charAt(i));
                }
                while (!queue.isEmpty()) {
                    System.out.print(queue.dequeue() + ", ");

                }
                System.out.println();

                System.out.println("Do you want to continue? (Y/N) ");
                String answer = scanner.nextLine();

                if (answer.equals("N")) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Do you want to use Stack or Queue? ");
                    use = scanner.nextLine();
                }

            }
        } else if (use.equals("graphs")) {
            Graph graph = new Graph(15);
            graph.CreateMatrix(10, 10);
            graph.PrintMatrix();

        } else if (use.equals("recursive algorithm") || use.equals("Recursive Algorithm")) {

            System.out.println("Enter the factorial you want to calculate: ");

            int number = scanner.nextInt(); // Change this to calculate the factorial of a different number
            long factorial = 1;

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is: " + factorial);
            }


        }else if(use.equals("Fibonacci")||use.equals("fibonacci")) {
            int num1 = 1, num2 = 1;
            System.out.println("1, 1");

            for (int i = 1; i <= 16; i++) {
                num1 += num2;
                num2 += num1;
                System.out.println(num1 + ", " + num2);
            }
        } else if (use.equals("Triangle Numbers")||use.equals("triangle numbers")) {
            int input = scanner.nextInt();
            int[] triangleNum = {0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153, 171, 190, 210, 231, 253, 276, 300, 325, 351, 378, 406, 435, 465, 496, 528, 561, 595, 630, 666};
            if (input >= 0){
                for (int i = 0; i <= 37; i++) {
                    if (triangleNum[i] == input) {
                        System.out.println(triangleNum[i]+ " is a triangle number");
                    } else {
                        System.out.println(input + " is not a triangle number");
                    }
                }
            }
        } else if (use.equals("Priority queue with Dijkstra's")){
            NodeInfo node = new NodeInfo("",0);
            Node[] nodes = new Node[20];
            PriorityQueue pqueue = new PriorityQueue();

            /* HERE'S SOME CODE I WROTE JUST TO TEST THE QUEUE */
            /* YOU DON'T NEED THIS ONCE YOU'VE UNDERSTOOD HOW THE QUEUE WORKS */
            String str = new String();
            str = "";
            while (!(str.equals("q"))) {
                System.out.printf("Enter node name or x to Dequeue: ");
                str = scanner.next();
                if (str.equals("x")) {
                    node = pqueue.dequeue();
                }
                else {
                    node.n = str;
                    System.out.printf("Enter Weight for node "+str+": ");
                    node.w = scanner.nextInt();
                    pqueue.enqueue(node);
                }
                pqueue.printqueue();
            }

            /* DEFINE YOUR GRAPH HERE LIKE THIS */
            nodes[0] = new Node();
            nodes[0].name = "A";
            nodes[0].edges[0] = new NodeInfo("B", 10);
            nodes[0].edges[1] = new NodeInfo("C", 20);
            nodes[0].edges[2] = new NodeInfo("D", 30);
            nodes[0].numedges = 3;

            /* WRITE YOUR DIJKSTRAS ALGORITHM HERE */
            


        }
    }
}
