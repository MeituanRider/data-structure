package LinkChap2;

import java.io.IOException;
import java.util.Scanner;

public class StudLinkList implements ILinkListOperation {

	private StudNode head = null;
	private int Length = 0;

	public StudLinkList() {
		head = new StudNode(); // ����ͷ���
		head.next = null; // ͷ����ָ����Ϊ��
		Length = 0;
	}

	/**
	 * ��ͷ�巨����������
	 */
	@Override
	public void SetLinkList() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		String sNo = "", sName = "";
		double sScore = 0;
		StudNode snode = null;
		StudNode p = head;
		String todo="y";
		while(todo.toUpperCase().equals("Y")){
			System.out.println("������ѧ�ţ�");
			sNo = read.next();
			System.out.println("������������");
			sName = read.next();
			System.out.println("������ɼ���");
			sScore = read.nextDouble();
			snode = new StudNode(sNo, sName, sScore);//�����Ŀ�ָ��
			snode.next = p.next;//ͷ�ڵ�������
			head.next = snode;//ָ������Ϊ�գ��Դ�����
			Length++;
			System.out.println("�Ƿ������������Ϣ��y/n����");
			todo=read.next();
		} 
	}

	/**
	 * ��ȡ��������ĳ���
	 */
	@Override
	public int GetLength() {
		// TODO Auto-generated method stub
		return Length;
	}

	/**
	 * ȡ��i��Ԫ�صĽ�㣺�д˽ڵ㣬������ָ�룬���򷵻ؿ�null,��iΪ0ʱ��ȡ����ͷ����ָ��
	 */
	@Override
	public StudNode GetNode(int i) {
		// TODO Auto-generated method stub
		StudNode p;
		p = head;
		if (i < 0) {
			return null;
		} else {
			int j = 0;
			while ((j != i) && (p != null)) {
				p = p.next;
				j++;
			}
			return p;
		}
	}

	/**
	 * ���ؼ��ֲ��ҽ�㣺�ҵ����ش˽���ָ�룬�Ҳ��������ؿ�null
	 */
	@Override
	public StudNode Location(String key) {
		// TODO Auto-generated method stub
		StudNode p;
		p=head.next;
		while(p!=null && !(p.name.equals(key)))
		{
			p=p.next;
		}
		return p;
	}

	/**
	 * ��ָ��λ��i������һ����㣺����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Insert(int i, StudNode node) {
		// TODO Auto-generated method stub
		StudNode p;
		p=GetNode(i-1);
		if(p==null)
		{
			System.out.println("����λ�ò���ȷ��");
			return false;
		}
		else
		{
			node.next =p.next ;
			p.next=node;
			return true;
		}
	}

	/** 
	 * ������β��׷�ӽ�㣬����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Append(StudNode node) {
		// TODO Auto-generated method stub
		StudNode p ;
		p=head;
		while(p.next!=null)
		{
			p=p.next;
		}
		node.next=null;
		p.next=node;
		Length++;
		return true;
	}

	/**
	 * ɾ����i����㣺���ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Delete(int i) {
		// TODO Auto-generated method stub
		StudNode p;
		p=GetNode(i-1);
		if(p==null || p.next ==null)
		{
			System.out.println("��ɾ���i����ȷ");
			return false;
		}
		else
		{
			p.next=p.next.next ;
			Length--;
			return true;
		}
	}

	/**  
	 * �б��Ƿ��
	 */
	@Override
	public boolean Empty() {
		// TODO Auto-generated method stub
		return Length == 0 ? true : false;
	}

	@Override
	public String VisitAll() {
		// TODO Auto-generated method stub
		StudNode p = null;
		StringBuilder sb = new StringBuilder();
		p = head.next;
		while (p != null) {
			sb.append(p.studentNo + "\t" + p.name + "\t" + p.score + "\n");
			p = p.next;
		}
		return sb.toString();
	}

}
