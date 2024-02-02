public class WholeSalesCost {
	public static void main(String[] args) {
		double CP = 24.95; //정가
		double DR = 0.4;   //할인율
		double ISC = 3.0;  //초판 배송료
		double ASC = 0.75; //추가 배송료 (권당)
		int q = 60;        //주문 수량 (권)
		
		double BC = CP*(1.0-DR)*q;     //책값
		double SC = ISC + (q - 1)*ASC; //배송료
		double tot = BC+SC;            //총 가격
		
		System.out.println("총 구매 가격은 " + tot + "입니다.");
		System.out.printf("총 구매 가격은 %.2f입니다.",tot);
	}
}