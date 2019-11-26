package CreateLjbGraph;

import java.util.Scanner;

public class IntLinkGraph {
	GraphNode[] graph; //�����洢ͼ���ڽӱ�������
	Scanner read=new  Scanner(System.in);
	//����ͼ���ڽӱ�
	void  CreateLinkGraph()
	{
		int i,e,x,y ,vn;
		GraphNode  p,q;
		System.out.println("\n\t�����붥������");
		vn =read.nextInt();
		graph = new GraphNode[vn+1];//���ݶ�����������ӱ�Ķ�������
		for(i=1;i<=vn;i++)
		{
			graph[i]=new  GraphNode(i);;
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
    int GetVn()
    {
    	return graph.length-1;
    }
	//��ʾͼ���ڽӾ�����
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
