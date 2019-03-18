public class Merge{
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
			if(temp)
		}
	}
}
