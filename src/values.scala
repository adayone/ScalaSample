/*
   Scala has a rich set of value types, and a rich literal syntax to
   support them.
 */


// Integers:
val anInt = 3
println( anInt )

// Floating point:
val aDouble = 4.0
println( aDouble )


// Charaters:
val aCharacter = 'c'
println( aCharacter )


// Strings:
val aString = "Google"
println( aString )


// Symbols:
// Symbols is fast than String as the same string is unique
val aSymbol = 'foo
println( aSymbol )


// XML:
val anXMLElement = <a href="http://www.google.com/">{aString}</a>
println( anXMLElement )


// Tuples:
val aPair = (aString,aDouble)
println( aPair )


// Lists:
val aList = List(1,2,3,4)
println( aList )

// Ranges:
val aRange = 1 to 5
println( aRange )


// Maps:
val aMap = Map(3 -> "foo", 4 -> "bar")
println( aMap )


// Sets:
val aSet = Set(8,9,10)
println( aSet )

// Arrays:
val anArray = Array(1,2,3,5)
println( anArray )

// Unit:
val unit = ()
println( unit )


// Null:
val nullValue = null
println( nullValue )


// Functions:
def incImplicit(x : Int ) = x + 1

val incAnonymous = ((x : Int) => x + 1)