import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SplitAndGetProcesses {
	public static void main(String args[]) throws IOException{
		Set<String> setOfProcesses = new HashSet<>();
		try {
			Scanner sc = new Scanner(new FileInputStream(new File("portProcessData.txt")));
			FileOutputStream fos =new FileOutputStream(new File("uniqueProcessIds.txt"));
			
			while(sc.hasNextLine()){
				String[] portProcessData=sc.nextLine().split(" ");
				System.out.println("PID: "+portProcessData[portProcessData.length-1]);
				setOfProcesses.add(portProcessData[portProcessData.length-1]);
			}
			int i=0;
			for(String process : setOfProcesses){
				if(i!=0){
					process="\n"+process;
				}
				fos.write(process.getBytes());
				i++;
			}
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
