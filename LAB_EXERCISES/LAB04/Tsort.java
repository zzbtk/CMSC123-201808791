import java.io.*; 
import java.util.*; 
  
public class Tsort 
{ 
    private int V;   
    private LinkedList<Integer> graph[];
  
    public Tsort(int v) 
    { 
        V = v; 
        graph = new LinkedList[v]; 
        for (int i=0; i<v; ++i)
        {
            graph[i] = new LinkedList();
        } 
    } 
   
    public void addEdge(int v,int w) 
    { 
        graph[v].add(w); 
    } 
  
    public void topologicalSort() 
    { 
        Stack s = new Stack(); 
        boolean visited[] = new boolean[V]; 
        
        for (int i = 0; i < V; i++)
        { 
            visited[i] = false; 
        }

        for (int i = 0; i < V; i++) 
        {
            if (visited[i] == false)
            { 
                topoSort(i, visited, s); 
            }
        }
        
        while (s.empty()==false)
        {
            System.out.print(s.pop() + " ");
        } 
    }
} 