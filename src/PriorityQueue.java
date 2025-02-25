public class PriorityQueue {
    NodeInfo[] pq = new NodeInfo[3];
    int rp = 0;
    int fp = 0;

    int maxsize = 3;
    int sz = 0;

    public void printqueue() {
        int i, j;

        j = fp;
        System.out.printf("Queue Contents: ");
        for (i = 0; i < sz; i++) {
            System.out.printf(pq[j].n+" "+pq[j].w+",   ");
            j++;
            if (j == maxsize) {
                j = 0;
            }
        }
        System.out.println();
        System.out.printf("Pointer Values: Front "+fp+",  Rear "+rp+",  Size "+sz);
        System.out.println();
        System.out.println();
    }
    public boolean enqueue(NodeInfo newnode) {
        NodeInfo tempnode = new NodeInfo("", 0);
        int i, j;
        boolean done;

        if (sz == maxsize) {
            return false;
        }
        else {
            sz++;
            pq[rp] = new NodeInfo("",0);
            pq[rp].n = newnode.n;
            pq[rp].w = newnode.w;
            i = rp;
            done = false;
            while (!(done)) {
                if (i == 0) {
                    j = maxsize - 1;
                }
                else {
                    j = i - 1;
                }
                if ((i == fp)||(pq[i].w >= pq[j].w)) {
                    done = true;
                }
                else {
                    tempnode.n = pq[i].n;
                    tempnode.w = pq[i].w;
                    pq[i].n = pq[j].n;
                    pq[i].w = pq[j].w;
                    pq[j].n = tempnode.n;
                    pq[j].w = tempnode.w;
                    if (i > 0) {
                        i--;
                    }
                    else {
                        i = maxsize - 1;
                    }
                }

            }

            rp++;
            if (rp == maxsize) {
                rp = 0;
            }

            return true;
        }
    }

    public NodeInfo dequeue() {
        NodeInfo tempnode = new NodeInfo("",0);
        if (sz == 0) {
            tempnode.n = ".";
            tempnode.w = -1;
        }
        else {
            sz--;
            tempnode.n = pq[fp].n;
            tempnode.w = pq[fp].w;
            fp++;
            if (fp == maxsize) {
                fp = 0;
            }
        }
        return tempnode;
    }
}
