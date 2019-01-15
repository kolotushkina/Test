public class Test {

	/*
	 * One of methods to define which version is more later is to split versions
	 * by point symbol and compare contents of returned arrays 
	 * Date: 14/01/2019
	 * Author: Safiullin R.
	 */
	public static void main(String[] args) {

		String softwareVersion1 = "8.1.03.1256.";
		String softwareVersion2 = "8.1.003.000125";

		String softwareVersion1Splitted[] = softwareVersion1.split("\\.");
		String softwareVersion2Splitted[] = softwareVersion2.split("\\.");

		try {
			for (int i = 0; i < softwareVersion1Splitted.length; i++) {
				if ((Integer.parseInt(softwareVersion1Splitted[i])) > (Integer.parseInt(softwareVersion2Splitted[i]))) {
					System.out.println(softwareVersion1 + " version is later than " + softwareVersion2 + " version");
					break;
				} else if ((Integer.parseInt(softwareVersion1Splitted[i])) < (Integer.parseInt(softwareVersion2Splitted[i]))) {
					System.out.println(softwareVersion2 + " version is later than " + softwareVersion1 + " version");
					break;
				} else if (i == softwareVersion1Splitted.length - 1) {
					System.out.println(softwareVersion2 + " version is equal to " + softwareVersion1 + " version");
					break;
				}
			}
		} catch (IndexOutOfBoundsException IE) {// the program will go to this block only if version points aren't equal
			if (softwareVersion1Splitted.length > softwareVersion2Splitted.length) {
				System.out.println(softwareVersion1 + " version is later than " + softwareVersion2 + " version");
			} else {
				System.out.println(softwareVersion2 + " version is later than " + softwareVersion1 + " version");
			}
		}
	}
}
