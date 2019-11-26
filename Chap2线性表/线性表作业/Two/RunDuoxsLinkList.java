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
			System.out.println("********两个多项式线性链表相加程序**********");
			System.out.println("1 建立多项式单链表A");
			System.out.println("2 显示多项式单链表A");
			System.out.println("3 建立多项式单链表B");
			System.out.println("4 显示多项式单链表B");
			System.out.println("5 多项式单链表A与B拼接成多项式单链表C");
			System.out.println("6 显示多项式单链表C");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
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
					if (pa.zisu == pb.zisu) // 同类项合并
					{
						if ((pa.xisu + pb.xisu) != 0) {
							s = new Node(pa.xisu + pb.xisu, pa.zisu);
							s.next = null;
							pc.next = s;
							pc = pc.next; // 指针下移
						}
						pa = pa.next; // 指针下移
						pb = pb.next; // 指针下移
					} else if (pa.zisu > pb.zisu) {
						s = new Node(pa.xisu, pa.zisu);
						s.next = null;
						pc.next = s;
						pc = pc.next; // 指针下移
						pa = pa.next; // 指针下移
					} else if (pa.zisu < pb.zisu) {
						s = new Node(pb.xisu, pb.zisu);
						s.next = null;
						pc.next = s;
						pc = pc.next; // 指针下移
						pb = pb.next; // 指针下移
					}
				}

				while (pa != null) // A链表剩余部分拼接到C
				{
					s = new Node(pa.xisu, pa.zisu);
					s.next = null;
					pc.next = s;
					pc = pc.next; // 指针下移
					pa = pa.next; // 指针下移
				}
				while (pb != null) // B链表剩余部分拼接到C
				{
					s = new Node(pb.xisu, pb.zisu);
					s.next = null;
					pc.next = s;
					pc = pc.next; // 指针下移
					pb = pb.next; // 指针下移
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
