package org.example.learnkmp


import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.createSupabaseClient


object SupabaseClientInstance {
private const val SUPABASE_URL = "https://akjkxwztzusccdpxbxwt.supabase.co"
private const val SUPABASE_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFramt4d3p0enVzY2NkcHhieHd0Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzcyMjU1NjEsImV4cCI6MjA1MjgwMTU2MX0.HmDDrqwaFQ9sOveqabuCGTaJWFdCCTlW01Tb3OTR0Uc"

    val supabase: SupabaseClient by lazy {
        createSupabaseClient(SUPABASE_URL, SUPABASE_KEY) {
            install(Auth) {
                host = "auth"
                scheme = "learnkmp"
            }
        }
    }

    val auth = supabase.auth


}