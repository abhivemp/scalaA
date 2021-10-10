// Example program that we went over in class that uses the yield keyword

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readInt

object scalayield {
    def main(args: Array[String]) = 
        val sample = ArrayBuffer(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
        var count = 0
        val retVal = (
            for
                i <- sample
                if i % 2 == 0
            yield
                count = count + 1
        ).to(ArrayBuffer)
      
}