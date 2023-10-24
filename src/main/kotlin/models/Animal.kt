package models

/**
 *
 * @author Nurzhan Aitbayev github.com/nurzhanme
 */
open class Animal {
    var name: String = ""

    open fun move(speed: Int) {
        // Implementation for the move function
    }

    open fun speak(): String {
        return ""
    }
}