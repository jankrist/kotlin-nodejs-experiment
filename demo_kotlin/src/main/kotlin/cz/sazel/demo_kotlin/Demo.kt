package cz.sazel.demo_kotlin

/**
 * Simple class in Kotlin to show Node.js interoperability.
 */
class Demo {
    var fs: dynamic = require("fs")

    /**
     * Returns list of files in the curent directory.
     */
    fun test(): dynamic {

        //these lines are only for experimenting
        var test="abcd"
        var pokus="xyz_$test"
        var cirkus=arrayOf(test,pokus)
        var result=cirkus.filter { it -> it.startsWith("ab") }


        return fs.readdirSync(".")
    }
}