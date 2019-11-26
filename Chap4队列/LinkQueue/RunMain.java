package LinkQueue;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudLinkQueue studqueue = new StudLinkQueue();
		String sno, sname;
		float score;
		StudNode s = null;
		int choice;
		boolean result;
		Scanner read = new Scanner(System.in);
		while (true) {
			System.out.println("********学生成绩管理程序**********");
			System.out.println("1 学生信息入队");
			System.out.println("2 显示队头信息");
			System.out.println("3 学生信息出队");
			System.out.println("0 退出\n");
			System.out.println("请输入你的选择：");
			choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("请输入学号：");
				sno = read.next();
				System.out.println("请输入姓名：");
				sname = read.next();
				System.out.println("请输入成绩：");
				score = read.nextFloat();
				s = new StudNode(sno,sname,score);
				result = studqueue.EnQuery(s);
				if(result){
					System.out.println("入队成功");
				}else{
					System.out.println("入队失败");
				}
				break;
			case 2:
					s = studqueue.GetTop();
					if(s!=null){
						System.out.println(s.sno+" "+s.sname+" "+s.score);
					}else{
						System.out.println("队列已空");
					}
				break;
			case 3:
				result = studqueue.OutQuery();
				if(result){
					System.out.println("出队成功");
				}else{
					System.out.println("出队失败");
				}
				break;
			}
		}
	}

}
