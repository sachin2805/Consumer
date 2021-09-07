//---------------Using Inner Anynomous class ----------
package consumer;

import java.util.function.Consumer;
public class Test_Consumer1 {

	public static void main(String[] args) {
		Consumer<Integer> c1=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				
				System.out.println(t);
			}

			
		};
		Consumer<Integer> c2=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				
				System.out.println(t);
			}

			
		};
		c1.accept(10);
		c2.accept(-50);

	}

}
/*OUTPUT :
10
-50
*/