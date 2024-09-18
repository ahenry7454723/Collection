package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// Taskクラス内におインスタンスをリストに格納
		List<Task> taskList = new ArrayList<>();

		// 各引数を設定して変数に引数の内容を与える
		Task task1 = new Task(LocalDate.of(2021, 10, 21), "牛乳を買いに行く。");
		Task task2 = new Task(LocalDate.of(2021, 9, 15), "〇〇社へ面談に行く。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4), "手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10), "散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。");

		// リストに 引数の内容を持っている値をリストに追加
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);

		// 日付順にソート（昇順）する
		Collections.sort(taskList, Comparator.comparing(Task::getDate));

		// 拡張for文でList内の要素を出力する
		for (Task task : taskList) {
			System.out.println(task.getDate() + ":" + task.getAction());
		}
	}
}
