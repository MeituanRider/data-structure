package ChapZy.Two;

import java.util.Scanner;

public class DuoxsLinkList implements ILinkListOperate {
	public Node head = null;

	public DuoxsLinkList() { // ���캯����������ͷ���Ŀ�����
		head = new Node();
		head.next = null;
	}

	@Override
	public void CreateLinkListByRear() { // β�巨����������
		Scanner read = new Scanner(System.in);
		float xisu; // ϵ��
		int zisu; // ָ��
		Node p = head;
		Node s = null;
		String todo = "y";
		while (todo.toUpperCase().equals("Y")) {
			System.out.println("������ϵ����");
			xisu = read.nextFloat();
			System.out.println("������ָ����");
			zisu = read.nextInt();
			s = new Node(xisu, zisu);
			s.next = null;
			p.next = s;
			p = p.next;
			System.out.println("�Ƿ������������Ϣ��y/n����");
			todo = read.next();
		}
	}

	@Override
	public String VisitAll() { // �������н��
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
