package com.example.gemini_chat_bot

import android.app.VoiceInteractor.Prompt
import android.graphics.Bitmap
import com.example.gemini_chat_bot.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)