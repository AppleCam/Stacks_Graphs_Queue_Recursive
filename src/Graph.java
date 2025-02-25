public class Graph {

    public int numNodes;
    char []Nodes;
    int [][]Matrix;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        this.Nodes = new char[numNodes];
        this.Matrix = new int[numNodes][numNodes];
    }

    public void CreateMatrix(int row, int col) {
        for (int i = 0; i < numNodes; i++) {
            this.Nodes[i] = (char) ('A' + i);


        }
        for (int i = 0; i < numNodes; i++) {
            this.Matrix[i][col] = i;

        }
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                this.Matrix[i][j] = i + j;

            }
        }

    }

    public void PrintMatrix() {
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                System.out.print(this.Matrix[i][j] + " ");
               // System.out.println("\n");

            }

        }

    }

}
