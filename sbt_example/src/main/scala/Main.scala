import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readInt

object example {
    def main(args: Array[String]) =
        val arr = ArrayBuffer.fill(5)(0)
        println("\n\nInitial Type")
        println(arr)

        // Take input of arr from user
        for
            i <- 0 to 4
        do
            print("Val: ")
            arr(i) = readInt()

        println("\n\nWith User Input")
        println(arr)

        // scalar multiply the arr by 3
        val arr2 =
            for
                i <- 0 to 4
            yield
                arr(i) * 3

        println("\n\nType of arr2 after yeild")
        println(arr2)

        // convert to ArrayBuffer from vector type
        val arr3 = arr2.to(ArrayBuffer)

        println("\n\nType of arr2 after casting returned to ArrayBuffer")
        println(arr3)

}