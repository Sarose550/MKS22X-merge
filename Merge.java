public class Merge{

	public static void main(String[] args){
		int[] stuff = new int[100];
		for(int i = 0; i < 100; i++){
			stuff[i] = (int)(100 * Math.random());
		}
		for(int x = 0; x < 100; x++){
			System.out.print(stuff[x] + " ");
		}
		System.out.println();
		mergesort(stuff);
		for(int y = 0; y < 100; y++){
			System.out.print(stuff[y] + " ");
		}
	}
	/*sort the array from least to greatest value. This is a wrapper function*/
	public static void mergesort(int[]data){
		int[] temp = new int[data.length];
		for(int i = 0; i < data.length; i++){
			temp[i] = data[i];
		}
		mergesortH(data, temp, 0, data.length);
	}

	public static void mergesortH(int[] data, int[] temp, int lo, int hi){
		if(lo >= hi) return;
		mergesortH(temp, data, lo, (lo + hi)/2);
		mergesortH(temp, data, (lo + hi)/2, hi);
		//now merge them from temp to data, since that's how it was called
		int a1 = lo;
		int a2 = (lo + hi) / 2;
		for(int i = lo; i < hi; i++){
			if(a2 < hi && a1 < (lo + hi) / 2){
				if(temp[a1] >= temp[a2]){
					data[i] = temp[a1];
					a1++;
				}
				if(temp[a1] < temp[a2]){
					data[i] = temp[a2];
					a2++;
				}
			}
			if(a2 >= hi){
				data[i] = temp[a1];
			}
			if(a1 >= (lo + hi) / 2){
				data[i] = temp[a2];
			}
		}
	}
}//infinite recursion seems to be the problem
