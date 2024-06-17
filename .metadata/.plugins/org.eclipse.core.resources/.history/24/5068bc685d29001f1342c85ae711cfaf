import java.io.File;

public class cmdAuto3 {
	public static void main(String[] args) throws Exception{
		
		//execコマンドの引数となる変数の設定

		 String[] Command = {
	                "cmd", //コマンドプロンプトを起動
	                "/c", //指示実行後にcmdを閉じるオプション。
	                "mkdir e" //eというディレクトリを作成
	        };		 
		 String[] envp = {};	//環境変数を指定できるが、今回は指定なし。	 
		 File dir = new File("C:/"); //作業ディレクトリの指定。今回はCの直下。
		 
	        Process p = Runtime.getRuntime().exec(Command,envp,dir);
	        p.waitFor();

	 }

}
