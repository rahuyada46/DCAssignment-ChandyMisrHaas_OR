package chandymisrahass_or_algorithm;

import java.util.*;
class QueryMessage
{


    public  int initiator=0;
    public  int sender=0;
    public  int receiver=0;
    public QueryMessage(int i,int j,int k)  
    {
        initiator=i;
        sender=j;
        receiver=k;
        
    }
    public String toString()
    {
        return "("+initiator+","+sender+","+receiver+")";
    }
 }

class ReplyMessage
{


    public  int initiator=0;
    public  int sender=0;
    public  int receiver=0;
    public ReplyMessage(int i,int j,int k)  
    {
        initiator=i;
        sender=j;
        receiver=k;
        
    }
    public String toString()
    {
        return "("+initiator+","+sender+","+receiver+")";
    }
 }
public class chandymisrahass_or {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int graph[][];
        boolean isDeadlock=false;
        boolean wait;
        System.out.println("Enter the number of processes - Please enter Integer value::");
        int n=sc.nextInt();
        
        graph=new int[n][n];
        System.out.println("Enter the wait for graph: "); 
        System.out.println("Since there are: " + n + "Processes so enter : " +n*n + " times::");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
                
            }
        }
        
        System.out.println("the wait for graph is:");
        new chandymisrahass_or().Display(graph);
        System.out.println("Enter the process initiating the diffusion computation"); 
        int init=sc.nextInt();
        
        //Initiate Probe
        System.out.println("Initiating deadlock detection ");
        List<QueryMessage> mess_list=new ArrayList<QueryMessage>();
        int num=0;
        
        List<ReplyMessage> mess_list1=new ArrayList<ReplyMessage>();
        int num1=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   
                if(graph[i][j]==1)
                {
                    QueryMessage m=new QueryMessage(init,i,j);
                    mess_list.add(m);
                    num+=1;
                    wait = true;
                }
                else {
                	ReplyMessage m=new ReplyMessage(i,init,j);
                    mess_list1.add(m);
                	
                }
            }
        }
        System.out.println(mess_list); 
        if (wait = true)
        	num-=1;
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
               
            	if(mess_list.get(i).initiator==mess_list.get(j).receiver) 
                    isDeadlock=true;
            }
        }
        sc.close(); // Close scanner
        if(isDeadlock)
            System.out.println("The Deadlock has been detected..."); //Deadlock detected
        else
            System.out.println("No Deadlock has been detected...");
        
        
       }
   
    void Display(int[][] mat)
    {
        int n=mat[0].length;
        int m=mat.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}