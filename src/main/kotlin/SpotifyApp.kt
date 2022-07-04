import enums.SpotifyMenu
import feature.CredentialFeature
import java.util.Scanner

private val scn = Scanner(System.`in`)
private lateinit var credentialFeature: CredentialFeature

fun main() {
    setup()
    welcome()
}

fun welcome(){
    println("Selamat Datang Di Spotify")
    println("1. Login")
    println("2. Profile")
    print("Pilih menu:")

    val selectMenu = scn.nextLine()

    when (scn.nextLine()) {
        SpotifyMenu.LOGIN.id -> {
            println(SpotifyMenu.LOGIN.desc)
            credentialFeature.login()
        }
        SpotifyMenu.PROFILE.id -> {
            println(SpotifyMenu.PROFILE.desc)
            credentialFeature.getProfile()
        }
        else -> println("Kode input tidak dapat diproses")
    }
}

fun setup() {
    credentialFeature = CredentialFeature(scn)
}