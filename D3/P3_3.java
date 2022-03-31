package hello;

public class P3_3 {
	final static String[] CHO = { "ぁ", "あ", "い", "ぇ", "え", "ぉ", "け", "げ", "こ", "さ", "ざ", "し", "じ", "す", "ず", "せ", "ぜ",
			"そ", "ぞ" };
	final static String[] JUNG = { "た", "だ", "ち", "ぢ", "っ", "つ", "づ", "て", "で", "と", "ど", "な", "に", "ぬ", "ね", "の", "は",
			"ば", "ぱ", "ひ", "び" };
	final static String[] JONG = { "", "ぁ", "あ", "ぃ", "い", "ぅ", "う", "ぇ", "ぉ", "お", "か", "が", "き", "ぎ", "く", "ぐ", "け",
			"げ", "   ご", "さ", "ざ", "し", "じ", "ず", "せ", "ぜ", "そ", "ぞ" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String han = "照括馬室推";

		for (int i = 0; i < han.length(); i++) {
			char uniVal = han.charAt(i);
			char cho = (char) ((uniVal - 0xAC00) / 28 / 21);
			char jung = (char) ((uniVal - 0xAC00) / 28 % 21);
			char jong = (char) ((uniVal - 0xAC00) % 28);
			System.out.print(CHO[cho] + JUNG[jung] + JONG[jong]);
		}
	}
}
