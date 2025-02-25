public class Stack {
    int maxSize;
    int pointer;
    char[] array;

    public Stack(String phrase) {
        this.maxSize = phrase.length();
        array = new char[maxSize];
        pointer = 0;
    }

    public void push(char character) {
        if (pointer < maxSize) {
            array[pointer] = character;
            pointer++;
        } else {
            System.out.println("Stack is full");
        }
    }

    public char pop() {
        if (pointer > 0) {
            pointer--;
            return array[pointer];
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }

    public char peek() {
        if (pointer > 0) {
            return array[pointer - 1];
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }

    public int size() {
        return pointer; // Return the current size of the stack
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean contains(char character) {
        for (int i = 0; i < pointer; i++) {
            if (array[i] == character) {
                return true;
            }
        }
        return false;
    }


}
