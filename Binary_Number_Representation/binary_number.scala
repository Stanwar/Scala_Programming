import scala.collection.mutable.ListBuffer
// Simple Program to display number in binary form 
object binary_number {
	def main(args: Array[String]): Unit = {
		println("Binary Representation of Numbers");

		var number :Int = 40;

		//var ar:ArrayBuffer = new ArrayBuffer();

		var ar = new ListBuffer[Int]

		binary(number);
	}

	def binary(n: Int){

		if(n > 1){
			binary(n/2)
		}
		println(n%2)
		

	}
}
