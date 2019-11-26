package CreateLjbGraph;

import java.util.Scanner;

public class RunLjbGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		IntLinkGraph  graph= new  IntLinkGraph();
		while (true) {
			System.out.println("********图的操作**********");
			System.out.println("**     1------------创建邻接表   **");
			System.out.println("**     2------------显示邻接表   **");
			System.out.println("**     0------------退出系统          **");
			System.out.println("请输入你的选择：");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				graph.CreateLinkGraph();
				System.out.println("创建完成");
				break;
			case 2:
				graph.DisplayLjbGraph(graph.GetVn());
				System.out.println("显示完成");
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}

}
