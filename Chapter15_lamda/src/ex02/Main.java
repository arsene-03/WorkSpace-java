package ex02;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = 0;
		
		IntBinaryOperator operator;
		
		//정적 메서드 참조
		//1. 일반적인 내용
		
		operator = (x,y)->{return Calc.staticMethod(x, y);};
		result = operator.applyAsInt(a, b);
		
		System.out.println("정적 메서드 참조 결과1 :"+result);
		
		
		//2. 메서드 참조형
		
		operator = Calc::staticMethod;
		result = operator.applyAsInt(a, b);
		
		System.out.println("정적 메서드 참조 결과2 :"+result);
		
		////////////////////////////////////////////////////////
		
		//일반 메서드 참조
		//1. 일반적인 내용
		
		Calc c = new Calc(4,7);
		operator = (x,y)->{return c.instanceMethod(x, y);};
		result = operator.applyAsInt(a, b);
		
		System.out.println("일반 메서드 참조 결과1 :"+result);
		
		
		//2. 메서드 참조형
		
		operator = c::instanceMethod;
		result = operator.applyAsInt(a, b);
		
		System.out.println("일반 메서드 참조 결과2 :"+result);
		
		////////////////////////////////////////////////////////////////////////
		
		//생성자 참조 : 생성자 -> 인스턴스를 만드는 것 -> 메서드의 일종 => 매개값 , 반환타입 => 인스턴스

		
		BiFunction<Integer,Integer,Calc>function;
		
		//1. 일반적인 내용
		
		function = (x,y)->{return new Calc(x,y);};
		Calc calc1 = function.apply(a, b);
			
		//2. 메서드 참조형
		
		function = Calc::new;
		Calc calc2 = function.apply(a, b);
		
		

	}

}
