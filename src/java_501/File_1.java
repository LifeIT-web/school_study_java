package java_501;

import java.io.File;
import java.util.ArrayList;

public class File_1 {

	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
// 		매개변수 한개가 아니라면, == 보다 !=이 더 확실한 값을 가져올 수 있다.
			System.out.println("usage : java File_1 Directory");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if (!dir.exists() || !dir.isDirectory()) {
//		dir가 존재 하지 않거나 디렉토리가 아니라면
			System.out.println(" 유효하지 않는 디렉토리 입니다.");
			System.exit(1);
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("총 : " + totalFiles + " 개의 파일");
		System.out.println("총 : " + totalDirs + " 개의 디렉토리");
	}
	
	private static void printFileList(File dir){
		System.out.println(dir.getAbsolutePath() + " 디렉토리");
						// 절대경로을 보여줌
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for (int i = 0; i < files.length; i++) {
			
			String filename = files[i].getName();
			
			if (files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i + "");
			}
			System.out.println(filename);
			
		}
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + " 개의 파일, " + dirNum + " 개의 디렉토리");
		System.out.println();
		
		for (int i = 0; i < subDir.size(); i++) {
			
			int index = Integer.parseInt((String) subDir.get(i));
			printFileList(files[index]);
			
		}
	}
}
