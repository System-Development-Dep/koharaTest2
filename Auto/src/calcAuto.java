import java.io.IOException;

public class calcAuto {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); //ランタイムを得る
		try {
			String[] cmdarray = {"calc"};
			r.exec(cmdarray); //電卓を起動
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}