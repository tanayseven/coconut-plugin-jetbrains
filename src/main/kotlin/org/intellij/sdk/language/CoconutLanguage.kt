package org.intellij.sdk.language

import com.intellij.lang.Language

class CoconutLanguage: Language("Coconut") {
    companion object {
        val INSTANCE: CoconutLanguage = CoconutLanguage()
    }
}
