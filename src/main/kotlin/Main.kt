import kotlin.random.Random

val herois = listOf("Gigante", "Cavalheiro", "Príncipe", "Zeus", "Zamborian", "Zion")

fun main() {
    val xpHeroi1 = Random.nextInt(1, 15000) // XP aleatório entre 1 e 14999

    println("Os seus heróis são: $herois")

    for ((index, heroi) in herois.withIndex()) {
        println("${index + 1}. $heroi")
    }

    println("Digite o número do primeiro herói desejado: ")
    val opcaoHeroi1 = readLine()?.toIntOrNull()

    if (opcaoHeroi1 != null && opcaoHeroi1 > 0 && opcaoHeroi1 <= herois.size
    ) {
        val heroiSelecionado1 = herois[opcaoHeroi1 - 1]

        val nivelHeroi1 = determinarNivel(xpHeroi1)

        println("O Herói de nome $heroiSelecionado1 está no nível de $nivelHeroi1 com $xpHeroi1 XP")
    } else {
        println("Opção inválida. Por favor, selecione números válidos para os heróis.")
    }
}

fun determinarNivel(xp: Int): String {
    return when {
        xp < 1000 -> "Ferro"
        xp in 1001..2000 -> "Bronze"
        xp in 2001..5000 -> "Prata"
        xp in 6001..7000 -> "Ouro"
        xp in 7001..8000 -> "Platina"
        xp in 8001..9000 -> "Ascendente"
        xp in 9001..10000 -> "Imortal"
        xp >= 10001 -> "Radiante"
        else -> "Nível indefinido"
    }
}
