package dev.kotlinautas.twitch4k.components

import java.nio.ByteBuffer
import java.nio.charset.Charset

object TwitchMessages {

    fun passMessage(password: String): String {
        return "PASS $password\r\n"
    }

    fun nickMessage(username: String): String {
        return "NICK $username\r\n"
    }

    fun joinMessage(channel: String): String {
        return "JOIN #$channel\r\n"
    }

    fun membershipCapability(): String {
        return "CAP REQ :twitch.tv/membership\r\n"
    }

    fun membershipTags(): String {
        return "CAP REQ :twitch.tv/tags\r\n"
    }

    fun membershipCommands(): String {
        return "CAP REQ :twitch.tv/commands\r\n"
    }

    fun pongMessage(text:String): String {
        return "PONG $text\r\n"
    }

    fun privMessage(channel:String, message:String): String {
        return "PRIVMSG #$channel :$message\r\n"
    }

}