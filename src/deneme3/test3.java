package deneme3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String regex="05[0-9]{2}\s[0-9]{3}\s[0-9]{2}\s[0-9]{2}";
		String icerik = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
		Pattern oruntu=Pattern.compile(regex);
		Matcher eslesme=oruntu.matcher(icerik);
		int adet=0;
		
		while(eslesme.find())
		{
			adet++;
		}
		*/
		
		
		String regex="Sakarya U[a-z|.]*\s";
		String icerik = new String(Files.readAllBytes(Paths.get("test2.txt")), StandardCharsets.UTF_8);
		Pattern oruntu=Pattern.compile(regex);
		Matcher eslesme=oruntu.matcher(icerik);
		String sonHal="";
		if(eslesme.find())
		{
			sonHal=icerik.replaceAll(regex,"");
			
		}
		System.out.print(sonHal);
		
		
		
		
		
		
		
		

	}

}
