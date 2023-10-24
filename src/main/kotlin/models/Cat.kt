package models

/**
 *
 * @author Nurzhan Aitbayev github.com/nurzhanme
 */
class Cat : Animal() {
    var numberOfLegs: Int = 4

    override fun speak(): String {
        return "Meow"
    }
}