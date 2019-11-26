package Chap3.LinkStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StudNodeLinkStack studsStack = new StudNodeLinkStack();
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String sNo = "", sName = "";
		StudNode snode = null;
		double sScore = 0;
		boolean result;
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 学生信息入栈");
			System.out.println("2 显示所有信息");
			System.out.println("3 学生信息出栈");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			int choice = Integer.parseInt(read.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("请输入学号：");
				sNo = read.readLine();
				System.out.println("请输入姓名：");
				sName = read.readLine();
				System.out.println("请输入成绩：");
				sScore = Double.parseDouble(read.readLine());
				snode = new StudNode(sNo, sName, sScore);
				result = studsStack.Push(snode);
				if (result) {
					System.out.println("入栈成功");
				} else {
					System.out.println("入栈失败,栈已满，上溢出！");
				}
				break;
			case 2:
				String visitresult = studsStack.VisitAll();
				System.out.println(visitresult);
				break;
			case 3:
				snode = studsStack.GetTop();
				result = studsStack.Pop();
				if (result) {
					System.out.println("出栈成功，出栈学生信息为：");
					String strStudInfo;
					strStudInfo = snode.studentNo + "\t" + snode.name + "\t"
							+ snode.score;
					System.out.println(strStudInfo);
				} else {
					System.out.println("出栈失败,栈为空,下溢出！");
				}
				break;
			default:
				System.out.println("选择错误，请重选");
				break;
			}
		}
	}
}
