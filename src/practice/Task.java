package practice;

import java.time.LocalDate;

public class Task {

	// フィールド
	private LocalDate date;
	private String action;

	// コンストラクター
	public Task(LocalDate date, String action) {
		this.date = date;
		this.action = action;
	}

	// ゲッター
	public LocalDate getDate() {
		return date;
	}

	public String getAction() {
		return action;
	}

}
