
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName��   Daffodil
 * FileName: Daffodil.java
 * Author:   ��
 * Date:     2013-1-26 ����11:51:58  
 * Version :
 * Description:ˮ�ɻ�������ν"ˮ�ɻ���"��ָһ����λ�������λ����
 * �����͵��ڸ����������153=��Ϊ153=1�����η���5�����η���3�����η��� 
 **********************************************************/
package com.trf;

public class Daffodil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judgement jud = new Judgement();
		
		jud.judge();
	}

}
class Judgement{
	public void judge(){
		int i, n, i1, i2, i3;
		
		for(i = 100; i <= 999; i++){
			n = i;
			i1 = n % 10;
			 n = n / 10;
			i2 = n % 10;
			 n = n / 10;
			i3 = n % 10;
			if(Math.pow(i1, 3) + Math.pow(i2, 3) + Math.pow(i3, 3) == i)
				System.out.print(i+" ");
		}
	}
}