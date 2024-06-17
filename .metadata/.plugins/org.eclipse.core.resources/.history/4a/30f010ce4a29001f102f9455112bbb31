
public class cmdAuto {

	public static void main(String[] args) {
		try {
			Runtime runtime = Runtime.getRuntime();
			String[] cmdarray = {"cmd /c timeout /t 3 > nul &amp; move a\\hoge.txt b\\"};
			Process p = runtime.exec(cmdarray);
			p.waitFor(); //プロセス終了を待つ
			p.destroy(); //プロセスを明確に終了させ、資源を回収
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
