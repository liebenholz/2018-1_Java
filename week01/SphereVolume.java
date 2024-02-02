public class SphereVolume {
	public static void main(String[] args) {
		double pi = 3.14;            //원주율
		double r = 5.0;              //밑면 반지름 길이
		double v = 4.0/3.0*pi*r*r*r; //원기둥 부피
		System.out.println("구의 부피는 " + v + "입니다.");
	}
}