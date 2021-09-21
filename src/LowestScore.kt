                 fun main(){
                     val scores = arrayOf(20,45,87,76,45)
                     var lowest = scores[0]

                     for (score in scores){
                         if (score <lowest){
                             lowest =score
                         }
                     }
                     println(lowest)
                 }