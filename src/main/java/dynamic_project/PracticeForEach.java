package dynamic_project;

import java.util.ArrayList;
import java.util.List;

public class PracticeForEach {

	public static void main(String[] args) {
		List<String> colist = new ArrayList<>();
		colist.add("佐藤" + "蒼");
		colist.add("鈴木" + "凪");
		colist.add("高橋" + "蓮");
		colist.add("田中" + "陽翔");
		colist.add("伊藤" + "湊");
		colist.add("渡辺" + "陽葵");
		colist.add("山本" + "凛");
		colist.add("中村" + "詩");
		colist.add("小林" + "陽菜");
		colist.add("加藤" + "結菜");
		for (String name : colist) {
			System.out.println(name);
		}
	}

}
