package module11.practice

import java.util.*

class GenericStack<T> : Stack<T>() {

    override fun push(item: T): T {
        return super.push(item)
    }

    override fun pop(): T? {
        return super.pop()
    }

    override fun isEmpty(): Boolean {
        return super.isEmpty()
    }
}
