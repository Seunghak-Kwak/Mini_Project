/*package com.javaya.service;

import com.javaya.dao.*;
import com.javaya.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

   //고객 정보를 저장할 자료구조 선언
   //static ArrayList<Customer> custList = new ArrayList<>();
   //static ArrayList<CustomerVIP> vipcustList = new ArrayList<>();

   //리스트 정보를 조회하기 위해 인덱스를 필요로 함
   //static int index = -1;  

   //static int count = 0;//custList.size()

   //기본 입력장치로부터 데이터를 입력받기 위해 Scanner객체 생성
   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
	  ArrayList<Customer> custList = new ArrayList<>();
	  ArrayList<CustomerVIP> vipcustList = new ArrayList<>();
	  int index = -1;
	  int count = 0;
	  
	  Insert insertCustomer = new Insert();
	  
      while(true) { // while 계속 돌아가도록
         count = custList.size();
         System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
         System.out.println("메뉴를 입력하세요.");
         System.out.println("(I)nsert, (P)revious, (N)ext, " +
               "(C)urrent, (U)pdate, (E)nrollVIP, (V)ipList, (D)elete, (A)Allprint, (Q)uit");
         System.out.print("메뉴 입력: ");
         String menu = scan.next();
         menu = menu.toLowerCase();   //입력한 문자열을 모두소문자로 변환
         switch(menu.charAt(0)) {
         case 'i':
            System.out.println("고객정보 입력을 시작합니다.");
  	        //고객 객체를 ArrayList에 저장
            custList.add(insertCustomer.insertCustomerData());
            System.out.println("고객정보를 입력했습니다.");
            break;
         case 'p' :
            System.out.println("이전 데이터를 출력합니다.");
            if(index <= 0) {
               System.out.println("이전 데이터가 존재하지 않습니다.");
            }else {
               index--;
               Print printCustomer = new Print(custList,index);
               printCustomer.printCustomerData();
            }
            break;
         case 'n' :
            System.out.println("다음 데이터를 출력합니다.");
            if(index >= count-1) {
               System.out.println("다음 데이터가 존재하지 않습니다.");
            }else {
               index++;
               Print printCustomer = new Print(custList,index);
               printCustomer.printCustomerData();
            }
            break;
         case 'c' :
            System.out.println("현재 데이터를 출력합니다.");
            if( (index >= 0) && (index < count)) {
            	Print printCustomer = new Print(custList,index);
            	printCustomer.printCustomerData();
            }else {
               System.out.println("출력할 데이터가 선택되지 않았습니다.");
            }
            break;
         case 'u' :
            System.out.println("데이터를 수정합니다.");
            if( (index >= 0) && (index < count)) {
               System.out.println(index + "번째 데이터를 수정합니다.");
               Update updateCustomer = new Update(custList,index);
               updateCustomer.updateCustomerData();
            }else {
               System.out.println("수정할 데이터가 선택되지 않았습니다.");
            }
            break;
         case 'e' :
        	System.out.println("VIP 등록 절차");
        	if( (index >= 0) && (index < count)) {
                System.out.println(index + "번째 데이터를 VIP등록합니다.");
                VIPenroll vipCustomer = new VIPenroll(custList,index);
                vipcustList.add(vipCustomer.register());
                System.out.println("VIP 등록 완료");
        	}else {
                System.out.println("VIP등록할 데이터가 선택되지 않았습니다.");
             }
             break;
         case 'v' :
        	 System.out.println("VIP 리스트를 출력합니다");
        	 VIPenroll viplist = new VIPenroll(vipcustList);
        	 viplist.printVIPlist();
        	 break;
         case 'd' :
            System.out.println("데이터를 삭제합니다.");
            if( (index >= 0) && (index < count)) {
               System.out.println(index + "번째 데이터를 삭제합니다.");
               Delete deleteCustomer = new Delete(custList,index);
               custList = deleteCustomer.deleteCustomerData();
            }else {
               System.out.println("삭제할 데이터가 선택되지 않았습니다.");
            }
            break;
         case 'a':
             System.out.println("정보 전체를 출력합니다.");
             Print printCustomer = new Print(custList,count);
             printCustomer.printAllCustomer();
             break;
         case 'q' :
            System.out.println("프로그램을 종료합니다.");
            scan.close();   //Scanner 객체를 닫아준다.
            System.exit(0);   //프로그램을 종료시킨다.
            break;   
         default : 
            System.out.println("메뉴를 잘 못 입력했습니다.");   
         }//end switch
      }//end while
   }//end main
    
}//end class*/