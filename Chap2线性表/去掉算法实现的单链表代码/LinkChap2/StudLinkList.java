package LinkChap2;

import java.util.Scanner;

public class StudLinkList implements ILinkListOperation {

	private StudNode head = null;

	public StudLinkList() {
		head = new StudNode(); // ����ͷ���
		head.next = null; // ͷ����ָ����Ϊ��
	}

	/**
	 * ��ͷ�巨����������
	 */
	@Override
	public void SetLinkList(){
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
			snode = new StudNode(sNo, sName, sScore);
			snode.next = p.next;
			head.next = snode;
			System.out.println("�Ƿ������������Ϣ��y/n����");
			todo=read.next();
		} 
	}

	/**
	 * ��ȡ��������ĳ���
	 */
	@Override
	public int GetLength() {

		return 0;
	}

	/**
	 * ȡ��i��Ԫ�صĽ�㣺�д˽ڵ㣬������ָ�룬���򷵻ؿ�null,��iΪ0ʱ��ȡ����ͷ����ָ��
	 */
	@Override
	public StudNode GetNode(int i) {

		return null;
	}

	/**
	 * ���ؼ��ֲ��ҽ�㣺�ҵ����ش˽���ָ�룬�Ҳ��������ؿ�null
	 */
	@Override
	public StudNode Location(String key) {

		return null;
	}

	/**
	 * ��ָ��λ��i������һ����㣺����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Insert(int i, StudNode s) {

		return true;
	}

	/** 
	 * ������β��׷�ӽ�㣬����ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Append(StudNode s) {

		return true;
	}

	/**
	 * ɾ����i����㣺���ɹ�����true��ʧ�ܷ���false
	 */
	@Override
	public boolean Delete(int i) {
		
		return true;
	}

	/**  
	 * �б��Ƿ��
	 */
	@Override
	public boolean Empty() {

		return true ;
	}

	@Override
	public String VisitAll() {
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
