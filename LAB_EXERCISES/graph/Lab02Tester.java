public class Lab02Tester
{
    public static void main(String[] args)  
    { 
         
        AdjListGraph g = new AdjListGraph(5); 
          
        g.addEdge(3, 4); 
        g.addEdge(4, 2); 
        g.addEdge(2, 3); 
        g.addEdge(4, 1); 
        g.addEdge(3, 0); 
              
        System.out.println("Depth First Traversal"); 
        g.depthFirstTraversal(4);
        System.out.println("\nDepth First Traversal");
        g.breadthFirstTraversal(4); 
    } 
} 
