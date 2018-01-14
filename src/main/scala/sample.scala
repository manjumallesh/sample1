/**
  * Created by manjunatha.m on 1/1/2018.
  */

import scala.io.Source

object sample {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println(("Please enter filename"))
  }
}
