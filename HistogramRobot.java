class HistogramPrinter extends Object {

	public void printHistogram(int[] nums) {
		for (int j = 0; j < nums.length; ++j) {
			this.printRow(nums[j]);
		}
	}

	public void printRow(int width) {

		for (int i = 0; i < width; ++i) {
			System.out.print("*");
		}
		System.out.println(" "); // Drop down to the next line

	}
}
