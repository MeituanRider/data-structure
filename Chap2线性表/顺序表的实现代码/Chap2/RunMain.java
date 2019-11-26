package Chap2;


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
		Scanner read = new Scanner(System.in);
		String sNo = "", sName = "";
		StudScore snode=null;
		double sScore = 0;
		int i = 0;
		SequenceStudent liststud=new SequenceStudent();
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 追加记录");
			System.out.println("2 显示所有信息");
			System.out.println("3 查询姓名");
			System.out.println("4 显示顺序表长度");
			System.out.println("5 获取第i号元素");
			System.out.println("6 删除第i号元素");
			System.out.println("7 判断是否为空");
			System.out.println("8 插入记录");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("请输入学号：");
				sNo = read.next();
				System.out.println("请输入姓名：");
				sName = read.next();
				System.out.println("请输入成绩：");
				sScore = read.nextDouble();
				snode = new StudScore(sNo,sName,  sScore);
				liststud.Append(snode);
				System.out.println();
				break;
			case 2:
				String visitresult = liststud.VisitAll();
				System.out.println(visitresult);
				break;
			case 3:
				System.out.println("请输入姓名：");
				sName = read.next();
				int result = liststud.Location(sName);
				if (result == -1) {
					System.out.println("查无此人！");
				} else {
					StudScore st = liststud.stud[result];
					System.out.println(st.studentNo + "\t" + st.name + "\t"
							+ st.score);
				}
				break;
			case 4:
				int length = liststud.GetLength();
				System.out.println("顺序表当前长度为" + length);
				break;
			case 5:
				System.out.println("请输入结点序号：");
				i = read.nextInt();
				StudScore stud = liststud.GetNode(i);
				if (stud == null) {
					System.out.println("没有此序号结点");
				} else {
					StudScore st = liststud.GetNode(i);
					System.out.println(st.studentNo + "\t" + st.name + "\t"
							+ st.score);
				}
				break;
			case 6:
				System.out.println("请输入待删结点序号：");
				i = read.nextInt();
				boolean delresult = liststud.Delete(i);
				if (delresult) {
					System.out.println("删除成功！");
				} else {
					System.out.println("删除失败！");
				}
				break;
			case 7:
				boolean isempty = liststud.Empty();
				if (isempty) {
					System.out.println("顺序表当前为空！");
				} else {
					System.out.println("顺序表当前不空！");
				}
				break;
			case 8:
				System.out.println("请输入学号：");
				sNo = read.next();
				System.out.println("请输入姓名：");
				sName = read.next();
				System.out.println("请输入成绩：");
				sScore = read.nextDouble();
				snode = new StudScore(sNo,sName,  sScore);
				System.out.println("请输入插入位置：");
				i =read.nextInt();
				liststud.Insert(snode,i);
				System.out.println();
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}
}
