package com.example.ai

/**
 * Study-assistance abstraction.
 * Keep provider credentials out of the Android client.
 */
class GeminiStudyService {
    suspend fun ask(prompt: String): String = "Study assistance is currently unavailable."
}
