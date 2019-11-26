package ChapZy.One;

import java.util.Scanner;

public class IntLinkList implements ILinkListOperate {
	public Node head=null;

	public IntLinkList() {  //构造函数，产生带头结点的空链表
		head=new Node();
		head.next =null;
	}
	@Override
	public void CreateLinkListByHead()   //头插法创建单链表
	{
		Scanner read=new Scanner(System.in);
		int data;
		Node s = null;
		String todo="y";
		while(todo.toUpperCase().equals("Y")){
			System.out.println("请输入一个整数：");
			data = read.nextInt();
			s = new Node(data);
			s.next = head.next;
			head.next =s;
			System.out.println("是否继续输入结点信息（y/n）？");
			todo=read.next();
		} 
	}
	@Override
	public String VisitAll() {     //遍历所有结点
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
