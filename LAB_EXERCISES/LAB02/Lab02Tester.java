public class Lab02Tester
{
    public static void main(String[] args)  
    { 
         
        AdjListGraph g = new AdjListGraph(5); 
          
        g.addEdge(0, 1); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4); 
              
        System.out.println("Depth First Traversal Unweighted"); 
        g.depthFirstTraversal(1);
        System.out.println("\nBreadth First Traversal Unweighted");
        g.breadthFirstTraversal(1); 
    } 
} 
