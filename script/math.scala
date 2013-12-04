/*@author : haoyuan.huhy
  @mail : haoyuan.huhy@gmail.com
 */
import math.log
def entro(x : Int) : Double = x * log(x)
(1 to 4).map(entro).reduceLeft(_+_)