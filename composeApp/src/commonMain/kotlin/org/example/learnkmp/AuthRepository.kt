package org.example.learnkmp

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.AuthProvider
import io.github.jan.supabase.auth.providers.Google


object AuthRepository {
    private val auth = SupabaseClientInstance.auth

    suspend fun signInWithGoogle() {
        try {
            auth.signInWith(Google)
            println("Sign in with Google")
        } catch (e: Exception) {
            println("Error signing in with Google: $e")
        }
    }


}

