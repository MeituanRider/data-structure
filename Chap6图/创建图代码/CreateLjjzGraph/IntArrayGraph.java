package CreateLjjzGraph;

import java.util.Scanner;

public class IntArrayGraph {
	final int VNUM = 10;//声明数组的最大行列数
	int [][] graph=new int[VNUM][VNUM]; //声明存储图的邻接矩阵
	Scanner read=new  Scanner(System.in);
	//创建图的邻接矩阵
	void  CreateArrayGraph()
	{
		int i,j,e,x,y;
		for(i=1;i<VNUM;i++)
			for(j=1;j<VNUM;j++)
				graph[i][j]=0;
		System.out.println("\n\t请输入边数：");
		e =read.nextInt();
		System.out.println("\n\t请输入这些边的两个顶点：");
		for(i=1;i<=e;i++)
		{
			x=read.nextInt();
			y=read.nextInt();
			graph[x][y]=1;
			graph[y][x]=1;
		}
	}

	//显示图的邻接矩阵
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
