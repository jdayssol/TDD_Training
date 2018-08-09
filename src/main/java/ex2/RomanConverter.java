package ex2;

public class RomanConverter {

	public String convert(int entry) {
		String result ="";
		while(entry !=0)
		{
			for (digitToRomanEnum digitToRoman : digitToRomanEnum.values())
			{				
				if(entry >= digitToRoman.getDigit())
				{
					result = result + digitToRoman.getRoman();
					entry = entry - digitToRoman.getDigit();
					break;
				}
			}
		}		
		return result;
	}
	
	private enum digitToRomanEnum {	
		
		M("M",1000),
		CM("CM",900),
		D("D",500),
		CD("CD",400),
		C("C",100),
		XC("XC",90),
		L("L",50),
		XL("XL",40),
		X("X",10),
		IX("IX",9),
		V("V",5),
		IV("IV",4),
		I("I",1);
		
		private int digit;
		private String roman;
		
		digitToRomanEnum(String roman,int digit){
			this.roman=roman;
			this.digit = digit;
		}
		
		public int getDigit() {
			return digit;
		}

		public String getRoman() {
			return roman;
		}
	}
}
