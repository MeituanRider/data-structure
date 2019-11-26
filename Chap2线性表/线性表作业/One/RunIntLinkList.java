package ChapZy.One;

import java.util.Scanner;

public class RunIntLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkList listA = new IntLinkList();
		IntLinkList listB = new IntLinkList();
		IntLinkList listC = new IntLinkList();
		Scanner read=new Scanner(System.in);
		Node nodeA = null;
		Node nodeB = null;
		Node nodeC = null;
		Node s = null;
		String visitResult="";
		while (true) {
			System.out.println("********两个线性链表拼接程序**********");
			System.out.println("1 建立单链表A");
			System.out.println("2 显示单链表A");
			System.out.println("3 建立单链表B");
			System.out.println("4 显示单链表B");
			System.out.println("5 单链表A与B拼接成单链表C");
			System.out.println("6 显示单链表C");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				listA.CreateLinkListByHead();
				break;
			case 2:
				visitResult = listA.VisitAll();
				System.out.println(visitResult);
				break;
			case 3:
				listB.CreateLinkListByHead();
				break;
			case 4:
				visitResult = listB.VisitAll();
				System.out.println(visitResult);
				break;
			case 5:
				nodeA=listA.head.next;
				nodeC=listC.head;
				while(nodeA!=null)   //A链表拼接到C
				{
					s=new Node(nodeA.data);
					s.next=null;
					nodeC.next =s;
					nodeC =nodeC.next ; //指针下移
					nodeA =nodeA.next ; //指针下移
				}
				nodeB=listB.head.next;
				while(nodeB!=null)  //B链表拼接到C
				{
					s=new Node(nodeB.data);
					s.next=null;
					nodeC.next =s;
					nodeC =nodeC.next ; //指针下移
					nodeB =nodeB.next ; //指针下移
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
