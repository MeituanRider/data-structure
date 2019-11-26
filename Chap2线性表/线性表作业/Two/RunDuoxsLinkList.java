package ChapZy.Two;

import java.util.Scanner;

public class RunDuoxsLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuoxsLinkList listA = new DuoxsLinkList();
		DuoxsLinkList listB = new DuoxsLinkList();
		DuoxsLinkList listC = new DuoxsLinkList();
		Scanner read = new Scanner(System.in);
		Node pa = null;
		Node pb = null;
		Node pc = null;
		Node s = null;
		String visitResult = "";
		while (true) {
			System.out.println("********��������ʽ����������ӳ���**********");
			System.out.println("1 ��������ʽ������A");
			System.out.println("2 ��ʾ����ʽ������A");
			System.out.println("3 ��������ʽ������B");
			System.out.println("4 ��ʾ����ʽ������B");
			System.out.println("5 ����ʽ������A��Bƴ�ӳɶ���ʽ������C");
			System.out.println("6 ��ʾ����ʽ������C");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				listA.CreateLinkListByRear();
				break;
			case 2:
				visitResult = listA.VisitAll();
				System.out.println(visitResult);
				break;
			case 3:
				listB.CreateLinkListByRear();
				break;
			case 4:
				visitResult = listB.VisitAll();
				System.out.println(visitResult);
				break;
			case 5:
				pa = listA.head.next;
				pb = listB.head.next;
				pc = listC.head;
				while ((pa != null) && (pb != null)) {
					if (pa.zisu == pb.zisu) // ͬ����ϲ�
					{
						if ((pa.xisu + pb.xisu) != 0) {
							s = new Node(pa.xisu + pb.xisu, pa.zisu);
							s.next = null;
							pc.next = s;
							pc = pc.next; // ָ������
						}
						pa = pa.next; // ָ������
						pb = pb.next; // ָ������
					} else if (pa.zisu > pb.zisu) {
						s = new Node(pa.xisu, pa.zisu);
						s.next = null;
						pc.next = s;
						pc = pc.next; // ָ������
						pa = pa.next; // ָ������
					} else if (pa.zisu < pb.zisu) {
						s = new Node(pb.xisu, pb.zisu);
						s.next = null;
						pc.next = s;
						pc = pc.next; // ָ������
						pb = pb.next; // ָ������
					}
				}

				while (pa != null) // A����ʣ�ಿ��ƴ�ӵ�C
				{
					s = new Node(pa.xisu, pa.zisu);
					s.next = null;
					pc.next = s;
					pc = pc.next; // ָ������
					pa = pa.next; // ָ������
				}
				while (pb != null) // B����ʣ�ಿ��ƴ�ӵ�C
				{
					s = new Node(pb.xisu, pb.zisu);
					s.next = null;
					pc.next = s;
					pc = pc.next; // ָ������
					pb = pb.next; // ָ������
				}
				break;
			case 6:
				visitResult = listC.VisitAll();
				System.out.println(visitResult);
				break;
			}
		}
	}
}
