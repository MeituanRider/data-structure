package CreateLjjzGraph;

import java.util.Scanner;

public class IntArrayGraph {
	final int VNUM = 10;//������������������
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
}
