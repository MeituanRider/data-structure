package SingleLink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudLinkList implements ILinkListOperation {

	private StudNode head = null;
	private int Length = 0;

	public StudLinkList() {
		head = new StudNode(); // 产生头结点
		head.next = head; // 头结点的指针域为head
		Length = 0;
	}

	/**
	 * 用头插法建立单链表
	 */
	@Override
	public void SetLinkList() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String sNo = "", sName = "";
		double sScore = 0;
		StudNode snode = null;
		StudNode p = head;
		String todo="y";
		while(todo.toUpperCase().equals("Y")){
			System.out.println("请输入学号：");
			sNo = read.readLine();
			System.out.println("请输入姓名：");
			sName = read.readLine();
			System.out.println("请输入成绩：");
			sScore = Double.parseDouble(read.readLine());
			snode = new StudNode(sNo, sName, sScore);
			snode.next = p.next;
			head.next = snode;
			Length++;
			System.out.println("是否继续输入结点信息（y/n）？");
			todo=read.readLine();
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
		if (i < 0 || i>Length) {
			return null;
		} else {
			int j = 0;
			while ((j != i) && (p.next!= head)) {
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
		while(p!=head && !(p.name.equals(key)))
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
			Length++;
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
		while(p.next!=head)
		{
			p=p.next;
		}
		node.next=head;
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
		if(p==null || p.next ==head)
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
		while (p != head) {
			sb.append(p.studentNo + "\t" + p.name + "\t" + p.score + "\n");
			p = p.next;
		}
		return sb.toString();
	}

}
