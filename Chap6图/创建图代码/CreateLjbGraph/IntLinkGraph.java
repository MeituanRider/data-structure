package CreateLjbGraph;

import java.util.Scanner;

public class IntLinkGraph {
	GraphNode[] graph; //声明存储图的邻接表顶点数组
	Scanner read=new  Scanner(System.in);
	//创建图的邻接表
	void  CreateLinkGraph()
	{
		int i,e,x,y ,vn;
		GraphNode  p,q;
		System.out.println("\n\t请输入顶点数：");
		vn =read.nextInt();
		graph = new GraphNode[vn+1];//根据顶点数分配领接表的顶点数组
		for(i=1;i<=vn;i++)
		{
			graph[i]=new  GraphNode(i);;
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
    int GetVn()
    {
    	return graph.length-1;
    }
	//显示图的邻接矩阵器
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
}
