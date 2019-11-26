package LinkChap2;

import java.io.IOException;
import java.util.Scanner;

public class StudLinkList implements ILinkListOperation {

	private StudNode head = null;
	private int Length = 0;

	public StudLinkList() {
		head = new StudNode(); // 产生头结点
		head.next = null; // 头结点的指针域为空
		Length = 0;
	}

	/**
	 * 用头插法建立单链表
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
			System.out.println("请输入学号：");
			sNo = read.next();
			System.out.println("请输入姓名：");
			sName = read.next();
			System.out.println("请输入成绩：");
			sScore = read.nextDouble();
			snode = new StudNode(sNo, sName, sScore);//产生的空指针
			snode.next = p.next;//头节点往后移
			head.next = snode;//指针域在为空，以此类推
			Length++;
			System.out.println("是否继续输入结点信息（y/n）？");
			todo=read.next();
		} 
	}

	/**
	 * 获取线性链表的长度
	 */
	@Override
	public int GetLength() {
		// TODO Auto-generated method stub
		return Length;
	}

	/**
	 * 取第i个元素的结点：有此节点，返回其指针，否则返回空null,当i为0时，取的是头结点的指针
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
	 * 按关键字查找结点：找到返回此结点的指针，找不到，返回空null
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
	 * 在指定位置i处插入一个结点：插入成功返回true，失败返回false
	 */
	@Override
	public boolean Insert(int i, StudNode node) {
		// TODO Auto-generated method stub
		StudNode p;
		p=GetNode(i-1);
		if(p==null)
		{
			System.out.println("插入位置不正确！");
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
	 * 向链表尾部追加结点，插入成功返回true，失败返回false
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
	 * 删除第i个结点：若成功返回true，失败返回false
	 */
	@Override
	public boolean Delete(int i) {
		// TODO Auto-generated method stub
		StudNode p;
		p=GetNode(i-1);
		if(p==null || p.next ==null)
		{
			System.out.println("待删序号i不正确");
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
	 * 判表是否空
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
