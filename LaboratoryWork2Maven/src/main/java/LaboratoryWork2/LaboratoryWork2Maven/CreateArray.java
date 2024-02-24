package LaboratoryWork2.LaboratoryWork2Maven;

import java.util.ArrayList;

import LaboratoryWork2.LaboratoryWork2Maven.GeneratingNumber.GeneratingNumberClass;

public class CreateArray {
	public static void main(String[] arges) {
		new CreateArrayClass().CreateArrayResult();
	}
	
	public static class CreateArrayClass {
		
		public int[] CreateArrayResult() {
			GeneratingNumberClass GeneratingNumberClass = new GeneratingNumberClass();
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
			int[] array1 = new int[GeneratingNumberClass.getCountNumber()];
			arrayList1 = GeneratingNumberClass.GeneratingNumberResult();
			
			for (int i1 = 0; i1 < GeneratingNumberClass.getCountNumber(); i1++) {
				array1[i1] = arrayList1.get(i1);
			}
			return array1;
		}
	}
}
