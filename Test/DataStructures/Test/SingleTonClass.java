package Test;

public class SingleTonClass {

	public static void main(String[] args) {
		
		ABC obj = ABC.getInstance();
		

	}
	
	 class ABC{
		
		static final ABC obj = new ABC();
		
		private ABC(){
			
			
			
		}
		public ABC getInstance() {
			return obj;
		}
	}

}
