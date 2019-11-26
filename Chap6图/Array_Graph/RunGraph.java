package Array_Graph;

import java.util.Scanner;

public class RunGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		IntArrayGraph  graph= new  IntArrayGraph();
		while (true) {
			System.out.println("********图的遍历**********");
			System.out.println("**     1------------创建邻接矩阵   **");
			System.out.println("**     2------------显示邻接矩阵   **");
			System.out.println("**     3------------深度优先遍历   **");
			System.out.println("**     4------------广度优先遍历   **");
			System.out.println("**     0------------退出系统          **");
			System.out.println("请输入你的选择：");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				graph.CreateArrayGraph();
				System.out.println("创建完成");
				break;
			case 2:
				graph.DisplayArrayGraph();
				System.out.println("显示完成");
				break;
			case 3:
				graph.travel_dfs();
				System.out.println("深度优先遍历完成");
				break;
			case 4:
				graph.travel_bfs();
				System.out.println("广度优先遍历完成");
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}

}
