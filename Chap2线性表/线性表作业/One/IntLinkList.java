package ChapZy.One;

import java.util.Scanner;

public class IntLinkList implements ILinkListOperate {
	public Node head=null;

	public IntLinkList() {  //���캯����������ͷ���Ŀ�����
		head=new Node();
		head.next =null;
	}
	@Override
	public void CreateLinkListByHead()   //ͷ�巨����������
	{
		Scanner read=new Scanner(System.in);
		int data;
		Node s = null;
		String todo="y";
		while(todo.toUpperCase().equals("Y")){
			System.out.println("������һ��������");
			data = read.nextInt();
			s = new Node(data);
			s.next = head.next;
			head.next =s;
			System.out.println("�Ƿ������������Ϣ��y/n����");
			todo=read.next();
		} 
	}
	@Override
	public String VisitAll() {     //�������н��
		Node p = null;
		StringBuilder sb = new StringBuilder();
		p = head.next;
		while (p != null) {
			sb.append(p.data + "\t" );
			p = p.next;
		}
		return sb.toString();
	}
}
