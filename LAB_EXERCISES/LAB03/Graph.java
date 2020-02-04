import java.util.*; 
  
public class Graph 
{ 
    int Num; 
    LinkedList<Integer> graph[]; 
    
    public Graph(int Num) 
    { 
        this.Num = Num; 
        graph = new LinkedList[Num]; 
    
        for(int i = 0; i < Num ; i++)
        { 
                graph[i] = new LinkedList<>(); 
        } 
    } 
    
    public void addEdge(int from, int to) 
    { 
        graph[from].add(to); 
        graph[to].add(from); 
    } 
       
    public void print(Graph g) 
    {        
        for(int i = 0; i < g.Num; i++) 
        { 
            System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer node: g.graph[i])
            { 
                System.out.print(" -> "+node); 
            } 
            System.out.println("\n"); 
        } 
    } 

    public void depthFirstTraversal(int dft) 
    { 
        Vector<Boolean> visited = new Vector<Boolean>(Num); 
        for (int i = 0; i < Num; i++) 
        visited.add(false); 
          
        Stack<Integer> stack = new Stack<>(); 
        stack.push(dft); 
              
        while(stack.empty() == false) 
        { 
            dft = stack.peek(); 
            stack.pop(); 
                  
            if(visited.get(dft) == false) 
            { 
                System.out.print(dft + " "); 
                visited.set(dft, true); 
            } 
                  
            Iterator<Integer> itr = graph[dft].iterator(); 
                  
            while (itr.hasNext())  
            { 
                int v = itr.next(); 
                if(!visited.get(v)) 
                stack.push(v); 
            }                   
        } 
    }

    public void breadthFirstTraversal(int bft) 
    { 
        boolean visited[] = new boolean[Num]; 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        visited[bft]=true; 
        queue.add(bft); 
  
        while (queue.size() != 0) 
        { 
            bft = queue.poll(); 
            System.out.print(bft+" "); 
  
            Iterator<Integer> itr = graph[bft].listIterator(); 
            while (itr.hasNext()) 
            { 
                int n = itr.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 

    public void shortPath(int s, int dest, int v)
    {
        int[] pred = new int[v];
        int[] dist = new int[v];

        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1)
        {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        System.out.print("Shortest path length is : ");
        System.out.print(dist[dest]);
        System.out.print("\nPath is::\n");
        for (int i = path.size() - 1; i >= 0; i--)
        {
            System.out.print(path.get(i));
            System.out.print(" ");
        }
    } 
} 
     
