package metDataStructure;

import java.util.Scanner;

public class Graph {
    int G[][], vNode, vList[];
        void createGraph(int size){
        G = new int[size][size];
        vNode = size;
        vList = new int[size];
        Scanner in = new Scanner(System.in);

        for (int scr = 0; scr < vNode; scr++) {
            for (int dest = 0; dest < vNode; dest++) {
                System.out.println("\n Enter value for edge from " + scr + "to" + dest + ":");
                G[scr][dest] = in.nextInt();
            }
        }
    }

    void resetVList() {

        for (int i = 0; i < vNode; i++) {
            vList[i] = 0; //NotVisited
        }
    }


    void DFS(int start) {    //DFS uses Stack

        vList[start] = 1;
        System.out.println(start);

        for (int i = 0; i < vNode; i++) {

            if (G[start][i] == 1 && vList[i] != 1)
                DFS(i);  //using recursion and it is using stack internally
        }
    }

    void BFS(int start) {  //BFS uses Queue

        int Q[], front, rear;

        Q = new int[vNode];
        front = 0;
        rear = -1;

        vList[start] = 1;
        Q[++rear] = start;
        while (front <= rear) {
            int element = Q[front++];
            System.out.println(element);

            for (int i = 0; i < vNode; i++) {
                if (G[element][i] == 1 && vList[i] != 1) {

                    vList[i] = 1;
                    Q[++rear] = i;
                }
            }
        }

    }

    public static void main(String[] args) {

        int ch = 0;
        Graph obj = new Graph();

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n 1.Create Graph \n 2.DFS \n 3.BFS \n 0.Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    Scanner size = new Scanner(System.in);
                    System.out.println("Enter Size: ");
                    int si = size.nextInt();
                    obj.createGraph(si);
                    break;

                case 2:
                    System.out.println("Enter element for search by DFS: ");
                    Scanner d = new Scanner(System.in);
                    int dfs = d.nextInt();
                    obj.DFS(dfs);
                    break;
                case 3:
                    obj.resetVList();
                    break;
                case 4:
                    System.out.println("Enter element for search by BFS: ");
                    Scanner b = new Scanner(System.in);
                    int bfs = b.nextInt();
                    obj.BFS(bfs);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }
        while (ch != 0);
    }
}

