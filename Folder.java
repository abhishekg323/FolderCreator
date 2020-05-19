import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
class Folder{
	public static void main(String ... s) throws Exception{
		String date=DateTimeFormatter.ofPattern("dd MM yyyy").format(LocalDateTime.now());
		File f=new File("a.txt");
		String d=new Scanner(f).nextLine();
		String str="Day "+d+" - "+date+"";
		File file=new File(str);
		if(file.mkdirs()){
			PrintWriter out=new PrintWriter(f);
			out.println(Integer.parseInt(d)+1);
			out.close();
			new PrintWriter(new File(str+"\\Contents.txt")).close();
			Runtime r=Runtime.getRuntime();
			r.exec("explorer .\\"+str);
			Thread.sleep(700);
			r.exec("notepad "+str+"\\Contents.txt");	
		}
	}
}