package com.zhuolang.java.file;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		byte[] execByte = new byte[100];
		String exec;
		
		for (;;) {
			System.in.read(execByte); //��ȡһ���ַ���
			exec = new String(execByte).trim(); //��Ҫȥ���س�

			switch (exec) {
			case "exit":
				System.out.println("sb bb");
				return;

			default:
				System.out.println("��˵ʲô����sb");
				break;
			}
		}


	}

}
