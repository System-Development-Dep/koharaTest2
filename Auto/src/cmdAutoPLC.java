import java.io.File;

public class cmdAutoPLC {
	
	public static void main(String[] args) throws Exception{
	
		//execコマンドの引数となる変数の設定

		//ftp実行までで一回待ってみる
		 String[] Command1 = {
	                "cmd", //コマンドプロンプトを起動
	                "/k", //指示実行後にcmdは閉じないオプション。
	                "ftp" 
	        };		 
		 String[] envp = {};	//環境変数を指定できるが、今回は指定なし。	 
		 File dir = new File("C:\\Users\\yukina kohara\\"); //作業ディレクトリの指定。今回はCの直下。
		 
	     Process p1 = Runtime.getRuntime().exec(Command1,envp,dir);
	     p1.waitFor();
	        
	        
	     //続いてユーザー名を入れる
	     String[] Command2 = {
	                //"cmd", //コマンドプロンプトを起動
	                "/k", //指示実行後にcmdは閉じないオプション。
	                "KV" 
	        };
	     
	     Process p2 = Runtime.getRuntime().exec(Command2,envp,dir);
	     p2.waitFor();
	     
	     
	   //続いてパスワードを入れる
	     String[] Command3 = {
	                //"cmd", //コマンドプロンプトを起動
	                "/k", //指示実行後にcmdは閉じないオプション。
	                "" 
	        };
	     
	     Process p3 = Runtime.getRuntime().exec(Command3,envp,dir);
	     p3.waitFor();
	     
	     
	     
	 }

}
