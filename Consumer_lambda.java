//--------------Using Lambda expression (OR Using both accept() , andThen() methods)  ----------
package consumer;

import java.util.function.Consumer;
public class Consumer_lambda {

	public static void main(String[] args) {
		Consumer<Integer> c1=(t)->System.out.println(t); //Without curliBreses"{}" - only one line to impliment
		Consumer<Integer> c2=(t)->{System.out.println(t+1);};  //"{}"-Use for multiple line
		Consumer<Integer> c3=(t)->System.out.println(t+2);
		Consumer<Integer> c4=(t)->System.out.println(t+3);
		Consumer<Integer> c5=(t)->System.out.println(t+4);
		Consumer<Integer> c6=(t)->System.out.println(t+5);
		
		
		System.out.println("--Using accept method--");
		c1.accept(10);
		c2.accept(-50);
		c3.accept(50);
		c4.accept(-70);
		c5.accept(0);
		c6.accept(80);
		System.out.println("--Using andThen method--");
		c6.andThen(c4.andThen(c5.andThen(c3.andThen(c1.andThen(c2))))).accept(20);

	}

}
/*OUTPUT
--Using accept method--
10
-49
52
-67
4
85
--Using andThen method--
25
23
24
22
20
21
*/