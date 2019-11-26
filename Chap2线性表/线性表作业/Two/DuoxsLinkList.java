package ChapZy.Two;

import java.util.Scanner;

public class DuoxsLinkList implements ILinkListOperate {
	public Node head = null;

	public DuoxsLinkList() { // 构造函数，产生带头结点的空链表
		head = new Node();
		head.next = null;
	}

	@Override
	public void CreateLinkListByRear() { // 尾插法创建单链表
		Scanner read = new Scanner(System.in);
		float xisu; // 系数
		int zisu; // 指数
		Node p = head;
		Node s = null;
		String todo = "y";
		while (todo.toUpperCase().equals("Y")) {
			System.out.println("请输入系数：");
			xisu = read.nextFloat();
			System.out.println("请输入指数：");
			zisu = read.nextInt();
			s = new Node(xisu, zisu);
			s.next = null;
			p.next = s;
			p = p.next;
			System.out.println("是否继续输入结点信息（y/n）？");
			todo = read.next();
		}
	}

	@Override
	public String VisitAll() { // 遍历所有结点
		Node p = null;
		StringBuilder sb = new StringBuilder();
		p = head.next;
		while (p != null) {
			if (p.zisu != 0) {
				if (p.xisu > 0) {
					sb.append("+" + p.xisu + "X^" + p.zisu + "\t");
				} else {
					sb.append(p.xisu + "X^" + p.zisu + "\t");
				}
			} else {
				if (p.xisu > 0) {
					sb.append("+" + p.xisu + "\t");
				} else {
					sb.append(p.xisu + "\t");
				}
			}
			p = p.next;
		}
		return sb.toString();
	}
}
