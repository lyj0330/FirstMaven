package FirstJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {


	    public static void main(String[] args) {
	        //д��������ʽ��������֤ĳЩ�ַ����Ƿ���Ϲ���
	        Scanner sc=new Scanner(System.in);
	        String s="";
	        String regex="(.+)@(.+)(.com)";
	            System.out.println("�����������ַ��");
	            s=sc.nextLine();
	            if (s.matches(regex)){
	                System.out.println("�����ַ��ȷ");
	            }
	            else{
	                System.out.println("�����ַ����ȷ");
	            }
	            String email = "roy@163.com";
	            String newamail = email.replace("roy", "smtp");
	            System.out.println(newamail);
	    }
}
