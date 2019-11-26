package Link_Graph;

import java.util.Scanner;

public class IntLinkGraph {
	int []visited;
	GraphNode[] graph; //声明存储图的邻接表顶点数组
	Scanner read=new  Scanner(System.in);
	//创建图的邻接表
	void  CreateLinkGraph()
	{
		int i,e,x,y ,vn;
		GraphNode  p,q;
		System.out.println("\n\t请输入顶点数：");
		vn =read.nextInt();
		visited = new int[vn+1];
		graph = new GraphNode[vn+1];//根据顶点数分配领接表的顶点数组
		for(i=1;i<=vn;i++)
		{
			graph[i]=new  GraphNode(i);
		}
		System.out.println("\n\t请输入边数：");
		e =read.nextInt();
		System.out.println("\n\t请输入这些边的两个顶点：");
		for(i=1;i<=e;i++)
		{
			x=read.nextInt();
			y=read.nextInt();
			p=new GraphNode(y);
			p.next =graph[x].next;
			graph[x].next =p;
			
			q=new GraphNode(x);
			q.next =graph[y].next;
			graph[y].next =q;
		}
	}
 
 	//显示图的邻接表
	void DisplayLjbGraph(int vn)
	{
		int i,j;
		GraphNode  p;
		for(i=1;i<=vn;i++)
		{
			p=graph[i];
			System.out.print(p.v);
			p=p.next;
			while(p!=null)
			{
				System.out.print("->");
				System.out.print(p.v);
				p=p.next;
			}
			System.out.println();
		}
	}


	//在图G中取顶点V0的第一个邻接点的地址,取不到返回null
	GraphNode firstAdj(int v0)
	{
		return graph[v0].next;
	}

	//在图G中取顶点V0的邻接点w之后的下一个邻接点,取不到返回null
	GraphNode nextAdj( int v0,int w)
	{
		GraphNode  p;
		p=graph[v0].next;
		while(p!=null &&  p.v != w)
		{
			p=p.next;
		}
		return p==null?p:p.next;
	}
    int GetVn()
    {
    	return graph.length-1;
    }

	//以v0为起点的图的一个连通分量的深度优先遍历
	void  DFS(int v0)
	{
		GraphNode w;
		System.out.print(v0);
		visited[v0]=1;
		w=firstAdj(v0);
		while(w!=null)
		{
			if(visited[w.v]!=1)
				DFS(w.v);
			w=nextAdj(v0,w.v);
		}
	}

	//图的所有连通分量的深度优先遍历
	void  travel_dfs()
	{
		int i;
		for(i=1;i<=GetVn();i++)
			visited[i]=0;
		for(i=1;i<=GetVn();i++)
		{
			if(visited[i]!=1)
				DFS(i);
			System.out.print("\n");
		}
	}
	
	
	//图的一个连通分量的广度优先遍历
	void  BFS( int v0)
	{
		GraphNode vnode,wnode;
		IntLinkQueue Query=new IntLinkQueue();
		System.out.print( v0);
		visited[v0]=1;
		Query.EnQueue(new GraphNode(v0));
		while(!Query.QueueEmpty())
		{
			vnode=Query.GetFront();
			Query.OutQueue();			
			wnode=firstAdj(vnode.v);
			while(wnode!=null)
			{
				if(visited[wnode.v]==0)
				{
					System.out.print(wnode.v);
					visited[wnode.v]=1;
					Query.EnQueue(new GraphNode(wnode.v));
				}
				wnode=nextAdj(vnode.v,wnode.v);
			}
		}
	}
	
	//图的所有连通分量的广度优先遍历
	void  travel_bfs( )
	{
		int i;
		for(i=1;i<=GetVn();i++)
			visited[i]=0;
		for(i=1;i<=GetVn();i++)
		{
			if(visited[i]==0)
				BFS(i);
			System.out.print("\n");
		}
	}
}
