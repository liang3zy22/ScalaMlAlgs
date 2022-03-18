package org.liang.sparknumerai
import org.apache.spark.sql.{DataFrame, Row}
import scala.collection.mutable.HashMap
import java.util.List
object SparkUtil {

  def DfToMap(InputDF: DataFrame) ={
    val cols = InputDF.columns.toList
    var HashMapDf = new HashMap[String, List[Row]]
    for(col <- cols) {
        val datas  = InputDF.select(InputDF.col(col)).collectAsList()
      HashMapDf.addOne((col, datas))
    }
    HashMapDf
  }

  def DfToList()={


  }

}
