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
			System.out.println("********ͼ�ı���**********");
			System.out.println("**     1------------�����ڽӾ���   **");
			System.out.println("**     2------------��ʾ�ڽӾ���   **");
			System.out.println("**     3------------������ȱ���   **");
			System.out.println("**     4------------������ȱ���   **");
			System.out.println("**     0------------�˳�ϵͳ          **");
			System.out.println("���������ѡ��");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				graph.CreateArrayGraph();
				System.out.println("�������");
				break;
			case 2:
				graph.DisplayArrayGraph();
				System.out.println("��ʾ���");
				break;
			case 3:
				graph.travel_dfs();
				System.out.println("������ȱ������");
				break;
			case 4:
				graph.travel_bfs();
				System.out.println("������ȱ������");
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}

}
