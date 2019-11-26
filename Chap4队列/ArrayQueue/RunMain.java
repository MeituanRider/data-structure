package ArrayQueue;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudNodeArrarQueue studsQueue = new StudNodeArrarQueue();
		Scanner read = new Scanner(System.in);
		String sno = "", sname = "";
		StudNode s=null;
		double score = 0;
		boolean result;
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 学生信息入队");
			System.out.println("2 显示队头元素");
			System.out.println("3 学生信息出队");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("请输入学号：");
				sno = read.next();
				System.out.println("请输入姓名：");
				sname = read.next();
				System.out.println("请输入成绩：");
				score = read.nextDouble();
				s = new StudNode(sno,sname,score);
				result = studsQueue.EnQueue(s);
				if (result) {
					System.out.println("入队成功");
				} else {
					System.out.println("入队失败,栈已满，上溢出！");
				}
				break;
			case 2:
				s = studsQueue.GetFront();
				System.out.println(s.studentNo+"\t"+s.name+"\t"+s.score);
				break;
			case 3:
				s = studsQueue.GetFront();
				result =studsQueue.OutQueue();
				if(result)
				{
					System.out.println("出队成功，出队学生信息为：");
				}
				else
				{
					System.out.println("出队失败,队为空,下溢出！");
				}
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}

}
