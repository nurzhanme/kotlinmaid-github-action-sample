package models

/**
 *
 * @author Nurzhan Aitbayev github.com/nurzhanme
 */
class Dog : Animal() {
    var numberOfLegs: Int = 4

    override fun speak(): String {
        return "Bark"
    }
}