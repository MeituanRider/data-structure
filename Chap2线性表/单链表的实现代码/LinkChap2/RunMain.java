package LinkChap2;

import java.io.IOException;
import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		StudLinkList llist = new StudLinkList();
		@SuppressWarnings("resource")
		Scanner read=new Scanner(System.in);
		String sNo = "", sName = "";
		StudNode snode = null;
		double sScore = 0;
		int i = 0;
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 建立单链表");
			System.out.println("2 显示所有信息");
			System.out.println("3 求单链表的长度");
			System.out.println("4 取第i个元素的结点");
			System.out.println("5 查找结点");
			System.out.println("6 在指定位置i处插入一个结点");
			System.out.println("7 在链表尾追加一个元素");
			System.out.println("8 删除第i个结点");
			System.out.println("9 判表是否空");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice =read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				llist.SetLinkList();
				break;
			case 2:
				String visitResult = llist.VisitAll();
				System.out.println(visitResult);
				break;
			case 3:
				int length = llist.GetLength();
				System.out.println("链表的长度为：\t" + length);
				break;
			case 4:
				System.out.println("请输入节点号i");
				i = read.nextInt();
				if (i == 0) {
					System.out.println("0号结点是头结点，内容为空串");
				} else {
					snode = llist.GetNode(i);
					if (snode == null) {
						System.out.println("未找到此结点");
					} else {
						System.out.println("此结点为：\t" + snode.studentNo + "\t"
								+ snode.name + "\t" + snode.score);
					}
				}
				break;
			case 5:
				System.out.println("请输入待查姓名");
				sName = read.next();
				snode = llist.Location(sName);
				if (snode == null) {
					System.out.println("查无此人");
				} else {
					System.out.println("此结点为：\t" + snode.studentNo + "\t"
							+ snode.name + "\t" + snode.score);
				}
				break;
			case 6:
				System.out.println("请输入学号：");
				sNo = read.next();
				System.out.println("请输入姓名：");
				sName = read.next();
				System.out.println("请输入成绩：");
				sScore =read.nextDouble();
				System.out.println("请输入插入位置：");
				i =read.nextInt();
				snode = new StudNode(sNo, sName, sScore);
				boolean iresult = llist.Insert(i, snode);
				if (iresult) {
					System.out.println("结点插入成功");
				} else {
					System.out.println("结点插入失败");
				}
				break;
			case 7:
				System.out.println("请输入学号：");
				sNo = read.next();
				System.out.println("请输入姓名：");
				sName = read.next();
				System.out.println("请输入成绩：");
				sScore = read.nextDouble();				
				snode = new StudNode(sNo, sName, sScore);
				boolean aresult = llist.Append(snode);
				if (aresult) {
					System.out.println("结点追加成功");
				} else {
					System.out.println("结点追加失败");
				}
				break;
			case 8:
				System.out.println("请输入待删节点号i");
				i = read.nextInt();
				boolean dresult=llist.Delete(i);
				if (dresult) {
					System.out.println("结点删除成功");
				} else {
					System.out.println("结点删除失败");
				}
				break;
			case 9:
				boolean eresult;
				eresult=llist.Empty();
				if(eresult)
				{
					System.out.println("当前链表为空");
				}
				else
				{
					System.out.println("当前链表不空");
				}
			}
		}
	}

}
