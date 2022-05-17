package com.cho.app.exec;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		InputStream is = null;
		Scanner scan= null;

		try {
			is = new FileInputStream("src/com/cho/app/exec/data.txt");
			scan = new Scanner(is);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			is.close();
		} catch (Exception e) {
		}

	}
}
