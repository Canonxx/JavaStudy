package ��Ƶ��ϰ;

import java.util.Scanner;


public class ��Ŀ01 {
	    public static void main(String[] args) {
	        //����String���飬��Ϊÿһ��Ԫ�ظ�ֵ����ֵ����Ϊ�ڼ���+ѧϰ����
	        String[] contentList = new String[35];
	        contentList[0] = "����1�ܡ���������﷨����";
	        contentList[1] = "����2�ܡ�Java�﷨֮ѭ���������뷽��";
	        contentList[2] = "����3�ܡ��������֮��װ��̳�";
	        contentList[3] = "����4�ܡ��������֮����ģʽ���̬";
	        contentList[4] = "����5�ܡ����ù����ࣨ�ϣ�";
	        contentList[5] = "����6�ܡ����ù����ࣨ�£�";
	        contentList[6] = "����7�ܡ����ù����ࣨ�£�";
	        contentList[7] = "����8�ܡ�ǰ�˻���֮HTML��CSS";
	        contentList[8] = "����9�ܡ�ǰ�˻���֮JavaScript���ۺϰ���";
	        contentList[9] = "����10�ܡ�Java Web����";
	        contentList[10] = "����11�ܡ�Java Web����";
	        contentList[11] = "����12�ܡ����ù����������";
	        contentList[12] = "����13�ܡ�����������Ŀʵս";
	        contentList[13] = "����14�ܡ�����������Ŀʵս";
	        contentList[14] = "����15�ܡ�MySQL����";
	        contentList[15] = "����16�ܡ�MySQL����";
	        contentList[16] = "����17�ܡ�Java���ݿ⿪������";
	        contentList[17] = "����18�ܡ����ǰ��֪ʶ";
	        contentList[18] = "����19�ܡ�MyBatis����";
	        contentList[19] = "����20�ܡ�MyBatisʵ��OAϵͳ��Ŀʵս";
	        contentList[20] = "����21�ܡ�MyBatisʵ��OAϵͳ��Ŀʵս";
	        contentList[21] = "����22�ܡ�Linux�������RedisӦ��";
	        contentList[22] = "����23�ܡ�Spring����";
	        contentList[23] = "����24�ܡ�Spring����";
	        contentList[24] = "����25�ܡ�Spring����";
	        contentList[25] = "����26�ܡ�SSM�����罻��վ";
	        contentList[26] = "����27�ܡ�Spring Boot������Ŀʵս";
	        contentList[27] = "����28�ܡ�Spring Boot������Ŀʵս";
	        contentList[28] = "����29�ܡ�����";
	        
	        contentList[29] = "����30�ܡ����߳���ֲ�ʽ";
	        contentList[30] = "����31�ܡ����߳���ֲ�ʽ";
	        contentList[31] = "����32�ܡ�Spring Cloud����";
	        contentList[32] = "����33�ܡ�Spring Cloud����ʵս";
	        contentList[33] = "����34�ܡ�Spring Cloud����ʵս";
	        contentList[34] = "����35�ܡ�Zookeeper+DubboӦ��������";

	        //��ʾ��Ϣ
	        System.out.print("��Ҫ��ʼ�ڼ���ѧϰ��,ֱ���������ְ�:");
	        //���ñ����洢���յ�������
	        Scanner input= new Scanner(System.in);
	        //��������Ǽ���(1-�µ�һ�ܡ�4-�µ�4��)
	        int m =input.nextInt();
	        int month = (m-1)/4;
	        
	        //�����������������µĵڼ���
	        int week = (m-1)%4;
	        input.close();
	        //��ʾ��Ϣ
	        System.out.println("�����������µ�ѧϰ�ƻ�, �� ������ѧϰ����");
	        System.out.println("=======================================");
	        
	        
	        //����forѭ�����ҵ������ж�Ӧ����µ��������
	        for(int i=0;i<4;i++) {
	        	if(i!=week) {
	        	
	        		System.out.println(contentList[month*4+i]);
	        	} else {
	        		System.out.println("��"+contentList[month*4+i]);
	        	}
	        }
	            //���ݵ�ǰ�µڼ��ܣ����������ʱ��ǰ����ӡ��̡�
	    }

	    
}
