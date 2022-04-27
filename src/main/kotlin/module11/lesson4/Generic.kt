package module11.lesson4

import java.util.*

class Generic<T : Number>(value: T) {
    var item: T? = value
        private set
    val initializeDate = Date()
    fun setItem(newItem: T?) {
        item = newItem
    }
}