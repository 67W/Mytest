package module11.practice

sealed class BattleState {
    data class Progress(val firstTeamCount: Int, val secondTeamCount: Int) : BattleState()
    object WinFirst : BattleState()
    object WinSecond : BattleState()
    object Draw : BattleState()
}