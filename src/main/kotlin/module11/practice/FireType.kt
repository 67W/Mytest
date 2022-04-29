package module11.practice

sealed class FireType {
    object Oneshot : FireType()
    data class BurstFire(val size: Int) : FireType()
}
