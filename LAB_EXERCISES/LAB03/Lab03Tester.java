public class Lab03Tester
{
    public static void main(String[] args)  
    { 
        int v = 8;
        Graph g = new Graph(v); 
          
        g.addEdge(0, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 2); 
        g.addEdge(3, 4); 
        g.addEdge(3, 7);
        g.addEdge(4, 5);
        g.addEdge(4, 6); 
        g.addEdge(4, 7); 
        g.addEdge(5, 6); 
        g.addEdge(6, 7); 
           
        int s = 0;
        int dest = 7;
        
        g.shortPath(s, dest, v);

        return;
    
    } 
} 
