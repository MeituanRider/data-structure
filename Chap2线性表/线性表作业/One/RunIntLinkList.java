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
			System.out.println("********������������ƴ�ӳ���**********");
			System.out.println("1 ����������A");
			System.out.println("2 ��ʾ������A");
			System.out.println("3 ����������B");
			System.out.println("4 ��ʾ������B");
			System.out.println("5 ������A��Bƴ�ӳɵ�����C");
			System.out.println("6 ��ʾ������C");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
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
				while(nodeA!=null)   //A����ƴ�ӵ�C
				{
					s=new Node(nodeA.data);
					s.next=null;
					nodeC.next =s;
					nodeC =nodeC.next ; //ָ������
					nodeA =nodeA.next ; //ָ������
				}
				nodeB=listB.head.next;
				while(nodeB!=null)  //B����ƴ�ӵ�C
				{
					s=new Node(nodeB.data);
					s.next=null;
					nodeC.next =s;
					nodeC =nodeC.next ; //ָ������
					nodeB =nodeB.next ; //ָ������
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
