package com.zhuolang.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	

	private boolean debug = true;
	
	private String exec; //ת��ΪString
	private List<String> param; //����
	
	private String name = "zhuolang";
	private String path; //��ǰĿ¼
	
	private BufferedReader reader;
	
	public Main(){
		path = new File("").getAbsolutePath(); //��ȡ��ǰĿ¼��·��
		param = new ArrayList<String>();
		
		reader = new BufferedReader(new InputStreamReader(System.in)); //��װin
	}
	
	public void start() throws IOException{
			for (;;) 
			{
			param.clear();
			
			System.out.print("["+name +"@"+path+" ~]$ ");
			String in = reader.readLine();
			String [] ins = in.split(" +"); //�������֣�1�����ϵĿո�
			
			exec = ins[0].trim(); //��Ҫȥ���س�
			int inLen = ins.length; 
			for(int i = 1 ; inLen > i ; i++){
				param.add(ins[i]);
			}
			
			
			if(exec.isEmpty()){
				continue; //�����س��Ͳ�Ҫ����
			}
			
			switch (exec) {
			case "exit":
				exit();
				break;
				
			case "cd":
				cd();
				break;

			case "ls":
				ls();
				break;

			default:
				System.out.println("��˵ʲô����sb");
				break;
			}
			
			System.out.println();
		}
	}
	
	private void cd(){
		if(param.isEmpty()){
			System.out.println("�в��ǲ��ǣ��᲻����ѽ��cd ������Ҫ�������㲻֪����");
			
		}
		switch (param.get(0)) {
		case ".":
			break;
		case "..":
			break;

		default:
			break;
		}
	}
	
	private void exit(){
		System.out.println("sb �ݰ�");
		System.exit(0);
	}
	private void ls() throws IOException{
		path = new File("").getAbsolutePath();//��ȡ��ǰĿ¼
		File f = new File(path); 
		String[] names = f.list();
		for(String name : names)//for �ĸ߼�ѭ��
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) throws IOException {
		new Main().start();
	}

}
