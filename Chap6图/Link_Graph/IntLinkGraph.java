package Link_Graph;

import java.util.Scanner;

public class IntLinkGraph {
	int []visited;
	GraphNode[] graph; //�����洢ͼ���ڽӱ�������
	Scanner read=new  Scanner(System.in);
	//����ͼ���ڽӱ�
	void  CreateLinkGraph()
	{
		int i,e,x,y ,vn;
		GraphNode  p,q;
		System.out.println("\n\t�����붥������");
		vn =read.nextInt();
		visited = new int[vn+1];
		graph = new GraphNode[vn+1];//���ݶ�����������ӱ�Ķ�������
		for(i=1;i<=vn;i++)
		{
			graph[i]=new  GraphNode(i);
		}
		System.out.println("\n\t�����������");
		e =read.nextInt();
		System.out.println("\n\t��������Щ�ߵ��������㣺");
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
 
 	//��ʾͼ���ڽӱ�
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


	//��ͼG��ȡ����V0�ĵ�һ���ڽӵ�ĵ�ַ,ȡ��������null
	GraphNode firstAdj(int v0)
	{
		return graph[v0].next;
	}

	//��ͼG��ȡ����V0���ڽӵ�w֮�����һ���ڽӵ�,ȡ��������null
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

	//��v0Ϊ����ͼ��һ����ͨ������������ȱ���
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

	//ͼ��������ͨ������������ȱ���
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
	
	
	//ͼ��һ����ͨ�����Ĺ�����ȱ���
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
	
	//ͼ��������ͨ�����Ĺ�����ȱ���
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
