package dynamic_project;

public class PracticeSwitch {

	public static void main(String[] args) {
		int [] jobs = {0,1,2,3,4,4,3,2,1,0};
		for (int i = 0;i < jobs.length; i++) {
			int num = jobs[i];
			switch (num) {
				case 0:
					System.out.println(1+":勇者");
					break;
				case 1:
					System.out.println(2+":バトルマスター");
					break;
				case 2:
					System.out.println(3+":パラディン");
					break;
				case 3:
					System.out.println(4+":海賊");
					break;
				case 4:
					System.out.println(5+":魔法剣士");
					break;
			}
		}
		
	}

}
