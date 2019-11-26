package LinkChap2;

import java.util.Scanner;

public class StudLinkList implements ILinkListOperation {

	private StudNode head = null;

	public StudLinkList() {
		head = new StudNode(); // 产生头结点
		head.next = null; // 头结点的指针域为空
	}

	/**
	 * 用头插法建立单链表
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
			System.out.println("请输入学号：");
			sNo = read.next();
			System.out.println("请输入姓名：");
			sName = read.next();
			System.out.println("请输入成绩：");
			sScore = read.nextDouble();
			snode = new StudNode(sNo, sName, sScore);
			snode.next = p.next;
			head.next = snode;
			System.out.println("是否继续输入结点信息（y/n）？");
			todo=read.next();
		} 
	}

	/**
	 * 获取线性链表的长度
	 */
	@Override
	public int GetLength() {

		return 0;
	}

	/**
	 * 取第i个元素的结点：有此节点，返回其指针，否则返回空null,当i为0时，取的是头结点的指针
	 */
	@Override
	public StudNode GetNode(int i) {

		return null;
	}

	/**
	 * 按关键字查找结点：找到返回此结点的指针，找不到，返回空null
	 */
	@Override
	public StudNode Location(String key) {

		return null;
	}

	/**
	 * 在指定位置i处插入一个结点：插入成功返回true，失败返回false
	 */
	@Override
	public boolean Insert(int i, StudNode s) {

		return true;
	}

	/** 
	 * 向链表尾部追加结点，插入成功返回true，失败返回false
	 */
	@Override
	public boolean Append(StudNode s) {

		return true;
	}

	/**
	 * 删除第i个结点：若成功返回true，失败返回false
	 */
	@Override
	public boolean Delete(int i) {
		
		return true;
	}

	/**  
	 * 判表是否空
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
