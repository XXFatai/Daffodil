
/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName：   Daffodil
 * FileName: Daffodil.java
 * Author:   润发
 * Date:     2013-1-26 上午11:51:58  
 * Version :
 * Description:水仙花数，所谓"水仙花数"是指一个三位数，其各位数字
 * 立方和等于该数本身比如153=因为153=1的三次方＋5的三次方＋3的三次方。 
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