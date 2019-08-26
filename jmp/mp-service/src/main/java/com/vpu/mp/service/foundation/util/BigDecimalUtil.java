package com.vpu.mp.service.foundation.util;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 	扩展BigDecimal
 * @author 王帅
 *
 */
public class BigDecimalUtil {
	static public enum Operator {
		//乘法
		multiply
		//除法
		,Divide
	}
	/**
	 * 	比较左右值,如为null默认取0,比较的是数学上的有效数字
	 * eg:(0,1)->-1;(1,1)->0;(1,0)->1
	 * @param left
	 * @param right
	 * @return int[result] = {-1,0,1}
	 */
	static public int compareTo(BigDecimal left , BigDecimal right) {
		left = left == null ? BigDecimal.ZERO.setScale(2 , BigDecimal.ROUND_HALF_UP) : left;
		right = right == null ? BigDecimal.ZERO.setScale(2 , BigDecimal.ROUND_HALF_UP) : right;
		return left.compareTo(right);
	}
	
	/**
	 * BigDecimal乘法：精度保留小数点后两位，采取四舍五入
	 * @param left	null->zero
	 * @param right null->zero
	 * @return
	 */
	static public BigDecimal multiply(BigDecimal left , BigDecimal right) {
		left = left == null ? BigDecimal.ZERO.setScale(2 , BigDecimal.ROUND_HALF_UP) : left;
		right = right == null ? BigDecimal.ZERO.setScale(2 , BigDecimal.ROUND_HALF_UP) : right;
		return left.multiply(right).setScale(2 , BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * BigDecimal除法：精度保留小数点后两位，采取四舍五入
	 * @param left=null->zero
	 * @param right=null throw Exception 
	 * @return
	 */
	static public BigDecimal divide(BigDecimal left , BigDecimal right) throws ArithmeticException{
		left = left == null ? BigDecimal.ZERO.setScale(2 , BigDecimal.ROUND_HALF_UP) : left;
		if(right == null || compareTo(right, null) < 1) {
			throw new ArithmeticException("Division by zero");
		}
		right = right.setScale(2 , BigDecimal.ROUND_HALF_UP);
		return left.divide(right,2 , BigDecimal.ROUND_HALF_UP).setScale(2 , BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * 	支持按照bigDecimals数组顺序进行乘除运算，精度保留小数点后两位，采取四舍五入
	 * @param bigDecimals BigDecimalPlus类属性为value（值）与operator（该值与其后一位的运算符）
	 * @return
	 */
	static public BigDecimal multiplyOrDivide(BigDecimalPlus...bigDecimals) {
		if(bigDecimals == null || bigDecimals.length < 2) {
			throw new IllegalArgumentException("method param Illegal,The parameter length should be greater than or equal to two.");
		}
		BigDecimalPlus left = bigDecimals[0];
		
		for (int i = 1 , n = bigDecimals.length ; i < n ; i++) {
			left.toOperator(bigDecimals[i]);
		}
		return left.getValue();
		
	}
	
	@Data
	static public class BigDecimalPlus {
		private BigDecimal value;
		private Operator operator;
		public BigDecimalPlus(BigDecimal bigDecimal , Operator operator) {
			this.value = bigDecimal;
			this.operator = operator;
		}
		public BigDecimalPlus toOperator(BigDecimalPlus bigDecimalPlus) {
			if(operator == null) {
				throw new IllegalArgumentException("non-last parameter must be input operator");
			}
			switch (operator) {
			case multiply:
				value = BigDecimalUtil.multiply(value, bigDecimalPlus.value);
				break;
			case Divide:
				value = BigDecimalUtil.divide(value, bigDecimalPlus.value);
				break;
			default:
				throw new IllegalArgumentException("method param Illegal,BigDecimalPlus object field operator must be an Operator enum type.");
			}
			operator = bigDecimalPlus.getOperator();
			return this;
		}
		public static void main(String[] args) {
			BigDecimal multiplyOrDivide = multiplyOrDivide(new BigDecimalPlus(new BigDecimal("1"),Operator.Divide),
					new BigDecimalPlus(new BigDecimal("3"),Operator.multiply),
					new BigDecimalPlus(new BigDecimal("3"),null)
					);
			System.out.println(multiplyOrDivide);
		}
	}
	
}
