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
			System.out.println("********ͼ�Ĳ���**********");
			System.out.println("**     1------------�����ڽӱ�   **");
			System.out.println("**     2------------��ʾ�ڽӱ�   **");
			System.out.println("**     0------------�˳�ϵͳ          **");
			System.out.println("���������ѡ��");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				graph.CreateLinkGraph();
				System.out.println("�������");
				break;
			case 2:
				graph.DisplayLjbGraph(graph.GetVn());
				System.out.println("��ʾ���");
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}

}
