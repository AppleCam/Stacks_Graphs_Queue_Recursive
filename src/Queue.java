public class Queue {
/// Linear Queue
    int front;
    int rear;
    int size;
    char[] array;

    public Queue(String phrase) {
        this.size = phrase.length();
        this.front = 0;
        this.rear = -1;
        this.array = new char[this.size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(char character) {
        if (front <= rear) {
            array[rear] = character;
            rear++;
        } else {
            System.out.println("Queue is full");
        }

    }

    public char dequeue() {
        if (front >= rear) {
            front--;
            return array[front];
        } else {
            System.out.println("Queue is empty");
        }
        return 0;
    }

    public int front() {
        return this.front;

    }

    public int rear() {
        return this.rear;
    }





}
