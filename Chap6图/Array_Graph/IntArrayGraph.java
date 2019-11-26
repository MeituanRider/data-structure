package Array_Graph;

import java.util.Scanner;

public class IntArrayGraph {
	final int VNUM = 10;//������������������
	int []visited = new int[VNUM];
	int [][] graph=new int[VNUM][VNUM]; //�����洢ͼ���ڽӾ���
	Scanner read=new  Scanner(System.in);
	//����ͼ���ڽӾ���
	void  CreateArrayGraph()
	{
		int i,j,e,x,y;
		for(i=1;i<VNUM;i++)
			for(j=1;j<VNUM;j++)
				graph[i][j]=0;
		System.out.println("\n\t�����������");
		e =read.nextInt();
		System.out.println("\n\t��������Щ�ߵ��������㣺");
		for(i=1;i<=e;i++)
		{
			x=read.nextInt();
			y=read.nextInt();
			graph[x][y]=1;
			graph[y][x]=1;
		}
	}

	//��ʾͼ���ڽӾ���
	void DisplayArrayGraph()
	{
		int i,j;
		for(i=1;i<VNUM;i++)
		{
			for(j=1;j<VNUM;j++)
				System.out.print(graph[i][j]);
			System.out.println();
		}
	}

	//��ͼG��ȡ����V0�ĵ�һ���ڽӵ�,ȡ��������-1
	int firstAdj(int v0)
	{
		int i, v=-1;
		for(i=0;i<VNUM;i++)
		{
			if(graph[v0][i]==1)
			{
				v=i;
				break;
			}
		}
		return v;
	}

	//��ͼG��ȡ����V0���ڽӵ�w֮�����һ���ڽӵ�,ȡ��������-1
	int nextAdj( int v0,int w)
	{
		int i, v=-1;
		for(i=w+1;i<VNUM;i++)
		{
			if(graph[v0][i]==1)
			{
				v=i;
				break;
			}
		}
		return v;
	}

	//��v0Ϊ����ͼ��һ����ͨ������������ȱ���
	void  DFS(int v0)
	{
		int w;
		System.out.print(v0);
		visited[v0]=1;
		w=firstAdj(v0);
		while(w!=-1)
		{
			if(visited[w]!=1)
				DFS(w);
			w=nextAdj(v0,w);
		}
	}

	//ͼ��������ͨ������������ȱ���
	void  travel_dfs()
	{
		int i;
		for(i=0;i<VNUM;i++)
			visited[i]=0;
		for(i=0;i<VNUM;i++)
		{
			if(visited[i]!=1)
				DFS(i);
			System.out.print("\n");
		}
	}
	
	
	//ͼ��һ����ͨ�����Ĺ�����ȱ���
	void  BFS( int v0)
	{
		int v,w;
		IntArrarQueue Query=new IntArrarQueue();
		System.out.print( v0);
		visited[v0]=1;
		Query.EnQueue(v0);
		while(!Query.QueueEmpty())
		{
			v=Query.GetFront();
			Query.OutQueue();			
			w=firstAdj(v);
			while(w!=-1)
			{
				if(visited[w]==0)
				{
					System.out.print(w);
					visited[w]=1;
					Query.EnQueue(w);
				}
				w=nextAdj(v,w);
			}
		}
	}
	
	//ͼ��������ͨ�����Ĺ�����ȱ���
	void  travel_bfs( )
	{
		int i;
		for(i=1;i<VNUM;i++)
			visited[i]=0;
		for(i=1;i<VNUM;i++)
		{
			if(visited[i]==0)
				BFS(i);
			System.out.print("\n");
		}
	}
}
