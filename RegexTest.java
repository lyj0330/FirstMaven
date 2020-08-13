package FirstJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {


	    public static void main(String[] args) {
	        //写好正则表达式，用于验证某些字符串是否符合规则
	        Scanner sc=new Scanner(System.in);
	        String s="";
	        String regex="(.+)@(.+)(.com)";
	            System.out.println("请输入邮箱地址：");
	            s=sc.nextLine();
	            if (s.matches(regex)){
	                System.out.println("邮箱地址正确");
	            }
	            else{
	                System.out.println("邮箱地址不正确");
	            }
	            String email = "roy@163.com";
	            String newamail = email.replace("roy", "smtp");
	            System.out.println(newamail);
	    }
}
